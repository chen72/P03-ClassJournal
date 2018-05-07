package sg.edu.rp.c346.p03_classjournal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AddDG extends AppCompatActivity {
    TextView tvWeek;
    RadioGroup radioGroup;
    Button btnSubmit;
    ArrayList<WeekCag> cag;
    RadioButton a;
    int nextWeek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dg);

        tvWeek = (TextView) findViewById(R.id.tvWeek);
        radioGroup = findViewById(R.id.radioGroup);
        btnSubmit = findViewById(R.id.submitBtn);
        Intent intentGet = getIntent();
        nextWeek = intentGet.getIntExtra("nextWeek",-1);
        tvWeek.setText("Week " + nextWeek);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nextWeek!=-1){
                    a = findViewById(radioGroup.getCheckedRadioButtonId());
                    Intent i = new Intent();

                    i.putExtra("grade", new WeekCag(Integer.toString(nextWeek),a.getText().toString(),"null"));

                    // Set result to RESULT_OK to indicate normal
                    // response and pass in the intent containing the 		// like
                    setResult(RESULT_OK, i);
                    finish();
                }
            }
        });


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedButton = radioGroup.getCheckedRadioButtonId();

                RadioButton rb = (RadioButton)findViewById(selectedButton);
                Toast.makeText(AddDG.this, rb.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });



    }
}
