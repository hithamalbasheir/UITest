package com.example.uitest.ui.explore;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.uitest.databinding.ExploreFragmentBinding;
import com.example.uitest.databinding.FragmentHomeBinding;

public class ExploreFragment extends Fragment {

    private ExploreViewModel mViewModel;
    private ExploreFragmentBinding binding;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ExploreViewModel homeViewModel =
                new ViewModelProvider(this).get(ExploreViewModel.class);

        binding = ExploreFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}