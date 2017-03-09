package com.kapp.androidkapp;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class ArticlesActivity extends AppCompatActivity implements ArticleFragment.OnArticleSelectedListener {

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

    public void onArticleSelected(int position) {
        // The user selected the headline of an article from the HeadlinesFragment
        // Do something here to display that article

//        ArticleFragment articleFrag = (ArticleFragment)
//                getSupportFragmentManager().findFragmentById(R.id.article_fragment);
//
//        if (articleFrag != null) {
//            // If article frag is available, we're in two-pane layout...
//
//            // Call a method in the ArticleFragment to update its content
//            articleFrag.updateArticleView(position);
//        } else {
//            // Otherwise, we're in the one-pane layout and must swap frags...
//
//            // Create fragment and give it an argument for the selected article
//            ArticleFragment newFragment = new ArticleFragment();
//            Bundle args = new Bundle();
//            args.putInt(ArticleFragment.ARG_POSITION, position);
//            newFragment.setArguments(args);
//
//            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//
//            // Replace whatever is in the fragment_container view with this fragment,
//            // and add the transaction to the back stack so the user can navigate back
//            transaction.replace(R.id.fragment_container, newFragment);
//            transaction.addToBackStack(null);
//
//            // Commit the transaction
//            transaction.commit();
//        }
    }

    public void onArticleBtnClicked(View view) {
//        ArticleFragment articleFrag = (ArticleFragment)
//                getSupportFragmentManager().findFragmentById(R.id.article_fragment);
//
//        articleFrag.onArticleBtnClicked(view);
    }
}
