package jaihind.gobblessamerica.taskmaster.di;

import javax.inject.Singleton;

import dagger.Component;
import jaihind.gobblessamerica.taskmaster.mvp.view.HomeFragment;
import jaihind.gobblessamerica.taskmaster.mvp.view.Navigationview;
import jaihind.gobblessamerica.taskmaster.mvp.authentication.GoogleSignin;

/**
 * Created by nande on 6/11/2017.
 */
@Component(modules= FirebaseModule.class)
@Singleton
public interface AuthenticationComponent {

    void inject(GoogleSignin googleSignin);
    void inject(Navigationview navigationView);
    void inject(HomeFragment homeFragment);
}
