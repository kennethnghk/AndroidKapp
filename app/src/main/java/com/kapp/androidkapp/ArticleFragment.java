package com.kapp.androidkapp;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public class ArticleFragment extends Fragment {

    public static final String ARG_POSITION = "ARG_POSITION";

    OnArticleSelectedListener mCallback;

    // Container Activity must implement this interface
    public interface OnArticleSelectedListener {
        public void onArticleSelected(int position);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            mCallback = (OnArticleSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnArticleSelectedListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_article, container, false);
    }

    public void onArticleBtnClicked(View view) {
        mCallback.onArticleSelected(4);
    }

    public void updateArticleView(int position) {
        TextView textView = (TextView) getView().findViewById(R.id.articleTitle);
        textView.setText(position);
    }
}