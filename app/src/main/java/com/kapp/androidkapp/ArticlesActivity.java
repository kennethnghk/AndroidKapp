package com.kapp.androidkapp;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ArticlesActivity extends AppCompatActivity implements ArticleFragment.OnArticleButtonClickedListener {

    public static final String ARTICLE_FRAGMENT_TAG = "ARTICLE_FRAGMENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        if (findViewById(R.id.fragment_placeholder) != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ArticleFragment articleFragment = ArticleFragment.newInstance("my title");
            ft.replace(R.id.fragment_placeholder, articleFragment, ARTICLE_FRAGMENT_TAG);
            ft.commit();
        }

    }

    public void onUpdateArticleTitleButtonClicked(View view) {
        updateArticleFragmentTitle("title from activity");
    }

    public void onArticleButtonClicked () {
        Log.d("FRAG", "onArticleButtonClicked");

        updateArticleFragmentTitle("title from fragment button");
    }

    private void updateArticleFragmentTitle (String title) {
        ArticleFragment articleFragment = (ArticleFragment) getSupportFragmentManager()
                .findFragmentByTag(ARTICLE_FRAGMENT_TAG);

        articleFragment.updateArticleTitle(title);
    }
}
