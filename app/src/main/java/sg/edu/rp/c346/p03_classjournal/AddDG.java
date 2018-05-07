package sg.edu.rp.c346.p03_classjournal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AddDG extends AppCompatActivity {
    TextView tvWeek;
    RadioGroup radioGroup;
    Button btnSubmit;
    ArrayList<WeekCag> cag;
    int nextWeek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dg);

        tvWeek = (TextView) findViewById(R.id.tvWeek);
        radioGroup = findViewById(R.id.radioGroup);
        btnSubmit = findViewById(R.id.submitBtn);



    }
}
