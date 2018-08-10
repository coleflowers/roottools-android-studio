package com.lovecode666.androidinfo;

/**
 * Created by coleflowers on 2018/8/8.
 * @copyright 爱写代码的小马
 * @link https://coleflowers.github.io
 */

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.lovecode666.androidinfo.tools.Root;
import com.stericson.RootTools.RootTools;

import java.io.File;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView root_v1 = (TextView)findViewById(R.id.root_v1);
        if(isRoot()){
            root_v1.setText("已经ROOT");
        } else {
            root_v1.setText("还没有ROOT");
        }

        TextView root_v2 = (TextView)findViewById(R.id.root_v2);
        if (new Root().isDeviceRooted()){
            root_v2.setText("已经ROOT");
        } else {
            root_v2.setText("还没有ROOT");
        }


        // https://github.com/softctrl/roottools
        TextView root_v3 = (TextView)findViewById(R.id.root_v3);
        if (RootTools.isRootAvailable()){
            root_v3.setText("已经ROOT");
        } else {
            root_v3.setText("还没有ROOT");
        }

        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlStr = "https://coleflowers.github.io";
                Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(urlStr));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }


    /**
     * 判断当前手机是否有ROOT权限
     * @link http://www.cnblogs.com/rayray/p/3229265.html
     * @return
     */
    public boolean isRoot(){
        boolean bool = false;

        try{
            if ((!new File("/system/bin/su").exists()) && (!new File("/system/xbin/su").exists())){
                bool = false;
            } else {
                bool = true;
            }
        } catch (Exception e) {

        }
        return bool;
    }
}
