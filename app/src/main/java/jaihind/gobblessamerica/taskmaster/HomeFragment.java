package jaihind.gobblessamerica.taskmaster;


import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import jaihind.gobblessamerica.taskmaster.di.ApplicationComponent;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {



   @BindView(R.id.quote_tv)
    TextView quote_tv;

    private Unbinder unbinder=null;


  /*  @Inject
    FirebaseAuth mAuth;*/

  FirebaseAuth mAuth;


    public HomeFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v=inflater.inflate(R.layout.fragment_home, container, false);
       // ApplicationComponent.getDi().inject(this);
        unbinder =  ButterKnife.bind(getActivity(),v);
        quote_tv= (TextView)v.findViewById(R.id.quote_tv);

        mAuth= FirebaseAuth.getInstance();
        String name="";
        FirebaseUser user = mAuth.getCurrentUser();
        if (user != null) {
            // Name, email address, and profile photo Url
            name = user.getDisplayName();
            String email = user.getEmail();
            Uri photoUrl = user.getPhotoUrl();

            // The user's ID, unique to the Firebase project. Do NOT use this value to
            // authenticate with your backend server, if you have one. Use
            // FirebaseUser.getToken() instead.
            String uid = user.getUid();
            quote_tv.setText(name);

        }


        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
