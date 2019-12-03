package com.example.shopping_;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

public class Welcome extends AppCompatActivity implements View.OnClickListener {
    EditText etWelcome;
    Spinner sp;
    ImageView prodimg;
    Button btnchng;
    public static  int customerid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        prodimg = findViewById(R.id.ivprod);
        btnchng = findViewById(R.id.btchange);
        btnchng.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {
        String imfName = "keyboard";
        int imgId =  getResources().getIdentifier(imgName,"drawable",getPackageName());
       prodimg.setImageResource(imgId);
    }
    public static int searchuser()
    {
        for(int i=0; i<arr.length; i++)
            if(arr[i]).username.equals(userEntry)&& arr[i].password.equals(userpass))
        customerid = arr[i].id;
    }
}
