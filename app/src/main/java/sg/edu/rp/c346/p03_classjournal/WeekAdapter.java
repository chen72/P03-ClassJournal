package sg.edu.rp.c346.p03_classjournal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class WeekAdapter extends ArrayAdapter {

    private ArrayList<WeekCag> week;
    private Context context;
    private TextView tvWeeks,tvCags;
    private ImageView image;

    public WeekAdapter(Context context, int resource, ArrayList<WeekCag> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        week = objects;
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
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvWeeks = (TextView) rowView.findViewById(R.id.week);

        // Get the TextView object
        tvCags = (TextView) rowView.findViewById(R.id.cag);

        // Get the ImageView object
        image = (ImageView)rowView.findViewById(R.id.imageView);

        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        WeekCag currentWeek = week.get(position);
        // Set the TextView to show the Day

        tvWeeks.setText("Week "+currentWeek.getWeek());
        tvCags.setText(currentWeek.getCAG());
        image.setImageResource(R.drawable.dg);



        // Return the nicely done up View to the ListView
        return rowView;
    }


}
