package cafe.adriel.androidaudiorecorder.example;

import android.app.Fragment;
//import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class STab1Teacher extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.select_teacher, container, false);

        return rootView;
    }
}
