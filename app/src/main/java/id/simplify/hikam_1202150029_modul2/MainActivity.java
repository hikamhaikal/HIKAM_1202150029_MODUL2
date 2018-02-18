package id.simplify.hikam_1202150029_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private boolean opsi;
    RadioButton a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"HIKAMHAIKAL_1202150029", Toast.LENGTH_LONG).show();
    }

    public void tuju(View view) {
        a = (RadioButton) findViewById(R.id.rbdine);
        b = (RadioButton) findViewById(R.id.rbta);
        if(a.isChecked()){//kondisi dimana ketika mencheck Dine In
        Intent in = new Intent(this, DineIn.class);
        startActivity(in);
        Toast.makeText(this, "Dine In", Toast.LENGTH_LONG).show();
    } else if (b.isChecked()) {//kondisi dimana ketika mencheck Take Away
        Intent in = new Intent(this, TakeAway.class);
        startActivity(in);
        Toast.makeText(this, "Take Away", Toast.LENGTH_LONG).show();
    }
    }
    }




