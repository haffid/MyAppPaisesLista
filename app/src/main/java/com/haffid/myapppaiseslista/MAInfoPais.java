package com.haffid.myapppaiseslista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MAInfoPais extends AppCompatActivity {
    private TextView info;
    private ImageView bandera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainfo_pais);

        info = findViewById(R.id.txtInfo);
        bandera = findViewById(R.id.imgBandera);

        this.recibirInfo();

    }

    private void recibirInfo(){
        Bundle bundle = getIntent().getExtras();
        int flag = bundle.getInt("flag");
        int inf = bundle.getInt("info");
        bandera.setImageResource(flag);
        info.setText(inf);
    }
}