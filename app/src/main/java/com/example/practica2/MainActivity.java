package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B = findViewById(R.id.Btn);

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí debes agregar el código que se ejecutará cuando se haga clic en el botón B.
                // Por ejemplo, puedes mostrar un mensaje o realizar alguna acción.
            }
        });
    }

    @Override
    public void onClick(View v) {
        // Este método se llama cuando se hace clic en el botón B.
        // Puedes agregar aquí el código que quieres ejecutar cuando se haga clic en el botón.
    }
}
