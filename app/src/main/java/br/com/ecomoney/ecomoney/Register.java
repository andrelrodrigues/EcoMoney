package br.com.ecomoney.ecomoney;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText edtName;
    EditText edtCpf;
    EditText edtEmail;
    EditText edtPass;
    EditText edtConfrPass;

    Button btnRegister;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtName = findViewById(R.id.edtName);
        edtCpf = findViewById(R.id.edtCpf);
        edtEmail = findViewById(R.id.edtEmail);
        edtPass = findViewById(R.id.edtPass);
        edtConfrPass = findViewById(R.id.edtConfrPass);

        btnRegister = findViewById(R.id.btnRegister);

    }
}
