package com.neo.tinkerdemo;

import android.app.Activity;
import android.os.Environment;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.tencent.tinker.lib.tinker.TinkerInstaller;

import java.io.File;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String path = Environment.getExternalStorageDirectory().getAbsolutePath()+"/hotfix.hf";
        File file = new File(path);
        if(file.exists()){
            TinkerInstaller.onReceiveUpgradePatch(this.getApplication(), path);
        }else{
            Toast.makeText(this,"补丁不存在",Toast.LENGTH_SHORT).show();
        }


        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(R.string.app_text);

        findViewById(R.id.kill_app).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
    }
}
