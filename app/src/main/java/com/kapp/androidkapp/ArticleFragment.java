package com.kapp.androidkapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ArticleFragment extends Fragment {

    String articleTitle;

    public static final String ARG_POSITION = "ARG_POSITION";

    public static ArticleFragment newInstance(String articleTitle) {
        ArticleFragment articleFragment = new ArticleFragment();
        Bundle args = new Bundle();
        args.putString("articleTitle", articleTitle);
        articleFragment.setArguments(args);
        return articleFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_article, container, false);
        Log.d("FRAG", articleTitle);

        TextView articleTitleTextView = (TextView) view.findViewById(R.id.article_fragment_article_title);
        articleTitleTextView.setText(articleTitle);
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("FRAG", "onCreate");

        articleTitle = getArguments().getString("articleTitle", "");
        Log.d("FRAG", articleTitle);
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d("FRAG", "onStart");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d("FRAG", "onResume");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d("FRAG", "onPause");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d("FRAG", "onStop");
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("FRAG", "onActivityCreated");
    }
    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("FRAG", "onDetach");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("FRAG", "onDestroy");
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("FRAG", "onDestroyView");
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("FRAG", "onAttach");
    }
}