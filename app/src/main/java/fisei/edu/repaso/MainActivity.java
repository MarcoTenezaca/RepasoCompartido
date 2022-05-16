package fisei.edu.repaso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText txtNombre;
    EditText txtApellido;
Button btnGuardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNombre= findViewById(R.id.txtNombre);
        btnGuardar = findViewById(R.id.button_guardar);
        ////
        txtApellido = findViewById(R.id.txtApellido);
        txtApellido.setText(getIntent().getStringExtra("txtApellido2"));
        txtNombre.setText(getIntent().getStringExtra("txtNombre2"));

//
btnGuardar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if (txtNombre.getText().toString().equals(" ")){
          Toast.makeText(MainActivity.this, "DebeIngresr datos",Toast.LENGTH_LONG);

        }else{
            Intent intent = new Intent(MainActivity.this , Segundo.class);
            intent.putExtra("txtNombre",txtNombre.getText().toString());
            startActivity(intent);
        }

    }




});

    }
}