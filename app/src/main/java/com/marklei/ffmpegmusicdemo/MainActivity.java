package com.marklei.ffmpegmusicdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MarkPlayer player;
    private SurfaceView surfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        surfaceView = findViewById(R.id.surface);
        player = new MarkPlayer();
        player.setSurfaceView(surfaceView);
        surfaceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void player(View view) {
//        File file = new File(Environment.getExternalStorageDirectory(), "Warcraft3_End.avi");
        player.playJava("rtmp://live.hkstv.hk.lxdns.com/live/hks");
//        player.playJava(file.getAbsolutePath());
    }

    public void stop(View view) {
        player.release();
    }
}
