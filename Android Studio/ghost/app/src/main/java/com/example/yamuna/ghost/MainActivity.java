package com.example.yamuna.ghost;

import android.content.res.AssetManager;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String COMPUTER_TURN = "Computer's turn";
    private TextView ghostTextView, gameStatus;
    private Button restartButton, challengeButton;
    private boolean turn;
    private SimpleDictionary simpleDictionary;
    private String USER_TURN="Your Turn";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ghostTextView = findViewById(R.id.tv_ghostView);
        gameStatus = findViewById(R.id.tv_game_status);

        restartButton = findViewById(R.id.btn_restart);
        challengeButton = findViewById(R.id.btn_challenge);

        AssetManager assetManager = getAssets();
        try {
            simpleDictionary = new SimpleDictionary(assetManager.open("words.txt"));
        } catch (IOException iex) {
            iex.printStackTrace();
        }

        restart();
        challenge();
        begin();
    }

    private void begin() {
        turn = new Random().nextBoolean();
        if (turn) {
            //user
            gameStatus.setText("Your Turn!");
        } else {
            //computer
            gameStatus.setText("Computer's Turn!");
            computerTurn();
        }
    }

    private void computerTurn() {
        //Computer's Turn
        Log.v("Turn",COMPUTER_TURN);
        gameStatus.setText(COMPUTER_TURN);
        new Handler().postDelayed(()->{
           String ghostWord = ghostTextView.getText().toString();
           if(ghostWord.length()>=4 && simpleDictionary.isGoodWord(ghostWord)){
               gameStatus.setText("Computer Wins !!");
               challengeButton.setEnabled(false);
           }else {
               String computerWord = simpleDictionary.getGoodWord(ghostWord);
               if(computerWord == null){
                   gameStatus.setText(("Computer Wins!"));
                   challengeButton.setEnabled(false);
               }else{
                   ghostTextView.append(computerWord.charAt(ghostWord.length())+"");
                   turn = true;
                   gameStatus.setText(USER_TURN);
               }
           }
        }, 2000);

    }
    public void restart() {  //listen to touchables
        restartButton.setOnClickListener((view) -> {
            Log.v("restart", "restart button pressed");
        });
    }

    public void challenge() {
        challengeButton.setOnClickListener((view) -> {
            Log.v("challenge", "challenge button pressed");
        });
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if(turn){
            //user's turn
            turn = false;
            char userInput = (char) event.getUnicodeChar();
            if(Character.isLetter(userInput)){
                ghostTextView.append(Character.toString(userInput));
                computerTurn();
            }
        }

        return super.onKeyUp(keyCode, event);
    }


}
