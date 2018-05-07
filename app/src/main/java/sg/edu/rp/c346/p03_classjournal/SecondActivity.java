package sg.edu.rp.c346.p03_classjournal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    Button add, info, email;
    ListView lvCAG;
    ArrayList<WeekCag> cag;
    int nextWeek;
    WeekAdapter weekAdapter;
    String b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        add = findViewById(R.id.add);
        info = findViewById(R.id.info);
        email = findViewById(R.id.email);
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
        weekAdapter = new WeekAdapter(this, R.layout.row, cag);
        lvCAG.setAdapter(weekAdapter);
        nextWeek = cag.size() + 1;
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getBaseContext(), AddDG.class);
                intent.putExtra("nextWeek", nextWeek);
                startActivityForResult(intent,0);
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // The action you want this intent to do;
                // ACTION_SEND is used to indicate sending text
                Intent email = new Intent(Intent.ACTION_SEND);
                // Put essentials like email address, subject & body text
                email.putExtra(Intent.EXTRA_EMAIL,
                        new String[]{"jason_lim@rp.edu.sg"});
                email.putExtra(Intent.EXTRA_SUBJECT,
                        "Test Email from C347");

                b = "Hi faci, \n Iam \n Please see my remarks so far, thank you! \n";
                for (int i = 0; i < cag.size(); i++) {
                    b = b + "Week " + cag.get(i).getWeek()+": DG: " + cag.get(i).getCAG() + "\n";
                }
                email.putExtra(Intent.EXTRA_TEXT,b);

                // This MIME type indicates email
                email.setType("message/rfc822");
                // createChooser shows user a list of app that can handle
                // this MIME type, which is, email
                startActivity(Intent.createChooser(email,
                        "Choose an Email client :"));
            }
        });



    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Only handle when 2nd activity closed normally
        //  and data contains something
        if(resultCode == RESULT_OK){
            if (data != null) {
                // Get data passed back from 2nd activity
                WeekCag grade = (WeekCag) data.getSerializableExtra("grade");
                String statement = "";
                // If it is activity started by clicking
                //  Superman, create corresponding String
                cag.add(grade);
                nextWeek = cag.size() + 1;
                weekAdapter.notifyDataSetChanged();

                Toast.makeText(getBaseContext(), grade.getCAG(), Toast.LENGTH_LONG).show();
            }
        }
    }

}
