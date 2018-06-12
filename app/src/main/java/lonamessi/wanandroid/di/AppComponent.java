package lonamessi.wanandroid.di;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;
import lonamessi.wanandroid.app.WanAndroidAPP;

/**
 * Created by gyp on 2018/6/12.
 */
@Singleton
@Component(modules = {AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,

})
public interface AppComponent {
    void inject(WanAndroidAPP wanAndroidAPP);
}
