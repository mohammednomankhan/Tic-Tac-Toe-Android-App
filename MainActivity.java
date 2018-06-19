package com.example.nauman.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    public int turn = 2;
    public int[] buttonused = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int[] p1won = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int[] p2won = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int flag=0;
    public int draw = 0;
    public int finishflag = 0;


    public int p1won()
    {
        if(p1won[0]==1 && p1won[1]==1 && p1won[2]==1)
        {
            flag=1;
            return 1;
        }

        else if(p1won[3]==1 && p1won[4]==1 && p1won[5]==1)
        {
            flag=2;
            return 1;
        }

        else if(p1won[6]==1 && p1won[7]==1 && p1won[8]==1)
        {
            flag=3;
            return 1;
        }

        else if(p1won[0]==1 && p1won[3]==1 && p1won[6]==1)
        {
            flag=4;
            return 1;
        }


        else if(p1won[1]==1 && p1won[4]==1 && p1won[7]==1)
        {
            flag=5;
            return 1;
        }


        else if(p1won[2]==1 && p1won[5]==1 && p1won[8]==1)
        {
            flag=6;
            return 1;
        }


        else if(p1won[0]==1 && p1won[4]==1 && p1won[8]==1)
        {
            flag=7;
            return 1;
        }


        else if(p1won[2]==1 && p1won[4]==1 && p1won[6]==1)
        {
            flag=8;
            return 1;
        }

        return 0;
    }

    public int p2won()
    {
        if(p2won[0]==1 && p2won[1]==1 && p2won[2]==1)
        {
            flag=1;
            return 1;
        }

        else if(p2won[3]==1 && p2won[4]==1 && p2won[5]==1)
        {
            flag=2;
            return 1;
        }

        else if(p2won[6]==1 && p2won[7]==1 && p2won[8]==1)
        {
            flag=3;
            return 1;
        }

        else if(p2won[0]==1 && p2won[3]==1 && p2won[6]==1)
        {
            flag=4;
            return 1;
        }


        else if(p2won[1]==1 && p2won[4]==1 && p2won[7]==1)
        {
            flag=5;
            return 1;
        }


        else if(p2won[2]==1 && p2won[5]==1 && p2won[8]==1)
        {
            flag=6;
            return 1;
        }


        else if(p2won[0]==1 && p2won[4]==1 && p2won[8]==1)
        {
            flag=7;
            return 1;
        }


        else if(p2won[2]==1 && p2won[4]==1 && p2won[6]==1)
        {
            flag=8;
            return 1;
        }

        return 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b1 = (Button) findViewById(R.id.button);
        final Button b2 = (Button) findViewById(R.id.button2);
        final Button b3 = (Button) findViewById(R.id.button3);
        final Button b4 = (Button) findViewById(R.id.button4);
        final Button b5 = (Button) findViewById(R.id.button5);
        final Button b6 = (Button) findViewById(R.id.button6);
        final Button b7 = (Button) findViewById(R.id.button7);
        final Button b8 = (Button) findViewById(R.id.button8);
        final Button b9 = (Button) findViewById(R.id.button9);
        final Button reset = (Button) findViewById(R.id.button10);

        final RadioButton radioButton1 = findViewById(R.id.radioButton);
        final RadioButton radioButton2 = findViewById(R.id.radioButton2);

        final TextView tx = findViewById(R.id.textView2);

        b1.setBackgroundColor(Color.LTGRAY);
        b2.setBackgroundColor(Color.LTGRAY);
        b3.setBackgroundColor(Color.LTGRAY);
        b4.setBackgroundColor(Color.LTGRAY);
        b5.setBackgroundColor(Color.LTGRAY);
        b6.setBackgroundColor(Color.LTGRAY);
        b7.setBackgroundColor(Color.LTGRAY);
        b8.setBackgroundColor(Color.LTGRAY);
        b9.setBackgroundColor(Color.LTGRAY);

        radioButton1.setClickable(false);
        radioButton2.setClickable(false);

        radioButton1.setChecked(true);
        radioButton1.setBackgroundColor(Color.GREEN);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(finishflag==0)
                {
                    if(buttonused[0]==0)
                    {
                        if(turn%2==0)
                        {
                            b1.setText("X");
                            turn++;
                            buttonused[0]=1;
                            p1won[0]=1;
                            draw++;

                            radioButton2.setBackgroundColor(Color.GREEN);
                            radioButton2.setChecked(true);

                            radioButton1.setBackgroundColor(Color.WHITE);
                            radioButton1.setChecked(false);

                            int r1 = p1won();
                            int r2 = p2won();

                            if (r1==1)
                            {
                                tx.setText(" Player 1 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if (r2==1)
                            {
                                tx.setText(" Player 2 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if(draw==9)
                            {
                                tx.setText("  Match Is Draw");
                            }
                        }
                        else
                        {
                            b1.setText("O");
                            turn++;
                            buttonused[0]=1;
                            p2won[0]=1;
                            draw++;

                            radioButton1.setBackgroundColor(Color.GREEN);
                            radioButton1.setChecked(true);

                            radioButton2.setBackgroundColor(Color.WHITE);
                            radioButton2.setChecked(false);

                            int r1 = p1won();
                            int r2 = p2won();

                            if (r1==1)
                            {
                                tx.setText(" Player 1 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if (r2==1)
                            {
                                tx.setText(" Player 2 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if(draw==9)
                            {
                                tx.setText("  Match Is Draw");
                            }
                        }
                    }

                    else
                    {
                        Toast.makeText(getApplicationContext(),"! This Button Is Used Allready !",Toast.LENGTH_SHORT).show();
                    }

                }

                else {
                    Toast.makeText(getApplicationContext(),"! Match Is Finished ! Click On Play Again !",Toast.LENGTH_SHORT).show();
                }
            }


        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(finishflag==0)
                {
                    if(buttonused[1]==0)
                    {
                        if(turn%2==0)
                        {
                            b2.setText("X");
                            turn++;
                            buttonused[1]=1;
                            p1won[1]=1;
                            draw++;
                            int r1 = p1won();
                            int r2 = p2won();

                            radioButton2.setBackgroundColor(Color.GREEN);
                            radioButton2.setChecked(true);

                            radioButton1.setBackgroundColor(Color.WHITE);
                            radioButton1.setChecked(false);

                            if (r1==1)
                            {
                                tx.setText(" Player 1 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if (r2==1)
                            {
                                tx.setText(" Player 2 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if(draw==9)
                            {
                                tx.setText("  Match Is Draw");
                            }
                        }
                        else
                        {
                            b2.setText("O");
                            turn++;
                            buttonused[1]=1;
                            p2won[1]=1;
                            draw++;
                            int r1 = p1won();
                            int r2 = p2won();

                            radioButton1.setBackgroundColor(Color.GREEN);
                            radioButton1.setChecked(true);

                            radioButton2.setBackgroundColor(Color.WHITE);
                            radioButton2.setChecked(false);

                            if (r1==1)
                            {
                                tx.setText(" Player 1 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if (r2==1)
                            {
                                tx.setText(" Player 2 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if(draw==9)
                            {
                                tx.setText("  Match Is Draw");
                            }
                        }
                    }

                    else
                    {
                        Toast.makeText(getApplicationContext(),"! This Button Is Used Allready !",Toast.LENGTH_SHORT).show();
                    }
                }

                else
                {
                    Toast.makeText(getApplicationContext(),"! Match Is Finished ! Click On Play Again !",Toast.LENGTH_SHORT).show();
                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(finishflag==0)
                {
                    if(buttonused[2]==0)
                    {
                        if(turn%2==0)
                        {
                            b3.setText("X");
                            turn++;
                            buttonused[2]=1;
                            p1won[2]=1;
                            draw++;
                            int r1 = p1won();
                            int r2 = p2won();

                            radioButton2.setBackgroundColor(Color.GREEN);
                            radioButton2.setChecked(true);

                            radioButton1.setBackgroundColor(Color.WHITE);
                            radioButton1.setChecked(false);

                            if (r1==1)
                            {
                                tx.setText(" Player 1 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if (r2==1)
                            {
                                tx.setText(" Player 2 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }
                            else if(draw==9)
                            {
                                tx.setText("  Match Is Draw");
                            }
                        }
                        else
                        {
                            b3.setText("O");
                            turn++;
                            buttonused[2]=1;
                            p2won[2]=1;
                            draw++;

                            radioButton1.setBackgroundColor(Color.GREEN);
                            radioButton1.setChecked(true);

                            radioButton2.setBackgroundColor(Color.WHITE);
                            radioButton2.setChecked(false);

                            int r1 = p1won();
                            int r2 = p2won();

                            if (r1==1)
                            {
                                tx.setText(" Player 1 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if (r2==1)
                            {
                                tx.setText(" Player 2 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if(draw==9)
                            {
                                tx.setText("  Match Is Draw");
                            }
                        }
                    }

                    else
                    {
                        Toast.makeText(getApplicationContext(),"! This Button Is Used Allready !",Toast.LENGTH_SHORT).show();
                    }

                }

                else {
                    Toast.makeText(getApplicationContext(),"! Match Is Finished ! Click On Play Again !",Toast.LENGTH_SHORT).show();
                }

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(finishflag==0)
                {
                    if(buttonused[3]==0)
                    {
                        if(turn%2==0)
                        {
                            b4.setText("X");
                            turn++;
                            buttonused[3]=1;
                            p1won[3]=1;
                            draw++;

                            radioButton1.setBackgroundColor(Color.WHITE);
                            radioButton1.setChecked(false);

                            radioButton2.setBackgroundColor(Color.GREEN);
                            radioButton2.setChecked(true);

                            int r1 = p1won();
                            int r2 = p2won();

                            if (r1==1)
                            {
                                tx.setText(" Player 1 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if (r2==1)
                            {
                                tx.setText(" Player 2 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if(draw==9)
                            {
                                tx.setText("  Match Is Draw");
                            }

                        }
                        else
                        {
                            b4.setText("O");
                            turn++;
                            buttonused[3]=1;
                            p2won[3]=1;
                            draw++;

                            radioButton1.setBackgroundColor(Color.GREEN);
                            radioButton1.setChecked(true);

                            radioButton2.setBackgroundColor(Color.WHITE);
                            radioButton2.setChecked(false);

                            int r1 = p1won();
                            int r2 = p2won();

                            if (r1==1)
                            {
                                tx.setText(" Player 1 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if (r2==1)
                            {
                                tx.setText(" Player 2 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if(draw==9)
                            {
                                tx.setText("  Match Is Draw");
                            }
                        }
                    }

                    else
                    {
                        Toast.makeText(getApplicationContext(),"! This Button Is Used Allready !",Toast.LENGTH_SHORT).show();
                    }

                }

                else {
                    Toast.makeText(getApplicationContext(),"! Match Is Finished ! Click On Play Again !",Toast.LENGTH_SHORT).show();
                }

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(finishflag==0)
                {
                    if(buttonused[4]==0)
                    {
                        if(turn%2==0)
                        {
                            b5.setText("X");
                            turn++;
                            buttonused[4]=1;
                            p1won[4]=1;
                            draw++;

                            radioButton1.setBackgroundColor(Color.WHITE);
                            radioButton1.setChecked(false);

                            radioButton2.setBackgroundColor(Color.GREEN);
                            radioButton2.setChecked(true);


                            int r1 = p1won();
                            int r2 = p2won();

                            if (r1==1)
                            {
                                tx.setText(" Player 1 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if (r2==1)
                            {
                                tx.setText(" Player 2 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if(draw==9)
                            {
                                tx.setText("  Match Is Draw");
                            }
                        }
                        else
                        {
                            b5.setText("O");
                            turn++;
                            buttonused[4]=1;
                            p2won[4]=1;
                            draw++;

                            radioButton1.setBackgroundColor(Color.GREEN);
                            radioButton1.setChecked(true);

                            radioButton2.setBackgroundColor(Color.WHITE);
                            radioButton2.setChecked(false);

                            int r1 = p1won();
                            int r2 = p2won();

                            if (r1==1)
                            {
                                tx.setText(" Player 1 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if (r2==1)
                            {
                                tx.setText(" Player 2 Has Won ");

                                finishflag = 1;

                                if(flag==1)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b2.setBackgroundColor(Color.GREEN);
                                    b3.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==2)
                                {
                                    b4.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==3)
                                {
                                    b7.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==4)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b4.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==5)
                                {
                                    b2.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b8.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==6)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b6.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==7)
                                {
                                    b1.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b9.setBackgroundColor(Color.GREEN);
                                }

                                else if(flag==8)
                                {
                                    b3.setBackgroundColor(Color.GREEN);
                                    b5.setBackgroundColor(Color.GREEN);
                                    b7.setBackgroundColor(Color.GREEN);
                                }
                            }

                            else if(draw==9)
                            {
                                tx.setText("  Match Is Draw");
                            }
                        }
                    }

                    else
                    {
                        Toast.makeText(getApplicationContext(),"! This Button Is Used Allready !",Toast.LENGTH_SHORT).show();
                    }

                }

                else {

                    Toast.makeText(getApplicationContext(),"! Match Is Finished ! Click On Play Again !",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            if(finishflag==0)
            {
                if(buttonused[5]==0)
                {
                    if(turn%2==0)
                    {
                        b6.setText("X");
                        turn++;
                        buttonused[5]=1;
                        p1won[5]=1;
                        draw++;

                        radioButton1.setBackgroundColor(Color.WHITE);
                        radioButton1.setChecked(false);

                        radioButton2.setBackgroundColor(Color.GREEN);
                        radioButton2.setChecked(true);


                        int r1 = p1won();
                        int r2 = p2won();

                        if (r1==1)
                        {
                            tx.setText(" Player 1 Has Won ");

                            finishflag = 1;

                            if(flag==1)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b2.setBackgroundColor(Color.GREEN);
                                b3.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==2)
                            {
                                b4.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b6.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==3)
                            {
                                b7.setBackgroundColor(Color.GREEN);
                                b8.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==4)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b4.setBackgroundColor(Color.GREEN);
                                b7.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==5)
                            {
                                b2.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b8.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==6)
                            {
                                b3.setBackgroundColor(Color.GREEN);
                                b6.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==7)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==8)
                            {
                                b3.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b7.setBackgroundColor(Color.GREEN);
                            }
                        }

                        else if (r2==1)
                        {
                            tx.setText(" Player 2 Has Won ");

                            finishflag = 1;

                            if(flag==1)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b2.setBackgroundColor(Color.GREEN);
                                b3.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==2)
                            {
                                b4.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b6.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==3)
                            {
                                b7.setBackgroundColor(Color.GREEN);
                                b8.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==4)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b4.setBackgroundColor(Color.GREEN);
                                b7.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==5)
                            {
                                b2.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b8.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==6)
                            {
                                b3.setBackgroundColor(Color.GREEN);
                                b6.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==7)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==8)
                            {
                                b3.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b7.setBackgroundColor(Color.GREEN);
                            }
                        }
                        else if(draw==9)
                        {
                            tx.setText("  Match Is Draw");
                        }
                    }
                    else
                    {
                        b6.setText("O");
                        turn++;
                        draw++;
                        buttonused[5]=1;
                        p2won[5]=1;

                        radioButton1.setBackgroundColor(Color.GREEN);
                        radioButton1.setChecked(true);

                        radioButton2.setBackgroundColor(Color.WHITE);
                        radioButton2.setChecked(false);

                        int r1 = p1won();
                        int r2 = p2won();

                        if (r1==1)
                        {
                            tx.setText(" Player 1 Has Won ");

                            finishflag = 1;

                            if(flag==1)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b2.setBackgroundColor(Color.GREEN);
                                b3.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==2)
                            {
                                b4.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b6.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==3)
                            {
                                b7.setBackgroundColor(Color.GREEN);
                                b8.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==4)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b4.setBackgroundColor(Color.GREEN);
                                b7.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==5)
                            {
                                b2.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b8.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==6)
                            {
                                b3.setBackgroundColor(Color.GREEN);
                                b6.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==7)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==8)
                            {
                                b3.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b7.setBackgroundColor(Color.GREEN);
                            }
                        }

                        else if (r2==1)
                        {
                            tx.setText(" Player 2 Has Won ");

                            finishflag = 1;

                            if(flag==1)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b2.setBackgroundColor(Color.GREEN);
                                b3.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==2)
                            {
                                b4.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b6.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==3)
                            {
                                b7.setBackgroundColor(Color.GREEN);
                                b8.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==4)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b4.setBackgroundColor(Color.GREEN);
                                b7.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==5)
                            {
                                b2.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b8.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==6)
                            {
                                b3.setBackgroundColor(Color.GREEN);
                                b6.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==7)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==8)
                            {
                                b3.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b7.setBackgroundColor(Color.GREEN);
                            }
                        }

                        else if(draw==9)
                        {
                            tx.setText("  Match Is Draw");
                        }
                    }
                }

                else
                {
                    Toast.makeText(getApplicationContext(),"! This Button Is Used Allready !",Toast.LENGTH_SHORT).show();
                }
            }

            else {

                Toast.makeText(getApplicationContext(),"! Match Is Finished ! Click On Play Again !",Toast.LENGTH_SHORT).show();
            }

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             if(finishflag==0)
             {
                 if(buttonused[6]==0)
                 {
                     if(turn%2==0)
                     {
                         b7.setText("X");
                         turn++;
                         draw++;

                         radioButton1.setBackgroundColor(Color.WHITE);
                         radioButton1.setChecked(false);

                         radioButton2.setBackgroundColor(Color.GREEN);
                         radioButton2.setChecked(true);


                         buttonused[6]=1;
                         p1won[6]=1;

                         int r1 = p1won();
                         int r2 = p2won();

                         if (r1==1)
                         {
                             tx.setText(" Player 1 Has Won ");

                             finishflag = 1;

                             if(flag==1)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b2.setBackgroundColor(Color.GREEN);
                                 b3.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==2)
                             {
                                 b4.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b6.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==3)
                             {
                                 b7.setBackgroundColor(Color.GREEN);
                                 b8.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==4)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b4.setBackgroundColor(Color.GREEN);
                                 b7.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==5)
                             {
                                 b2.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b8.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==6)
                             {
                                 b3.setBackgroundColor(Color.GREEN);
                                 b6.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==7)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==8)
                             {
                                 b3.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b7.setBackgroundColor(Color.GREEN);
                             }
                         }

                         else if (r2==1)
                         {
                             tx.setText(" Player 2 Has Won ");

                             finishflag = 1;

                             if(flag==1)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b2.setBackgroundColor(Color.GREEN);
                                 b3.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==2)
                             {
                                 b4.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b6.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==3)
                             {
                                 b7.setBackgroundColor(Color.GREEN);
                                 b8.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==4)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b4.setBackgroundColor(Color.GREEN);
                                 b7.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==5)
                             {
                                 b2.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b8.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==6)
                             {
                                 b3.setBackgroundColor(Color.GREEN);
                                 b6.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==7)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==8)
                             {
                                 b3.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b7.setBackgroundColor(Color.GREEN);
                             }
                         }

                         else if(draw==9)
                         {
                             tx.setText("  Match Is Draw");
                         }
                     }
                     else
                     {
                         b7.setText("O");
                         turn++;
                         draw++;
                         buttonused[6]=1;
                         p2won[6]=1;


                         radioButton1.setBackgroundColor(Color.GREEN);
                         radioButton1.setChecked(true);

                         radioButton2.setBackgroundColor(Color.WHITE);
                         radioButton2.setChecked(false);

                         int r1 = p1won();
                         int r2 = p2won();

                         if (r1==1)
                         {
                             tx.setText(" Player 1 Has Won ");

                             finishflag = 1;

                             if(flag==1)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b2.setBackgroundColor(Color.GREEN);
                                 b3.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==2)
                             {
                                 b4.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b6.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==3)
                             {
                                 b7.setBackgroundColor(Color.GREEN);
                                 b8.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==4)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b4.setBackgroundColor(Color.GREEN);
                                 b7.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==5)
                             {
                                 b2.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b8.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==6)
                             {
                                 b3.setBackgroundColor(Color.GREEN);
                                 b6.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==7)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==8)
                             {
                                 b3.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b7.setBackgroundColor(Color.GREEN);
                             }
                         }

                         else if (r2==1)
                         {
                             tx.setText(" Player 2 Has Won ");

                             finishflag = 1;

                             if(flag==1)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b2.setBackgroundColor(Color.GREEN);
                                 b3.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==2)
                             {
                                 b4.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b6.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==3)
                             {
                                 b7.setBackgroundColor(Color.GREEN);
                                 b8.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==4)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b4.setBackgroundColor(Color.GREEN);
                                 b7.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==5)
                             {
                                 b2.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b8.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==6)
                             {
                                 b3.setBackgroundColor(Color.GREEN);
                                 b6.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==7)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==8)
                             {
                                 b3.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b7.setBackgroundColor(Color.GREEN);
                             }
                         }

                         else if(draw==9)
                         {
                             tx.setText("  Match Is Draw");
                         }
                     }
                 }

                 else
                 {
                     Toast.makeText(getApplicationContext(),"! This Button Is Used Allready !",Toast.LENGTH_SHORT).show();
                 }

             }

             else
             {
                 Toast.makeText(getApplicationContext(),"! Mathc Is Finished ! Click On Play Again !",Toast.LENGTH_SHORT).show();
             }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             if(finishflag==0)
             {
                 if(buttonused[7]==0)
                 {
                     if(turn%2==0)
                     {
                         b8.setText("X");
                         turn++;
                         draw++;
                         buttonused[7]=1;
                         p1won[7]=1;

                         radioButton1.setBackgroundColor(Color.WHITE);
                         radioButton1.setChecked(false);

                         radioButton2.setBackgroundColor(Color.GREEN);
                         radioButton2.setChecked(true);

                         int r1 = p1won();
                         int r2 = p2won();

                         if (r1==1)
                         {
                             tx.setText(" Player 1 Has Won ");

                             finishflag = 1;

                             if(flag==1)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b2.setBackgroundColor(Color.GREEN);
                                 b3.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==2)
                             {
                                 b4.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b6.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==3)
                             {
                                 b7.setBackgroundColor(Color.GREEN);
                                 b8.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==4)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b4.setBackgroundColor(Color.GREEN);
                                 b7.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==5)
                             {
                                 b2.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b8.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==6)
                             {
                                 b3.setBackgroundColor(Color.GREEN);
                                 b6.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==7)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==8)
                             {
                                 b3.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b7.setBackgroundColor(Color.GREEN);
                             }
                         }

                         else if (r2==1)
                         {
                             tx.setText(" Player 2 Has Won ");

                             finishflag = 1;

                             if(flag==1)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b2.setBackgroundColor(Color.GREEN);
                                 b3.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==2)
                             {
                                 b4.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b6.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==3)
                             {
                                 b7.setBackgroundColor(Color.GREEN);
                                 b8.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==4)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b4.setBackgroundColor(Color.GREEN);
                                 b7.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==5)
                             {
                                 b2.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b8.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==6)
                             {
                                 b3.setBackgroundColor(Color.GREEN);
                                 b6.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==7)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==8)
                             {
                                 b3.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b7.setBackgroundColor(Color.GREEN);
                             }
                         }

                         else if(draw==9)
                         {
                             tx.setText("  Match Is Draw");
                         }
                     }
                     else
                     {
                         b8.setText("O");
                         turn++;
                         draw++;
                         buttonused[7]=1;
                         p2won[7]=1;

                         radioButton1.setBackgroundColor(Color.GREEN);
                         radioButton1.setChecked(true);

                         radioButton2.setBackgroundColor(Color.WHITE);
                         radioButton2.setChecked(false);

                         int r1 = p1won();
                         int r2 = p2won();

                         if (r1==1)
                         {
                             tx.setText(" Player 1 Has Won ");

                             finishflag = 1;

                             if(flag==1)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b2.setBackgroundColor(Color.GREEN);
                                 b3.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==2)
                             {
                                 b4.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b6.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==3)
                             {
                                 b7.setBackgroundColor(Color.GREEN);
                                 b8.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==4)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b4.setBackgroundColor(Color.GREEN);
                                 b7.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==5)
                             {
                                 b2.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b8.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==6)
                             {
                                 b3.setBackgroundColor(Color.GREEN);
                                 b6.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==7)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==8)
                             {
                                 b3.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b7.setBackgroundColor(Color.GREEN);
                             }
                         }

                         else if (r2==1)
                         {
                             tx.setText(" Player 2 Has Won ");

                             finishflag = 1;

                             if(flag==1)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b2.setBackgroundColor(Color.GREEN);
                                 b3.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==2)
                             {
                                 b4.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b6.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==3)
                             {
                                 b7.setBackgroundColor(Color.GREEN);
                                 b8.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==4)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b4.setBackgroundColor(Color.GREEN);
                                 b7.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==5)
                             {
                                 b2.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b8.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==6)
                             {
                                 b3.setBackgroundColor(Color.GREEN);
                                 b6.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==7)
                             {
                                 b1.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b9.setBackgroundColor(Color.GREEN);
                             }

                             else if(flag==8)
                             {
                                 b3.setBackgroundColor(Color.GREEN);
                                 b5.setBackgroundColor(Color.GREEN);
                                 b7.setBackgroundColor(Color.GREEN);
                             }
                         }

                         else if(draw==9)
                         {
                             tx.setText("  Match Is Draw");
                         }
                     }
                 }

                 else
                 {
                     Toast.makeText(getApplicationContext(),"! This Button Is Used Allready !",Toast.LENGTH_SHORT).show();
                 }
             }

             else {
                 Toast.makeText(getApplicationContext(),"! Match Is Finished ! Click On Play Again !",Toast.LENGTH_SHORT).show();
             }

            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            if(finishflag==0)
            {
                if(buttonused[8]==0)
                {
                    if(turn%2==0)
                    {
                        b9.setText("X");
                        turn++;
                        draw++;
                        buttonused[8]=1;
                        p1won[8]=1;

                        radioButton1.setBackgroundColor(Color.WHITE);
                        radioButton1.setChecked(false);

                        radioButton2.setBackgroundColor(Color.GREEN);
                        radioButton2.setChecked(true);


                        int r1 = p1won();
                        int r2 = p2won();

                        if (r1==1)
                        {
                            tx.setText(" Player 1 Has Won ");

                            finishflag = 1;

                            if(flag==1)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b2.setBackgroundColor(Color.GREEN);
                                b3.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==2)
                            {
                                b4.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b6.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==3)
                            {
                                b7.setBackgroundColor(Color.GREEN);
                                b8.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==4)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b4.setBackgroundColor(Color.GREEN);
                                b7.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==5)
                            {
                                b2.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b8.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==6)
                            {
                                b3.setBackgroundColor(Color.GREEN);
                                b6.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==7)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==8)
                            {
                                b3.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b7.setBackgroundColor(Color.GREEN);
                            }
                        }

                        else if (r2==1)
                        {
                            tx.setText(" Player 2 Has Won ");

                            finishflag = 1;

                            if(flag==1)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b2.setBackgroundColor(Color.GREEN);
                                b3.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==2)
                            {
                                b4.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b6.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==3)
                            {
                                b7.setBackgroundColor(Color.GREEN);
                                b8.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==4)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b4.setBackgroundColor(Color.GREEN);
                                b7.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==5)
                            {
                                b2.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b8.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==6)
                            {
                                b3.setBackgroundColor(Color.GREEN);
                                b6.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==7)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==8)
                            {
                                b3.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b7.setBackgroundColor(Color.GREEN);
                            }
                        }

                        else if(draw==9)
                        {
                            tx.setText("  Match Is Draw");
                        }

                    }
                    else
                    {
                        b9.setText("O");
                        turn++;
                        buttonused[8]=1;
                        draw++;
                        p2won[8]=1;

                        radioButton1.setBackgroundColor(Color.GREEN);
                        radioButton1.setChecked(true);

                        radioButton2.setBackgroundColor(Color.WHITE);
                        radioButton2.setChecked(false);

                        int r1 = p1won();
                        int r2 = p2won();

                        if (r1==1)
                        {
                            tx.setText(" Player 1 Has Won ");

                            finishflag = 1;

                            if(flag==1)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b2.setBackgroundColor(Color.GREEN);
                                b3.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==2)
                            {
                                b4.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b6.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==3)
                            {
                                b7.setBackgroundColor(Color.GREEN);
                                b8.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==4)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b4.setBackgroundColor(Color.GREEN);
                                b7.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==5)
                            {
                                b2.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b8.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==6)
                            {
                                b3.setBackgroundColor(Color.GREEN);
                                b6.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==7)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==8)
                            {
                                b3.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b7.setBackgroundColor(Color.GREEN);
                            }
                        }

                        else if (r2==1)
                        {
                            tx.setText(" Player 2 Has Won ");

                            finishflag = 1;

                            if(flag==1)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b2.setBackgroundColor(Color.GREEN);
                                b3.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==2)
                            {
                                b4.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b6.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==3)
                            {
                                b7.setBackgroundColor(Color.GREEN);
                                b8.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==4)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b4.setBackgroundColor(Color.GREEN);
                                b7.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==5)
                            {
                                b2.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b8.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==6)
                            {
                                b3.setBackgroundColor(Color.GREEN);
                                b6.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==7)
                            {
                                b1.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b9.setBackgroundColor(Color.GREEN);
                            }

                            else if(flag==8)
                            {
                                b3.setBackgroundColor(Color.GREEN);
                                b5.setBackgroundColor(Color.GREEN);
                                b7.setBackgroundColor(Color.GREEN);
                            }
                        }

                        else if(draw==9)
                        {
                            tx.setText("  Match Is Draw");
                        }
                    }
                }

                else
                {
                    Toast.makeText(getApplicationContext(),"! This Button Is Used Allready !",Toast.LENGTH_SHORT).show();
                }
            }

            else
            {
                Toast.makeText(getApplicationContext(),"! Match Is Finished ! Click On Play Again !",Toast.LENGTH_SHORT).show();
            }

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                turn = 2;
                draw = 0;
                finishflag = 0;

                tx.setText("");
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");

                b1.setBackgroundColor(Color.LTGRAY);
                b2.setBackgroundColor(Color.LTGRAY);
                b3.setBackgroundColor(Color.LTGRAY);
                b4.setBackgroundColor(Color.LTGRAY);
                b5.setBackgroundColor(Color.LTGRAY);
                b6.setBackgroundColor(Color.LTGRAY);
                b7.setBackgroundColor(Color.LTGRAY);
                b8.setBackgroundColor(Color.LTGRAY);
                b9.setBackgroundColor(Color.LTGRAY);


                radioButton1.setBackgroundColor(Color.GREEN);
                radioButton1.setChecked(true);
                radioButton2.setBackgroundColor(Color.WHITE);
                radioButton2.setChecked(false);

                for(int i=0;i<9;i++)
                {
                    buttonused[i]=0;
                }

                for(int i=0;i<9;i++)
                {
                    p1won[i]=0;
                }

                for(int i=0;i<9;i++)
                {
                    p2won[i]=0;
                }
            }
        });
    }
}
