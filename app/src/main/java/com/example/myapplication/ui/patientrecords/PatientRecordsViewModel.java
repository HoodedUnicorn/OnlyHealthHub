package com.example.myapplication.ui.patientrecords;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PatientRecordsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PatientRecordsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is PatientRecords fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
// This is a comment