package com.kapp.androidkapp;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ArticlesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        if (findViewById(R.id.fragment_placeholder) != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ArticleFragment articleFragment = ArticleFragment.newInstance("my title");
            ft.replace(R.id.fragment_placeholder, articleFragment, "ARTICLE_FRAGMENT");
            ft.commit();
        }

    }

    public void onUpdateArticleTitleButtonClicked(View view) {
        ArticleFragment articleFragment = (ArticleFragment) getSupportFragmentManager()
                .findFragmentByTag("ARTICLE_FRAGMENT");

        articleFragment.updateArticleTitle("new title");
    }
}
