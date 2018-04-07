package com.example.avenash_2.walmartextendedapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ShoppingActivity extends AppCompatActivity {

    TextView lblWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        lblWelcome=findViewById(R.id.lblWelcome);
        Intent intent = getIntent();
        String userEmail = intent.getStringExtra(String.valueOf(R.id.txtEmail));
        lblWelcome.setText(lblWelcome.getText()+" "+userEmail);
    }

    public void OnImageClick(View view) {
        final int id=view.getId();
        Intent intent = null;
        switch(id){
            case R.id.ivBeauty:
                intent = new Intent(getApplicationContext(),BeautyProductActivity.class);
                break;
            case R.id.ivClothing:
                intent = new Intent(getApplicationContext(),ClothActivity.class);
                break;
            case R.id.ivElectronics:
                intent =new Intent(getApplicationContext(), ElectronicsActivity.class);
                break;
            case R.id.ivFood:
                intent=new Intent(getApplicationContext(), FoodActivity.class);
                break;
        }
        if(intent!=null)
            startActivity(intent);
    }
}
