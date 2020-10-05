package com.example.calcularmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btCalcular, btCalcularMedia, btVoltarMediaMenu;
    EditText edNota1, edNotaProjeto, edPontuacaoListas, edMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        carregartelaprincipal();
        setContentView(R.layout.activity_main);

        btCalcular = (Button)findViewById(R.id.btnCalcular);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.tela2);



                carregarWidgets();
                calcularMedia();

            }
        });


    }

    private void carregartelaprincipal() {
    }

    private void carregarWidgets(){
        edNota1=(EditText)findViewById(R.id.edtNota1);
        edNotaProjeto=(EditText)findViewById(R.id.edtNotaProjeto);
        edPontuacaoListas=(EditText)findViewById(R.id.edtPontuacaoListas);
        btVoltarMediaMenu=(Button)findViewById(R.id.btnVoltarMenuMedia);

        btCalcularMedia=(Button)findViewById(R.id.btnCalcularMedia);
        edMedia=(EditText)findViewById(R.id.edtMedia);
    }
    private void calcularMedia(){
        btCalcularMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double n1, nota_projeto, pontuacaoListas, media;

                n1= Double.valueOf(edNota1.getText().toString());
                nota_projeto= Double.valueOf(edNotaProjeto.getText().toString());
                pontuacaoListas= Double.valueOf(edPontuacaoListas.getText().toString());

                media = (n1 * 0.3) + (nota_projeto * 0.5) + pontuacaoListas;
                edMedia.setText(media.toString());
            }
        });

        btVoltarMediaMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                carregartelaprincipal();

            }
        });
    }

}