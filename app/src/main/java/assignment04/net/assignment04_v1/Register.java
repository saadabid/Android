package assignment04.net.assignment04_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class Register extends AppCompatActivity {

    DatabaseHandler db = new DatabaseHandler(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText uname = (EditText) findViewById(R.id.usernameId);
        final EditText pwd = (EditText) findViewById(R.id.pwdId);
        final EditText cnic = (EditText)findViewById(R.id.cnic);
        final EditText add = (EditText)findViewById(R.id.address);
        final EditText no = (EditText)findViewById(R.id.number);
        final EditText email = (EditText)findViewById(R.id.email);
        Button loginButton = (Button)findViewById(R.id.loginButtonId);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.adduser(new User(Integer.parseInt(cnic.getText().toString()) ,pwd.getText().toString(), uname.getText().toString() ,add.getText().toString(),email.getText().toString(),Integer.parseInt(no.getText().toString())));
                List<User> users = db.getAllusers();

                for (User cn : users) {
                    String log = "cnic: "+cn.getCnic() +" ,pass: " + cn.getPassword() + " ,Phone: " + cn.getNo();
                    // Writing Contacts to log
                    Log.d("Name: ", log);
                }
                Intent i = new Intent(Register.this,DeliveryRequest.class);
                startActivity(i);
            }
        });
    }


}
