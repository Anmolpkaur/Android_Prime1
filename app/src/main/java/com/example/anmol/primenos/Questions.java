package com.example.anmol.primenos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class Questions extends AppCompatActivity {

    private static EditText et1;
    private static Button btn1;
    private static Button btn2;
    private static Button btn3;
    int num;
    Random r=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        int res=GenerateQues();
        Btnclick(res);
        Btnclick2(res);
        BtnClick3();
    }

    public int GenerateQues()
    {
        et1=(EditText)findViewById(R.id.editText);
        num=r.nextInt(1000) + 1;
        String str="            "+num+" is a prime number.";
        et1.setText(str);
        return num;

    }

    public boolean Checkprime(int no)
    {
        int i;
        for(i=2;i<no;i++)
        {
            if((no%i)==0)
                return false;
        }
        return true;
    }

    public void Btnclick(final int no)
    {
        btn1=(Button)findViewById(R.id.button2);
        btn1.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        boolean res=Checkprime(no);
                        if(res==true)
                            Toast.makeText(Questions.this,"Your answer is Right", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Questions.this,"Your answer is Wrong", Toast.LENGTH_LONG).show();

                    }
                }
        );
    }


    public void Btnclick2(final int no)
    {
        btn2=(Button)findViewById(R.id.button3);
        btn2.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        boolean res=Checkprime(no);
                        if(res==false)
                            Toast.makeText(Questions.this,"Your answer is Right", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Questions.this,"Your answer is Wrong", Toast.LENGTH_LONG).show();

                    }
                }
        );
    }

    public void BtnClick3()
    {
        btn3=(Button)findViewById(R.id.button4);
        btn3.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {

                        Intent intent=new Intent("com.example.anmol.primenos.Questions");
                        startActivity(intent);

                    }
                }
        );
    }




}
