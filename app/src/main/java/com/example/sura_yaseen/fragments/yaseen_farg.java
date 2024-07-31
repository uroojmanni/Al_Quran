package com.example.sura_yaseen.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.sura_yaseen.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link yaseen_farg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class yaseen_farg extends Fragment {

    WebView webView;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public yaseen_farg() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static yaseen_farg newInstance(String param1, String param2) {
        yaseen_farg fragment = new yaseen_farg();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_yaseen_farg, container, false);
        webView = view.findViewById(R.id.yaseen_html);
        if (webView != null) {
            // Get WebView settings
            WebSettings webSettings = webView.getSettings();
            // Enable JavaScript if needed
            webSettings.setJavaScriptEnabled(true);
            // Enable zoom controls if needed
            webSettings.setBuiltInZoomControls(true);
            // Hide the zoom controls
            webSettings.setDisplayZoomControls(false);

            // Load HTML file from assets folder
            webView.loadUrl("file:///android_asset/yaseen.html");
        } else {
            // Handle case where WebView is null
            Log.e("WebViewError", "WebView is null");
        }

        return view;
    }
    }

