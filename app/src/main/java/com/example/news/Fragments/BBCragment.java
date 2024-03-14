package com.example.news.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.news.R;
import com.example.news.WebViewController;

public class BBCragment extends Fragment {

    WebView web;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b_b_cragment, container, false);

        web = view.findViewById(R.id.bbc_web);
        web.loadUrl("https://www.bbc.com/news");
        web.setWebViewClient(new WebViewController());
        return view;
    }
}