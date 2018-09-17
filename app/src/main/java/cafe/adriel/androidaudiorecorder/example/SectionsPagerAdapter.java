package cafe.adriel.androidaudiorecorder.example;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;
//section page adapter designed for tab activity StudentMActivity
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mfragmentList=new ArrayList();
    private final List<String> mfragmentTitlelist=new ArrayList();


    public void addFragment(Fragment fragment,String Title){
        mfragmentList.add(fragment);
        mfragmentTitlelist.add(Title);
    }
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mfragmentTitlelist.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return mfragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mfragmentList.size();
    }
}
