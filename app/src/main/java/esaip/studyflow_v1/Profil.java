package esaip.studyflow_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Profil extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_profil);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //Fullscreen activity
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_profil);
        getSupportActionBar().hide(); //remove title bar
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out); // Transition fade
    }
    @Override
    public void onBackPressed(){
            Thread MyThread = new Thread() {
                @Override
                public void run() {
                    try {
                        sleep(100);
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            MyThread.start();
    }

    public void CardView_onClick_ChangePassword(View view) {
        PasswordChange PassChange =  new PasswordChange();
        PassChange.show(getFragmentManager(),"Change");
    }
}
