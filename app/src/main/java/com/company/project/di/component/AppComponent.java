package com.company.project.di.component;

import android.app.Application;

import com.company.project.App;
import com.company.project.di.module.ActivityModule;
import com.company.project.di.module.AppModule;
import com.company.project.di.module.FragmentModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by Philippe on 02/03/2018.
 */

@Singleton
@Component(modules={ActivityModule.class, FragmentModule.class, AppModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    void inject(App app);
}
