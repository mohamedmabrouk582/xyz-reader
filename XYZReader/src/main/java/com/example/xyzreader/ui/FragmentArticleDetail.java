package com.example.xyzreader.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.CollapsibleActionView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xyzreader.R;

/**
 * Created by mohamed on 29/10/2017.
 */

public class FragmentArticleDetail extends Fragment {
    private View view;
    private CollapsingToolbarLayout mCollapsingToolbarLayout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      view=inflater.inflate(R.layout.fragment_article_detail,container,false);
         init();
        return view;
    }

    @SuppressLint("RestrictedApi")
    private void init(){
        Toolbar toolbar= (Toolbar) view.findViewById(R.id.main_toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
          ((AppCompatActivity) getActivity()).getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
          mCollapsingToolbarLayout= (CollapsingToolbarLayout) view.findViewById(R.id.main_collapsing);
    }

}
