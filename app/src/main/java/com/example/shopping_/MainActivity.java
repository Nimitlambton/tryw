package com.example.shopping_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   public static  Products prod[] = new Products[5];
   public static  Customer cust[] = new customer[3];
    EditText etName ,etPassword;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etPassword = findViewById(R.id.etPassord);

        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);

        // for products
        prod[0] = new Products(prodNo 123,prodName: "Mackbook",price: 1500,prodImage "mackbook",prodstock:10);
        prod[1] = new Products(prodNo 456,prodName: "Key board",price: 1500,prodImage "mackbook",prodstock:10);
        prod[2] = new Products(prodNo 799,prodName: "RAM",     price  1500,prodImage "mackbook",prodstock:10);
        prod[3] = new Products(prodNo 741,prodName: "Mackbook",price: 1500,prodImage "mackbook",prodstock:10);
        prod[4] = new Products(prodNo 852,prodName: "Mackbook",price: 1500,prodImage  "mackbook",prodstock:10);


        // for customers

        cust[0] = new Customer(id 112233,name "sara",  username "sarasara",password "123456");
        cust[1] = new Customer(id 67890,name "raman",  username "ramandeep",password "456");
        cust[2] = new Customer(id 8905,name "aman",  username "amandeep",password "9056");


    }

    @Override
    public void onClick(View view) {
        String user = etName.getText().toString();
        String pass = etPassword.getText().toString();
        int custId = searchuser(cust ,user,pass);
        if (custId== -1)
            Toast.makeText(getApplicationContext(),"Invalid username or password",Toast.LENGTH_LONG),show();
        else {
            Intent go = new Intent(getApplicationContext(),Welcome.class);
            startActivity(go);



        }

    }
    public static  int searchuser(Customer cust[],String user,String pass) {
        for (int i = 0; i < cust.length; i++)
            if (user.equals(cust [i].username() && pass.equals().getpassword])) {
                id = cust[i].getId();
                return id; }
        return -1;
    }
     public  static  int findCustomerById(Customer cust[],int custId){
        for(int i =0; i<cust.length; i++)
            if (cust[i].getId()==custId)
     }

    }



