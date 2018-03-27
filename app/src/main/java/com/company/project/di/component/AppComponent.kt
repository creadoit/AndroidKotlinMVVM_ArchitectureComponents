package com.company.project.di.component

import android.app.Application
import com.company.project.App
import com.company.project.di.module.ActivityModule
import com.company.project.di.module.AppModule
import com.company.project.di.module.FragmentModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
 * Created by tim.wienrich on 27.03.18.
 */
@Singleton
@Component(modules = [ActivityModule::class, FragmentModule::class, AppModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}