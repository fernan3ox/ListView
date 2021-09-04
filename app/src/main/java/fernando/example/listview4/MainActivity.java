package fernando.example.listview4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import adapter.DiaHorarioAdapter;
import modelo.DiaHorario;

public class MainActivity extends AppCompatActivity {

    private ListView horario;
    private ArrayList <DiaHorario> lista;
    private TextView opcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1ra Forma de hacer un array
        // String[] titulos=getResources().getStringArray(R.array.horario_de_clases);
        // String[]subtitulos=getResources().getStringArray(R.array.dias_semana);

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,titulos);
        //ArrayAdapter< CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.horario_de_clases, android.R.layout.simple_list_item_1 );
        //2da Forma de hacer un array

        final String[] titulos=getResources().getStringArray(R.array.horario_de_clases);
        String[]subtitulos=getResources().getStringArray(R.array.dias_semana);


        lista = new ArrayList<>();
        for (int i=0; i<titulos.length;i++){

            lista.add(new DiaHorario(titulos[i],subtitulos[i]));
        }

        DiaHorarioAdapter adapter = new DiaHorarioAdapter(this , lista);

        opcion = (TextView) findViewById(R.id.Opcion);


        horario=(ListView) findViewById(R.id.Lista);
        horario.setAdapter(adapter);

        // programamos un evento

        horario.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                opcion.setText("Opcion:   "+ titulos[position]);

            }
        });


        }
}

