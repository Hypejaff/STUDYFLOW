package esaip.studyflow_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        CardView cardview1;
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_login);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //Fullscreen activity
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide(); //remove title bar
        overridePendingTransition(R.anim.fade_in_longtime, R.anim.fade_out_longtime); // Transition fade

        cardview1 = (CardView) findViewById(R.id.CardView1);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Thread MyThread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            sleep(200);
                            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                            finish();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();
                        }
                    }
                };
                MyThread.start();
                }
        });

    }
}
