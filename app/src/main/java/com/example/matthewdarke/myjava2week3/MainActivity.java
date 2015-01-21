package com.example.matthewdarke.myjava2week3;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

import java.util.ArrayList;


public class MainActivity extends Activity {

    public static ArrayList<Contacts> contactsArray = new ArrayList<Contacts>();
    public static ArrayAdapter<Contacts> adapter;

    public static int deleteAtIndex;

    public static final int REQUEST_CODE = 2001;
    public static Contacts mConData;
    public static int deleteIndex;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // If no state bundle exists, this is the first launch.
        // Add your fragments just this one time.
        if (savedInstanceState == null) {

            MainFragment fragment = new MainFragment();
            getFragmentManager().beginTransaction()
                    .add(R.id.main_activity_id, fragment).commit();
        }



    }














    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
