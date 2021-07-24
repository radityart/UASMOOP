package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Battle battle = new Battle();
        battle.MakeArmy();
        final TextView playerName1 = findViewById(R.id.textView3);
        final TextView playerName2 = findViewById(R.id.playerName2);
        final TextView castleDetail1 = findViewById(R.id.heroDetail1);
        final TextView castleDetail2 = findViewById(R.id.heroDetail2);
        final TextView armyDetail1 = findViewById((R.id.armyDetail1));
        final TextView armyDetail2 = findViewById((R.id.armyDetail2));
        final TextView result = findViewById(R.id.Result);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int outcome = battle.Battle1();
                if (outcome == 1){
                    result.setText("Player One Wins!");

                }
                else if (outcome == 2){
                    result.setText("Player Two Wins!");

                }
                else {
                    result.setText("Draw !");
                }
                playerName1.setText("Player Three");
                playerName2.setText("Player Four");
                castleDetail1.setText("Steel Castle\nInfantry Hero");
                castleDetail2.setText("Steel Castle\nArcher Hero");
                armyDetail1.setText("30000 Infantries");
                armyDetail2.setText("5000 Archers \n 10000 Infantries");
                button2.setVisibility(View.GONE);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int outcome = battle.Battle2();
                if (outcome == 1){
                    result.setText("Player One Wins!");

                }
                else if (outcome == 2){
                    result.setText("Player Two Wins!");

                }
                else{
                    result.setText("Draw !");

                }
            }
        });
    }
}