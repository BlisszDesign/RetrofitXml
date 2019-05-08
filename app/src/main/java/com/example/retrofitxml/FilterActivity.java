package com.example.retrofitxml;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class FilterActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Bundle querys;
    private RadioButton valuta;
    private RadioButton deviza;
    Spinner spinner;
    private Button send;
    public String queryValuta;
    public String queryValutaNem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        querys = new Bundle();
        valuta = findViewById(R.id.valuta);
        deviza = findViewById(R.id.deviza);
        send = findViewById(R.id.send);
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.valuta_array, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FilterActivity.this, ResultActivity.class);
                if (valuta.isChecked()){
                    queryValuta = "valuta";
                    intent.putExtra("valuta", queryValuta);
                }else if (deviza.isChecked()) {
                    queryValuta = "deviza";
                    intent.putExtra("valuta", queryValuta);
                } else {
                    Toast.makeText(getApplicationContext(), "Nem lett bejelölve a valuta", Toast.LENGTH_SHORT).show();
                }
                intent.putExtra("valutanem", String.valueOf(spinner.getSelectedItem()));
                startActivity(intent);
            }
        });

    }

  /*  public void checkValuta(View view) {
        if (valuta.isChecked()) {
            queryValuta = "valuta";
        } else if (deviza.isChecked()) {
            queryValuta = "deviza";
        } else {
            Toast.makeText(this, "Nem lett bejelölve a valuta", Toast.LENGTH_SHORT).show();
        }
    }*/


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
