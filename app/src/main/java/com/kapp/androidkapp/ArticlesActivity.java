package com.kapp.androidkapp;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ArticlesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        if (findViewById(R.id.fragment_container) != null) {

            // However, if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
            if (savedInstanceState != null) {
                return;
            }

            Integer position = 1;

            ArticleFragment firstFragment = new ArticleFragment();

            Bundle args = new Bundle();
            args.putInt(ArticleFragment.ARG_POSITION, position);
            firstFragment.setArguments(args);

            // In case this activity was started with special instructions from an
            // Intent, pass the Intent's extras to the fragment as arguments
//            firstFragment.setArguments(getIntent().getExtras());

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

//            transaction.add(R.id.fragment_container, firstFragment);
            transaction.replace(R.id.fragment_container, firstFragment);
            transaction.addToBackStack(null);

            transaction.commit();
        }
    }
}
