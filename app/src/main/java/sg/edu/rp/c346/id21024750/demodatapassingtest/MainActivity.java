package sg.edu.rp.c346.id21024750.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPassInteger;
    Button btnPassChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPassInteger = findViewById(R.id.buttonPassInteger);
        btnPassChar = findViewById(R.id.buttonPassChar);

        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);

                btnPassChar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                        intent.putExtra("value","a");
                        startActivity(intent);
                    }
                });
            }
        }
        );
    }}