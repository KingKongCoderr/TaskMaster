package jaihind.gobblessamerica.taskmaster.di;

import android.support.design.widget.NavigationView;

import javax.inject.Singleton;

import dagger.Component;
import jaihind.gobblessamerica.taskmaster.HomeFragment;
import jaihind.gobblessamerica.taskmaster.Navigationview;
import jaihind.gobblessamerica.taskmaster.authentication.GoogleSignin;
import jaihind.gobblessamerica.taskmaster.authentication.LoginActivity;

/**
 * Created by nande on 6/11/2017.
 */
@Component(modules= FirebaseModule.class)
@Singleton
public interface AuthenticationComponent {

   /* void inject(GoogleSignin googleSignin);
    void inject(Navigationview navigationView);
    void inject(HomeFragment homeFragment);*/
}
