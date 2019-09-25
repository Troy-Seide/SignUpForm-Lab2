package temple.edu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.savebutton);
        final EditText PN = (EditText)findViewById(R.id.Name);
        final EditText PE = (EditText) findViewById(R.id.Email);
        final EditText PP = (EditText) findViewById(R.id.Password);
        final EditText PPC = (EditText) findViewById(R.id.PC);
        button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String pn = PN.getText().toString();
                    String pe = PE.getText().toString();
                    String pp = PP.getText().toString();
                    String ppc = PPC.getText().toString();

                    if (pn.equals("") || pe.equals("") || pp.equals("") || ppc.equals("")) {
                        Toast.makeText(FormActivity.this, "Enter your information in each category provided.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        if (!(pp.equals(ppc))) {
                            Toast.makeText(FormActivity.this, "There has been an error with the password confirmation.", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(FormActivity.this, "Your information has been saved.", Toast.LENGTH_SHORT).show();
                        }
                    }
                }


            });
        }
    }
