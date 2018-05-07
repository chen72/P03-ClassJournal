package sg.edu.rp.c346.p03_classjournal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView c347;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c347 = (TextView)findViewById(R.id.textViewC347);



        // Set listener to handle the clicking of Superman TextView
        c347.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {






            }});







    }
}
