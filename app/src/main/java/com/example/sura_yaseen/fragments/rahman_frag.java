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
 * Use the {@link rahman_frag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class rahman_frag extends Fragment {
    WebView webView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public rahman_frag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment rahman_frag.
     */
    // TODO: Rename and change types and number of parameters
    public static rahman_frag newInstance(String param1, String param2) {
        rahman_frag fragment = new rahman_frag();
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
        View view = inflater.inflate(R.layout.fragment_rahman_frag, container, false);
        webView = view.findViewById(R.id.rahman_html);
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
            webView.loadUrl("file:///android_asset/rahman.html");
        } else {
            // Handle case where WebView is null
            Log.e("WebViewError", "WebView is null");
        }

        return view;
    }
}