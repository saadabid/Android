package assignment04.net.assignment04_v1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.beardedhen.androidbootstrap.BootstrapEditText;

import static android.R.id.list;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BootstrapEditText cnic = (BootstrapEditText) findViewById(R.id.cnic);
        BootstrapEditText password = (BootstrapEditText) findViewById(R.id.pass);
        BootstrapButton dialog = (BootstrapButton)findViewById(R.id.reg);

    }

    public void loginbtn(View view)
    {
        Intent i = new Intent(MainActivity.this,MapsActivity.class);
        startActivity(i);
    }
    public void showdialog(View view)
    {
        Intent i = new Intent(MainActivity.this,Register.class);
        startActivity(i);
    }

}
