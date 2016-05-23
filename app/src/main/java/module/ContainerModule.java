package module;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 2016/5/23.
 */
@Module
public class ContainerModule {
    @Provides
    ShoppingCartModel provideCartModel() {
        return new ShoppingCartModel();
    }
}
