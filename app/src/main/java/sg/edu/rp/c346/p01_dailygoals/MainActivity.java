package sg.edu.rp.c346.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btn = findViewById(R.id.btnOK);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioGroup rg1 = findViewById(R.id.radioGroup1);
                int selected1 = rg1.getCheckedRadioButtonId();
                final RadioButton rb1 = findViewById(selected1);
                String select1 = (String) rb1.getText().toString();


                RadioGroup rg2 = findViewById(R.id.radioGroup2);
                int selected2 = rg2.getCheckedRadioButtonId();
                RadioButton rb2 = findViewById(selected2);
                String select2 = (String) rb2.getText().toString();

                RadioGroup rg3 = findViewById(R.id.radioGroup3);
                int selected3 = rg3.getCheckedRadioButtonId();
                RadioButton rb3 = findViewById(selected3);
                String select3 = (String) rb3.getText().toString();

                EditText et = findViewById(R.id.editText);
                String et1 = et.getText().toString();

                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("select1", select1);
                i.putExtra("select2", select2);
                i.putExtra("select3", select3);
                i.putExtra("et1", et1);
                startActivity(i);

            }


        });
    }




}
