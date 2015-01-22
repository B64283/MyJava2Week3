package com.example.matthewdarke.myjava2week3;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by matthewdarke on 1/21/15.
 */
public class MainFragment extends ListFragment {

    Button bnImpli;

    View v;

    //public static final int REQUEST_CODE = 2001;
    public MainFragment(){

    }

    //use save instance state with bundles

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        v = inflater.inflate(R.layout.main_fragment, container, false);
        bnImpli = (Button) v.findViewById(R.id.b3);

        return v;

    }
//restore your fragment state in onActivityCreated()
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
       // provides your activity with a Bundle object that can be used to store
       // out any data needed so that the activity can be created exactly as it
       // was before it was destroyed

        super.onActivityCreated(savedInstanceState);

  // we can check if that bundle is null and, if not, use it to restore our state
//Load cached Data from main activity
        if (getActivity() != null) {
            ((MainActivity)getActivity()).loadCacheData();
        }
        bnImpli.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                // TDOD Auto-generated method stub

                Intent implicit = new Intent(Intent.ACTION_SEND);
                implicit.setType("text/plain");

                startActivity(implicit);

                //Intent addTo = new Intent(getActivity(),AddActivity.class);
                //startActivityForResult(addTo, REQUEST_CODE);

            }
        });

    }



//set up onListItemClick
@Override
public void onListItemClick(ListView l, View view, int position, long id) {
    super.onListItemClick(l, view, position, id);

    MainActivity.deleteIndex = position;


    Contacts contacts = (Contacts) l.getItemAtPosition(position);

    Bundle bundle = new Bundle();
    bundle.putString("mName", contacts.getmName());
    bundle.putString("mAddress", contacts.getmAddress());
    bundle.putString("mNumber", contacts.getmNumber());

   // requesting the start of a new Activity (DetailActivity) within The application.
    Intent pdIntent = new Intent(view.getContext(),DetailActivity.class);

    //passing data to detail using putExtra in the intent
    pdIntent.putExtra("contactsArray", ((MainActivity)getActivity()).contactsArray);
    pdIntent.putExtras(bundle);

    //Using startActivity Android will process the intent (pdIntent), and launch the requested component from the Intent.
    startActivity(pdIntent);


}










}
