package com.example.youngstack.supervocabulary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by youg stack on 2018/3/17.
 */

public class MybooksFragement extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view=inflater.inflate(R.layout.mybooks_fragment,container,false);
        return view;
    }
}
