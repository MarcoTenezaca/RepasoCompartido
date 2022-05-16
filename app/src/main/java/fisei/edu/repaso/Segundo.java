package fisei.edu.repaso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Segundo extends AppCompatActivity {
EditText txtNombre2;
EditText txtApellido2;
  Button btnGuardar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_segundo);
        txtNombre2 = findViewById(R.id.txtNombre2);
        txtNombre2.setText(getIntent().getStringExtra("txtNombre"));
        btnGuardar2 = findViewById(R.id.button_guardar2);
        txtApellido2 = findViewById(R.id.txtApellido2);


        // regresar datos
        btnGuardar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtApellido2.getText().toString().equals( "")){
                    Toast.makeText(Segundo.this, "DebeIngresar datos",Toast.LENGTH_LONG);

                }else{
                    Intent intent = new Intent(Segundo.this , MainActivity.class);
                    intent.putExtra("txtNombre2",txtNombre2.getText().toString());
                    intent.putExtra("txtApellido2",txtApellido2.getText().toString());
                    startActivity(intent);
                }

            }




        });
}
}