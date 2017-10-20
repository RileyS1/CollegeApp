package com.example.bleitzel.collegeapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;
import com.backendless.persistence.DataQueryBuilder;

import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by bleitzel on 10/6/2017.
 */

public class ProfileFragment extends Fragment{

    TextView mfirstnameTextView;
    TextView mlastnameTextView;
    String email;
    EditText mfirstnameEditText;
    EditText mlastnameEditText;
    Profile mProfile;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup v, Bundle bundle){
        super.onCreateView(inflater, v, bundle);
        mProfile = new Profile();
        SharedPreferences sharedPreferences = getActivity().getPreferences(Context.MODE_PRIVATE);
        email = sharedPreferences.getString(ApplicantActivity.EMAIL_PREF, null);
        if (mProfile.getEmail() == null){
            mProfile.setEmail(email);
        }
        View rootView = inflater.inflate(R.layout.familymemberfragment, v, false);
        mfirstnameEditText = (EditText)rootView.findViewById(R.id.first_name_edit);
        mlastnameEditText = (EditText)rootView.findViewById(R.id.last_name_edit);
        mfirstnameTextView = (TextView)rootView.findViewById(R.id.first_name_text);
        mlastnameTextView = (TextView)rootView.findViewById(R.id.last_name_text);
        mfirstnameTextView.setText(mProfile.getFirstname());
        mlastnameTextView.setText(mProfile.getLastname());
        return rootView;
    }

    @Override
    public void onStart(){
        super.onStart();

    }

    @Override
    public void onPause(){
        super.onPause();
        String whereClause = "email = '" + email + "'";
        DataQueryBuilder querybuilder = DataQueryBuilder.create();
        querybuilder.setWhereClause(whereClause);
        Backendless.Data.of(Profile.class).save(mProfile, new AsyncCallback<Profile>() {
            @Override
            public void handleResponse(Profile response) {

            }

            @Override
            public void handleFault(BackendlessFault fault) {

            }
        });
    }
}
