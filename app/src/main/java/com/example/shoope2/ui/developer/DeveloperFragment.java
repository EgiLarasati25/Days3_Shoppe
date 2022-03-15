package com.example.shoope2.ui.developer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.shoope2.databinding.FragmentDeveloperBinding;
import com.example.shoope2.databinding.FragmentGalleryBinding;
import com.example.shoope2.ui.gallery.GalleryViewModel;

public class DeveloperFragment extends Fragment {

//private FragmentDeveloperBinding binding;
    private FragmentDeveloperBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        DeveloperViewModel developerViewModel =
                new ViewModelProvider(this).get(DeveloperViewModel.class);

        FragmentDeveloperBinding binding = FragmentDeveloperBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textDeveloper;
        developerViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}