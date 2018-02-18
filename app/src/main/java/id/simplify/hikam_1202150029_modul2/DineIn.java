package id.simplify.hikam_1202150029_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {
    Spinner nummeja;
    EditText namauser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        nummeja = (Spinner) findViewById(R.id.spinner);
        namauser = (EditText) findViewById(R.id.etnama1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.nomeja, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if (nummeja != null){
            nummeja.setAdapter(adapter);
        }
    }
    public void order(View view) {
        String nomor = nummeja.getSelectedItem().toString();
        String nu = namauser.getText().toString();
        Intent go = new Intent(this, Menu.class);
        go.putExtra("nama",nu);
        go.putExtra("nomor",nomor);
        startActivity(go);
    }
}
