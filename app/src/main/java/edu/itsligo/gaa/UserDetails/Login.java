package edu.itsligo.gaa.UserDetails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import edu.itsligo.gaa.MainActivity;
import edu.itsligo.gaa.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void dogotoRegister(View view) {
    }

    public void doLogin(View view) {
        Intent intent = new Intent(edu.itsligo.gaa.UserDetails.Login.this, MainActivity.class);
        startActivity(intent);
    }
}