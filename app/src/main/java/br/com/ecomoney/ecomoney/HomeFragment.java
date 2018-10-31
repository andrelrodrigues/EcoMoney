package br.com.ecomoney.ecomoney;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private TextView pontuacaoAtual;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_home, container, false);
        pontuacaoAtual = view.findViewById(R.id.pontuacaoAtual);

        return view;

    }



    public void atualizaPontos(){
        for (int i=0; i<869;i++) {

            pontuacaoAtual.setText(Integer.toString(i));
        }


    }




}
