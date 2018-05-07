package sg.edu.rp.c346.p03_classjournal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {


    ListView lvCAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lvCAG = (ListView)findViewById(R.id.LVcag);
        // Get the intent
        Intent i = getIntent();
        // Get the Hero object first activity put in Intent
        int option = i.getIntExtra("module",0);





    }
}
