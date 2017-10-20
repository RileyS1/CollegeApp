package com.example.bleitzel.collegeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bleitzel.collegeapp.R;

/**
 * Created by bleitzel on 10/5/2017.
 */

public class GuardianFragment extends Fragment {

    Button mSubmitButton;
    TextView mfirstnameTextView;
    TextView mlastnameTextView;
    EditText mfirstnameEditText;
    EditText mlastnameEditText;
    FamilyMember mGuardian;


    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup v, Bundle bundle){
        super.onCreateView(inflater, v, bundle);
        mGuardian = new Guardian("Nab","nOOB");
        View rootView = inflater.inflate(R.layout.familymemberfragment, v, false);
        mfirstnameEditText = (EditText)rootView.findViewById(R.id.first_name_edit);
        mlastnameEditText = (EditText)rootView.findViewById(R.id.last_name_edit);
        mfirstnameTextView = (TextView)rootView.findViewById(R.id.first_name_text);
        mlastnameTextView = (TextView)rootView.findViewById(R.id.last_name_text);

        mSubmitButton = (Button) rootView.findViewById(R.id.familyMemberSubmitButton);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = "";
                String last = "";
                first = mfirstnameEditText.getText().toString().trim();
                last = mlastnameEditText.getText().toString().trim();
                if ((first != null || !first.equals("")) && (last != null || !last.equals("")));
                mfirstnameTextView.setText(first);
                mlastnameTextView.setText(last);
                mGuardian.setFirstname(first);
                mGuardian.setLastname(last);

            }
        });
        mfirstnameTextView.setText(mGuardian.getFirstname());
        mlastnameTextView.setText(mGuardian.getLastname());
        return rootView;
    }

}
