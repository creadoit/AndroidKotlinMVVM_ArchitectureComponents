package com.company.project.activities

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.company.project.R
import com.company.project.fragments.UserProfileFragment
import dagger.android.AndroidInjection
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

/**
 * Created by tim.wienrich on 27.03.18.
 */
class MainActivity : AppCompatActivity(), HasSupportFragmentInjector {

    companion object {
        val USER_LOGIN = "creadoit"
    }

    @Inject
    var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.configureDagger()
        this.showFragment(savedInstanceState)
    }

    override fun supportFragmentInjector(): DispatchingAndroidInjector<Fragment>? {
        return dispatchingAndroidInjector
    }

    // ---

    private fun showFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {

            val fragment = UserProfileFragment()

            val bundle = Bundle()
            bundle.putString(UserProfileFragment.UID_KEY, USER_LOGIN)
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, fragment, null)
                    .commit()
        }
    }

    private fun configureDagger() {
        AndroidInjection.inject(this)
    }
}