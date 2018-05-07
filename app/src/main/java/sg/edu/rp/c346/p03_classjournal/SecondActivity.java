package sg.edu.rp.c346.p03_classjournal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Button btnInfo;
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

        Toast.makeText(SecondActivity.this, option+"",
                Toast.LENGTH_LONG).show();

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Intent to display data
                Intent rpIntent = new Intent(Intent.ACTION_VIEW);
                // Set the URL to be used.
                rpIntent.setData(Uri.parse("http://www.rp.edu.sg"));
                startActivity(rpIntent);
            }
        });



    }
}
