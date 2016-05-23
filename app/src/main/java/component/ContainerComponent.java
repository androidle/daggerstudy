package component;

import com.thinkcoo.www.draggertest.ActivityComponent;
import com.thinkcoo.www.draggertest.MainActivity;

import dagger.Component;
import module.ContainerModule;

/**
 * Created by admin on 2016/5/23.
 */
@Component(dependencies = ActivityComponent.class,modules = ContainerModule.class)
public interface ContainerComponent {
    void inject(MainActivity activity);
}
