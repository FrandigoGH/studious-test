package com.example.paco.diffviewpage;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class EditorFragment extends Fragment {
    protected static String KEY_POSITION = "position";
    protected static EditorFragment frag = null;

    public static EditorFragment newInstance(int position){
        if (frag == null) {
            frag = new EditorFragment();
            Bundle args = new Bundle();

            args.putInt(KEY_POSITION, position);
            frag.setArguments(args);
        }

        return (frag);
    }

    public EditorFragment() {
        super();
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View result = inflater.inflate(R.layout.fragment_editor, container, false);
        return (result);
    }

}
