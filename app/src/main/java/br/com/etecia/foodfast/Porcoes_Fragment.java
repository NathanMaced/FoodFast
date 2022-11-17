package br.com.etecia.foodfast;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Porcoes_Fragment extends Fragment {
    EditText edtPorcoes;
    Button btnEscolha;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_porcoes, container, false);

        edtPorcoes = view.findViewById(R.id.edtPorcoes);
        btnEscolha = view.findViewById(R.id.btnEscolha);

        return view;
    }
}