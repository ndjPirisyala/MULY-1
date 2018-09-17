package cafe.adriel.androidaudiorecorder.example;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


//fragment for instruments in instrument class
public class fragment_st_instrument extends Fragment {

    public fragment_st_instrument(){ }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragemnt_stu_insselect_cardview,container,false);
    }




    }
