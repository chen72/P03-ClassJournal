package sg.edu.rp.c346.p03_classjournal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvModule;
    ArrayAdapter aa;
    ArrayList<Module> modules;

    int requestCodeForC302 = 1;
    int requestCodeForC347 = 2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvModule = (ListView)findViewById(R.id.LVmodule);

        modules = new ArrayList<Module>();

        modules.add(new Module("C302", "Web Services"));
        modules.add(new Module("C347", "Android 2"));

        lvModule.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    Intent i = new Intent(MainActivity.this,
                            SecondActivity.class);
                    // Put hero object in intent
                    i.putExtra("module", position);
                    startActivity(i);

            }
        });


        aa = new ModuleAdapter(this, R.layout.module_row, modules);
        lvModule.setAdapter(aa);





    }
}
