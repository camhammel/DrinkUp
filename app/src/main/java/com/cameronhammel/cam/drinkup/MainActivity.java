package com.cameronhammel.cam.drinkup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText p1, p2, p3, p4, p5, p6;
    public static String[] players;
    Button ready;
    public static List finalplayers;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        players = new String[6];
        finalplayers = new ArrayList();

        p1 = findViewById(R.id.startP1);
        p2 = findViewById(R.id.startP2);
        p3 = findViewById(R.id.startP3);
        p4 = findViewById(R.id.startP4);
        p5 = findViewById(R.id.startP5);
        p6 = findViewById(R.id.startP6);
        ready = findViewById(R.id.readyup);

        ready.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(view.getContext(), GameSelect.class);
                players[0] = p1.getText().toString();
                players[1] = p2.getText().toString();
                players[2] = p3.getText().toString();
                players[3] = p4.getText().toString();
                players[4] = p5.getText().toString();
                players[5] = p6.getText().toString();


                for (int j=0; j<6; j++)
                {
                    if (! players[j].equals(""))
                    {
                        finalplayers.add(players[j]);
                    }
                }

                view.getContext().startActivity(i);
            }
        });
    }
}
