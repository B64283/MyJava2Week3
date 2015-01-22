package com.example.matthewdarke.myjava2week3;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;

/**
 * Created by matthewdarke on 1/21/15.
 */
public class AddActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        if (savedInstanceState == null){
            AddFragment f1 = new AddFragment();
            getFragmentManager()
                    .beginTransaction()


                    .add(R.id.add_activity_id, f1)
                    .commit();


        }


        //actionBar for navagation back to main



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        if(item.getItemId() == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }




}
