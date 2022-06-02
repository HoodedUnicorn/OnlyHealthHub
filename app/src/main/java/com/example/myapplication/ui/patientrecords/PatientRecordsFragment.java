package com.example.myapplication.ui.patientrecords;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentPatientRecordsBinding;

public class PatientRecordsFragment extends Fragment {

    private FragmentPatientRecordsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PatientRecordsViewModel patientRecordsViewModel =
                new ViewModelProvider(this).get(PatientRecordsViewModel.class);

        binding = FragmentPatientRecordsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView;
        textView = binding.textPatientRecords;
        patientRecordsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
// This is a comment