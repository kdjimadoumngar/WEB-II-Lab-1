package kim_ndor.com.mobileappkim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button bLogout;
    EditText etName, etGender, etUniversity, etCampus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = (EditText) findViewById(R.id.etName);
        etGender = (EditText) findViewById(R.id.etGender);
        etUniversity = (EditText) findViewById(R.id.etUniversity);
        etCampus = (EditText) findViewById(R.id.etCampus);

        bLogout = (Button) findViewById(R.id.bLogout);

        bLogout.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bLogout:

            break;
        }
    }
}
