package com.example.anmol.primenos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   private static Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btnclick();
    }

    public void Btnclick()
    {
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(
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
