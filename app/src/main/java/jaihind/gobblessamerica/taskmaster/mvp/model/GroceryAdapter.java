package jaihind.gobblessamerica.taskmaster.mvp.model;

/**
 * Created by ntankasala on 8/9/17.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import java.util.List;

import jaihind.gobblessamerica.taskmaster.mvp.model.GroceryItem;
import jaihind.gobblessamerica.taskmaster.R;

/**
 * Created by ntankasala on 7/1/17.
 */

public class GroceryAdapter extends RecyclerView.Adapter<GroceryAdapter.ViewHolder> {

    public List<GroceryItem> list;


    public GroceryAdapter(List<GroceryItem> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.grocery_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final GroceryItem obj = list.get(position);
        holder.mname_tv.setText(obj.getName());
        holder.mquantity_tv.setText(obj.getQuantity());
        holder.mdescription_tv.setText(obj.getDescription());
        holder.mavailability_switch.setChecked(obj.isAvailable());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView mname_tv, mdescription_tv, mquantity_tv;
        private Switch mavailability_switch;
        public ViewHolder(View itemView) {
            super(itemView);
            mname_tv = (TextView)itemView.findViewById(R.id.groceryItemName_tv);
            mdescription_tv = (TextView)itemView.findViewById(R.id.groceryItemDescription_tv);
            mquantity_tv = (TextView)itemView.findViewById(R.id.groceryItemQuantity_tv);
            mavailability_switch = (Switch)itemView.findViewById(R.id.groceryItem_switch);
        }
    }

}

