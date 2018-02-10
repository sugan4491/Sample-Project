package extopont.sunya.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class RMActivity extends AppCompatActivity {

    private Button myFirstButton;
    private Button mysecondButton;
    private Button myThirdButton;
    private Button myFourthButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rm);
        myFirstButton = (Button) findViewById(R.id.btn_linear);
        mysecondButton = (Button) findViewById(R.id.btn_relative);
        myThirdButton = (Button) findViewById(R.id.click);
        myFourthButton = (Button) findViewById(R.id.rm);

        myFirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // mysecondButton.setText("Satyam");
                Toast.makeText(RMActivity.this, "CLICKED !!!!!!!", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(RMActivity.this, LinearLayoutActivity.class);
                startActivity(i);
            }
        });

        mysecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RMActivity.this, RelativeLayoutActivity.class);
                startActivity(i);

            }
        });

        myThirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bb = new Intent(RMActivity.this, LifeCycleActivity.class);
                startActivity(bb);

            }
        });

        myFourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aa = new Intent(RMActivity.this, LifeCycleActivity.class);
                startActivity(aa);
            }
        });


    }}