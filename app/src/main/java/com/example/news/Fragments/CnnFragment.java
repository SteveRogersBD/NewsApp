package com.example.news.Fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.news.R;
import com.example.news.WebViewController;

public class CnnFragment extends Fragment {


    WebView web;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cnn, container, false);
        web = view.findViewById(R.id.cnn_web);
        web.loadUrl("https://www.cnn.com/");
        web.setWebViewClient(new WebViewController());
        return view;
    }
}