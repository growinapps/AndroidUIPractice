package com.tje.androiduipractice.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tje.androiduipractice.MainActivity;
import com.tje.androiduipractice.R;
import com.tje.androiduipractice.databinding.Fragment1Binding;

public class FragmentOne extends Fragment {

    Fragment1Binding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_1, container, false);

        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        binding.myTextView.setText("데이터 바인딩 이용");

        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = binding.titleEdit.getText().toString();

                ((MainActivity)getActivity()).setCustomTitle(title);
            }
        });

    }

    public void changeTextMsg(String inputMessage) {
        binding.myTextView.setText(inputMessage);
    }
}
