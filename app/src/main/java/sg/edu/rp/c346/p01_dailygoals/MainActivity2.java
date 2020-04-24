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

        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        TextView tv3 = findViewById(R.id.tv3);
        TextView tv4 = findViewById(R.id.tv4);
        tv1.setText("Read up pon materials before class : " + result1);
        tv2.setText("Arrive on time so as not to miss important part of the lesson : " + result2);
        tv3.setText("Attempt the problem myself : " + result3);
        tv4.setText("Reflection : " + et1);

}
}
