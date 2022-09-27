package uz.exemple.less62_task4_localisation_java;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;

import java.util.Locale;

import uz.exemple.less62_task4_localisation_java.manager.LocaleManager;

public class MyApplication extends Application {
    public static final String TAG = MyApplication.class.getSimpleName();
    public static MyApplication instance;
    public static LocaleManager localeManager;
   // private static RequestQueue requestQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        Context context = this;
        instance = this;
        localeManager = new LocaleManager(this);
        localeManager.setLocale(context);

        Log.d("###","Lokalisation - " + localeManager.getLocale(instance.getResources()));
        //initRealm();
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        localeManager.setLocale(this);
        Log.d(TAG, "### onConfigurationChanged: " + newConfig.locale.getLanguage());
    }

    /*private void initRealm() {
        Realm.init(this);

        RealmConfiguration config = new RealmConfiguration.Builder()
                .allowWritesOnUiThread(true)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(config);
    }

    public RequestQueue getRequestQueue() {
        if (requestQueue == null)
            requestQueue = Volley.newRequestQueue(this);
        return requestQueue;
    }

    public <T> void addToRequestQueue(Request<T> request) {
        request.setTag(TAG);
        getRequestQueue().add(request);
    }*/
}
