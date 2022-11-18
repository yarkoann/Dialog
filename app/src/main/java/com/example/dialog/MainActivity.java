package com.example.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.lang.invoke.ConstantCallSite;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        public RelativeLayout relativeLayout;
        private Button buttonnn;
        Context context;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        Button bgButton = (Button) findViewById(R.id.buttonnn);
        bgButton.setOnClickListener(this);

        relativeLayout = findViewById(R.id.relative);
    }
    @Override
    public void onClick(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final CharSequence[] items = {getText(R.string.lime), getText(R.string.blue), getText(R.string.pink), getText(R.string.lilac)};

        builder.setTitle(R.string.message);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                switch (i){
                    case 0:
                        Toast.makeText(context, R.string.lime, Toast.LENGTH_LONG).show();
                        relativeLayout.setBackgroundResource(R.color.limeColor);
                        break;
                    case 1:
                        Toast.makeText(context, R.string.blue, Toast.LENGTH_LONG).show();
                        relativeLayout.setBackgroundResource(R.color.blueColor);
                        break;
                    case 2:
                        Toast.makeText(context, R.string.pink, Toast.LENGTH_LONG).show();
                        relativeLayout.setBackgroundResource(R.color.pinkColor);
                        break;
                    case 3:
                        Toast.makeText(context, R.string.lilac, Toast.LENGTH_LONG).show();
                        relativeLayout.setBackgroundResource(R.color.lilacColor);
                        break;
                }
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}