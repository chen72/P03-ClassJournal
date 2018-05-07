package sg.edu.rp.c346.p03_classjournal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//<<<<<<< Updated upstream
//=======
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//>>>>>>> Stashed changes
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

//<<<<<<< Updated upstream
//=======
    Button btnInfo;
    Button btnEmail;
    ListView lvCAG;
    EditText editTextMessage;
//>>>>>>> Stashed changes

    //ListView lvCAG;
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

//<<<<<<< Updated upstream
        cag = new ArrayList<WeekCag>();
        cag.add(new WeekCag("1","B","null"));
        cag.add(new WeekCag("2","C","null"));
        cag.add(new WeekCag("3","A","null"));

        nextWeek = cag.size() + 1;
 
//=======
        // info button
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
//>>>>>>> Stashed changes

        // email button
        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // The action you want this intent to do;
                // ACTION_SEND is used to indicate sending text
                Intent email = new Intent(Intent.ACTION_SEND);
                // Put essentials like email address, subject & body text
                email.putExtra(Intent.EXTRA_EMAIL,
                        new String[]{"jason_lim@rp.edu.sg"});
                email.putExtra(Intent.EXTRA_SUBJECT,
                        "");
                email.putExtra(Intent.EXTRA_TEXT,
                        editTextMessage.getText());
                // This MIME type indicates email
                email.setType("message/rfc822");
                // createChooser shows user a list of app that can handle
                // this MIME type, which is, email
                startActivity(Intent.createChooser(email,
                        "Choose an Email client :"));
            }
        });
    }
}
