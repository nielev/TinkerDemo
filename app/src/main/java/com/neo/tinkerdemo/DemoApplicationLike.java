package com.neo.tinkerdemo;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.Log;

import com.tencent.tinker.anno.DefaultLifeCycle;
import com.tencent.tinker.lib.tinker.TinkerInstaller;
import com.tencent.tinker.loader.app.DefaultApplicationLike;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by Neo on 2016/11/3.
 */
//
//@DefaultLifeCycle(
//        application = "com.neo.tinkerdemo.DemoApplication",
//        flags = ShareConstants.TINKER_ENABLE_ALL
//)
public class DemoApplicationLike extends DefaultApplicationLike {
    private static final String TAG = "DemoApplicationLike";
    public DemoApplicationLike(Application application, int tinkerFlags, boolean tinkerLoadVerifyFlag, long applicationStartElapsedTime, long applicationStartMillisTime, Intent tinkerResultIntent, Resources[] resources, ClassLoader[] classLoader, AssetManager[] assetManager) {
        super(application, tinkerFlags, tinkerLoadVerifyFlag, applicationStartElapsedTime, applicationStartMillisTime, tinkerResultIntent, resources, classLoader, assetManager);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "this application create......");
    }

    @Override
    public void onBaseContextAttached(Context base) {
        super.onBaseContextAttached(base);
//        MultiDex.install(base);
        TinkerInstaller.install(this);
    }
}
