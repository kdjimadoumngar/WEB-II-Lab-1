package kim_ndor.com.mobileappkim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity implements View.OnClickListener{
    Button bSignup;
    EditText etName, etGender, etUniversity, etAge, etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        etName = (EditText) findViewById(R.id.etName);
        etGender = (EditText) findViewById(R.id.etGender);
        etUniversity = (EditText) findViewById(R.id.etUniversity);
        etAge = (EditText) findViewById(R.id.etAge);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bSignup = (Button) findViewById(R.id.bSignup);
        bSignup.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bSignup:

                break;
        }
    }
}

