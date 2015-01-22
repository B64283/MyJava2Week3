package com.example.matthewdarke.myjava2week3;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by matthewdarke on 1/21/15.
 */
public class AddFragment extends Fragment {

    private Contacts contacts;

   //create new ContactsArrayList
    public ArrayList<Contacts> mContacts = new ArrayList<>();

    private EditText contactsName;
    private EditText contactsAddress;
    private EditText contactsNumber;
    private Button addBtn;

    public AddFragment(){

        //super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v;
        v = inflater.inflate(R.layout.add_fragment, container, false);


        contactsName = (EditText) v.findViewById(R.id.name_edit);
        contactsAddress = (EditText) v.findViewById(R.id.editText2);
        contactsNumber = (EditText) v.findViewById(R.id.editText3);
        addBtn = (Button) v.findViewById(R.id.b_add);

        addBtn.setOnClickListener(new View.OnClickListener() {

            // add info to listview
            @Override
            public void onClick(View v) {
                String firstName = contactsName.getText().toString();
                String firstAddress = contactsAddress.getText().toString();
                String firstNumber = contactsNumber.getText().toString();

                contacts = new Contacts();
                contacts.setmName(firstName);
                contacts.setmAddress(firstAddress);
                contacts.setmNumber(firstNumber);
                mContacts.add(contacts);

//set the extras directly to the intent and let it store the data in its own internal bundle
       //putExtra is used to pass data from one activity to the next.
                Intent intent = new Intent();
                intent.putExtra("conData", mContacts);


                getActivity().setResult(Activity.RESULT_OK, intent);

                getActivity().finish();
}

        });

        return v;

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }


}
