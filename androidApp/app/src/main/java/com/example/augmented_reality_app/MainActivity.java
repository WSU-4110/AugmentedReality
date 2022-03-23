package com.example.augmented_reality_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText$InspectionCompanion;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView register;
    private EditText editTextEmail , editTextPassword;
    private Button singIn;

    private FirebaseAuth mAuth;
    private ProgressBar prograssBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = (TextView) findViewById(R.id.register);
        register.setOnClickListener(this);

        singIn = (Button) findViewById(R.id.signIn);
        singIn.setOnClickListener(this);

        editTextEmail = (EditText) findViewById(R.id.email);
        editTextPassword = (EditText) findViewById(R.id.password);

        prograssBar = (ProgressBar) findViewById(R.id.progressBar);
        mAuth = FirebaseAuth.getInstance();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.register:
                startActivity(new Intent(this ,registeruser.class ));
                break;
            case R.id.signIn:
                userLogin();
                break;
        }
    }

    private void userLogin(){
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if(email.isEmpty()) {
            editTextEmail.setError("Email is required!!");
            editTextEmail.requestFocus();
            return;
        }
        //  if (Patterns.EMAIL_ADDRESS.matcher(email).matches()){
        //    editTextEmail.setError("Please enter a valid email");
        //     editTextEmail.requestFocus();
        //    return;
        // }
        if(password.isEmpty()){
            editTextPassword.setError("Please enter a valid password");
            editTextPassword.requestFocus();
            return;
        }
        if (password.length() < 6){
            editTextPassword.setError("Password has to be 6 characters");
            editTextPassword.requestFocus();
            return;
        }
        prograssBar.setVisibility(View.VISIBLE);

        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                    if (user.isEmailVerified()) {
                        startActivity(new Intent(MainActivity.this, main_app.class));
                    }
                    else{
                        user.sendEmailVerification();
                        Toast.makeText(MainActivity.this , "Check Your Email to verify" , Toast.LENGTH_LONG).show();
                        prograssBar.setVisibility(View.GONE);
                    }
                }
                else{
                    Toast.makeText(MainActivity.this , "Failed to login", Toast.LENGTH_LONG).show();

                }
            }
        });
    }

}