package esaip.studyflow_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {
private ImageView Iview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_splash_screen);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //Fullscreen activity
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide(); //remove title bar

        Iview = (ImageView) findViewById(R.id.ImageV);
        final Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        Thread MyThread = new Thread() {
            @Override
            public void run() {
                try {
                    Iview.startAnimation(myanim);
                    sleep(5000);
                    Intent intent = new Intent(getApplicationContext(),Login.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        MyThread.start();
    }
}
