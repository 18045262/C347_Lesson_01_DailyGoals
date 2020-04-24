package sg.edu.rp.c346.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        String result1 = i.getStringExtra("select1");
        String result2 = i.getStringExtra("select2");
        String result3 = i.getStringExtra("select3");
        String et1 = i.getStringExtra("et1");

        TextView tv1 = findViewById(R.id.tvResult);
        tv1.setText(result1);
    }
}
