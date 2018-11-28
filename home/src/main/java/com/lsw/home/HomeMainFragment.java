package com.lsw.home;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lsw.commonlib.EventUtil;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeMainFragment extends Fragment implements View.OnClickListener{

    private Button button;

    public HomeMainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home_fragment_main, container, false);
        button = (Button) rootView.findViewById(R.id.jumpButton);
        button.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View v) {
        Context context = getActivity();
        EventUtil.open(context,"com.lsw.personal.ShareActivity");
    }

}
