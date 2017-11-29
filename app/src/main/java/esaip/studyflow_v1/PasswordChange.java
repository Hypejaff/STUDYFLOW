package esaip.studyflow_v1;

import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by arnau on 24/11/2017.
 */

public class PasswordChange extends DialogFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        final View v = inflater.inflate(R.layout.fragment_password_change, container, false);
        Button b = (Button) v.findViewById(R.id.button_passwordChange);
        final EditText NewPassword = (EditText) v.findViewById(R.id.editTextNewPassword);
        final EditText ConfirmPassword = (EditText) v.findViewById(R.id.editTextConfirmPassword);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Dialogue","Click");
                dismiss();
                Toast.makeText(getContext(),"Validate or Error",Toast.LENGTH_LONG).show();
            }
        });
        return v;
    }
}
