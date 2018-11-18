package me.ankitarpit.labassignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void show(View view){
        EditText name = (EditText)findViewById(R.id.name);
        Toast.makeText(this, "Welcome "+name.getText(), Toast.LENGTH_LONG).show();
        name.setText("");
    }
}
