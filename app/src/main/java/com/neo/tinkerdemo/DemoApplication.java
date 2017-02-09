package com.neo.tinkerdemo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * 可以通过注解生成此类
 * Created by Neo on 2016/11/15.
 */

public class DemoApplication extends TinkerApplication implements IApplication{
    public DemoApplication(){
        super(//tinkerFlags, which types is supported
                //dex only, library only, all support
                ShareConstants.TINKER_ENABLE_ALL,
                // This is passed as a string so the shell application does not
                // have a binary dependency on your ApplicationLifeCycle class.
                "com.neo.tinkerdemo.DemoApplicationLike");
    }
    protected DemoApplication(int tinkerFlags) {
        super(tinkerFlags);
    }

    protected DemoApplication(int tinkerFlags, String delegateClassName, String loaderClassName, boolean tinkerLoadVerifyFlag) {
        super(tinkerFlags, delegateClassName, loaderClassName, tinkerLoadVerifyFlag);
    }

    protected DemoApplication(int tinkerFlags, String delegateClassName) {
        super(tinkerFlags, delegateClassName);
    }

    @Override
    public Object getManager(int serviceId) {
        return null;
    }

    @Override
    public Handler getMainHandler() {
        return null;
    }

    @Override
    public Handler getBgHandler() {
        return null;
    }

    @Override
    public Looper getBgLooper() {
        return null;
    }

    @Override
    public Context getContext() {
        return null;
    }
}
