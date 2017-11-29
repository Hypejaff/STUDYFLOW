package esaip.studyflow_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        CardView cardview_Profil;
        CardView cardview_Calendar;
        CardView cardview_Community;
        CardView cardview_Dashboard;
        //CardView cardview_Setting;
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //Fullscreen activity
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); //remove title bar
        overridePendingTransition(R.anim.fade_in_longtime, R.anim.fade_out_longtime); // Transition fade

        cardview_Community = (CardView) findViewById(R.id.CardView_Community);
        cardview_Community.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Thread MyThread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            sleep(200);
                            Intent intent = new Intent(getApplicationContext(),Community.class);
                            startActivity(intent);
                            finish();
                        } catch (InterruptedException e) {e.printStackTrace();}
                    }
                };
                MyThread.start();
            }
        });
        cardview_Dashboard = (CardView) findViewById(R.id.CardView_Storage);
        cardview_Dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Thread MyThread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            sleep(200);
                            Intent intent = new Intent(getApplicationContext(),Storage.class);
                            startActivity(intent);
                            finish();
                        } catch (InterruptedException e) {e.printStackTrace();}
                    }
                };
                MyThread.start();
            }
        });
        cardview_Profil = (CardView) findViewById(R.id.CardView_Profil);
        cardview_Profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Thread MyThread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            sleep(200);
                            Intent intent = new Intent(getApplicationContext(),Profil.class);
                            startActivity(intent);
                            finish();
                        } catch (InterruptedException e) {e.printStackTrace();}
                    }
                };
                MyThread.start();
            }
        });
        cardview_Calendar = (CardView) findViewById(R.id.CardView_Calendar);
        cardview_Calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Thread MyThread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            sleep(200);
                            Intent intent = new Intent(getApplicationContext(),Calendar.class);
                            startActivity(intent);
                            finish();
                        } catch (InterruptedException e) {e.printStackTrace();}
                    }
                };
                MyThread.start();
            }
        });
        /*cardview_Setting = (CardView) findViewById(R.id.CardView_Setting);
        cardview_Setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_setting = new Intent(this, SettingsActivity.class);
                startActivity(intent_setting);
            }
        });*/
    }

    public void CardView_Setting_onClick(View view){
        Intent intent_setting = new Intent(this, SettingsActivity.class);
        startActivity(intent_setting);
    }
}
