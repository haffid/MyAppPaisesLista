package com.haffid.myapppaiseslista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lista;
    ArrayList<String> paises = new ArrayList<>();
    ArrayList<Integer> banderas = new ArrayList<>();
    ArrayList<Integer> info = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.lstPaises);

        //Llenado de lista de paises
        paises.add("Italia");
        paises.add("Canada");
        paises.add("Colombia");
        paises.add("Argentina");
        paises.add("Estados Unidos");
        paises.add("Francia");
        paises.add("España");
        paises.add("China");
        paises.add("Japon");
        paises.add("Camerun");

        //Llenado de banderas
        banderas.add(R.drawable.ic_italia);
        banderas.add(R.drawable.ic_canada);
        banderas.add(R.drawable.ic_colombia);
        banderas.add(R.drawable.ic_argentina);
        banderas.add(R.drawable.ic_estados);
        banderas.add(R.drawable.ic_francia);
        banderas.add(R.drawable.ic_spain);
        banderas.add(R.drawable.ic_china);
        banderas.add(R.drawable.ic_japon);
        banderas.add(R.drawable.ic_camerun);

        //Llenado de informacion del pais
        info.add(R.string.pais1);
        info.add(R.string.pais2);
        info.add(R.string.pais3);
        info.add(R.string.pais4);
        info.add(R.string.pais5);
        info.add(R.string.pais6);
        info.add(R.string.pais7);
        info.add(R.string.pais8);
        info.add(R.string.pais9);
        info.add(R.string.pais10);

        //Declaracion del adaptador para la visualizacion de la informacion de la lista
        //Llena la lista
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, paises);
        lista.setAdapter(adapter);

        //Metodo para poder activar la funcion de presionar los componentes de la lista
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), MAInfoPais.class);
                intent.putExtra("flag", banderas.get(position));
                intent.putExtra("info", info.get(position));
                startActivity(intent);
            }
        });



    }
}