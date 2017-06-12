package jaihind.gobblessamerica.taskmaster.di;

import android.app.Application;

/**
 * Created by nande on 6/11/2017.
 */

public class ApplicationComponent extends Application {

    //private static AuthenticationComponent di;
    @Override
    public void onCreate() {
        super.onCreate();
      // di = DaggerAuthenticationComponent.builder().firebaseModule(new FirebaseModule(this)).build();

    }

   /* public static AuthenticationComponent getDi() {
        return di;
    }*/
}
