package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import fernando.example.listview4.R;
import modelo.DiaHorario;

public class DiaHorarioAdapter extends ArrayAdapter<DiaHorario>  {
    public DiaHorarioAdapter(@NonNull Context context, List<DiaHorario> objetos) {
        super(context, R.layout.list_template, objetos);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.list_template, null); //aqui por que usa el item <--
        TextView titulos =(TextView)item.findViewById(R.id.titulo);
        TextView subtitulos =(TextView)item.findViewById(R.id.subtitulo);

        titulos.setText(getItem(position).getAsignatura());
        subtitulos.setText(getItem(position).getDia());

        return item;
    }
}
