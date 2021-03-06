package sg.edu.rp.c346.p03_classjournal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter {

    private ArrayList<Module> modules;
    private Context context;
    private TextView tvCode,tvName;
    private ImageView image;

    public ModuleAdapter(Context context, int resource, ArrayList<Module> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        modules = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.module_row, parent, false);

        // Get the TextView object
        tvCode = (TextView) rowView.findViewById(R.id.tvCode);

        // Get the TextView object
        tvName = (TextView) rowView.findViewById(R.id.tvName);



        Module currentModule = modules.get(position);
        // Set the TextView to show the Day

        tvCode.setText(currentModule.getmCode());
        tvName.setText(currentModule.getmName());

        return rowView;
    }



}