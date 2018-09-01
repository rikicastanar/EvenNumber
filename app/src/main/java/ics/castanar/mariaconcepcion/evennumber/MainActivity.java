package ics.castanar.mariaconcepcion.evennumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView textView = findViewById(R.id.textView);

                int x = 0;
                int i = 1;

                while (i <= 10) {
                    x += 2;
                    i++;
                    textView.append(x + ", ");


                }
            }
        });

    }

}

