package jaihind.gobblessamerica.taskmaster.di;

import android.content.Context;
import android.net.ConnectivityManager;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.auth.FirebaseAuth;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import jaihind.gobblessamerica.taskmaster.MainActivity;
import jaihind.gobblessamerica.taskmaster.R;


/**
 * Created by nande on 6/11/2017.
 */
@Module
public class FirebaseModule {
    private final Context context;

    public FirebaseModule(Context context) {
        this.context = context;
    }

    @Provides
    public FirebaseAuth provideFirebaseAuth(){

        FirebaseAuth auth= FirebaseAuth.getInstance();
        return auth;
    }


    @Provides
    public GoogleSignInOptions provideGoogleSignInOptions(){
        // Configure Google Sign In
        GoogleSignInOptions gsi= new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(context.getString(R.string.webclientid))
                .requestEmail()
                .build();
        // [END config_signin]

        return  gsi;
    }

    @Provides
    @Named("CheckConnection")
    public boolean provideCheckConnection() {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);

        return (cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnectedOrConnecting());
    }




}
