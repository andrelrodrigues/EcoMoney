package br.com.ecomoney.ecomoney;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends Fragment {

    Button btnGetPhoto, btnSave;
    ImageView imgvPhoto;


    public SettingsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
          inflater.inflate(R.layout.fragment_settings, container, false);

        btnGetPhoto = view


    }


}
