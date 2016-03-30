package com.example.paco.diffviewpage;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SwitchFragment extends Fragment {
    protected static String KEY_POSITION = "position";
    protected static SwitchFragment frag = null;

    public static SwitchFragment newInstance(int position){
        if (frag == null) {
            frag = new SwitchFragment();
            Bundle args = new Bundle();

            args.putInt(KEY_POSITION, position);
            frag.setArguments(args);
        }

        return (frag);
    }

    public SwitchFragment() {
        super();
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View result = inflater.inflate(R.layout.fragment_switch, container, false);
        return (result);
    }

}
