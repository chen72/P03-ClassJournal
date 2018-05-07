package sg.edu.rp.c346.p03_classjournal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {


    ListView lvCAG;
    ArrayList<WeekCag> cag;
    int nextWeek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lvCAG = (ListView)findViewById(R.id.LVcag);
        // Get the intent
        Intent i = getIntent();
        // Get the Hero object first activity put in Intent
        int option = i.getIntExtra("module",-1);

        Toast.makeText(SecondActivity.this, option+"",
                Toast.LENGTH_LONG).show();

        cag = new ArrayList<WeekCag>();
        cag.add(new WeekCag("1","B","null"));
        cag.add(new WeekCag("2","C","null"));
        cag.add(new WeekCag("3","A","null"));

        nextWeek = cag.size() + 1;




    }
}
