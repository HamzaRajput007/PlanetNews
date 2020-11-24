package apps.webscare.planetnews.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import apps.webscare.planetnews.Fragments.Home;
import apps.webscare.planetnews.Fragments.LiveFragment;
import apps.webscare.planetnews.Fragments.Politics;
import apps.webscare.planetnews.Fragments.USNews;

public class HomePagerAdapter extends FragmentStatePagerAdapter {
    int NUM_OF_TABS;
    private String[] tabTitles = new String[]{"Home", "US News", "Politics" , "Live"};
    public HomePagerAdapter(@NonNull FragmentManager fm , int numberOfTabs) {
        super(fm);
        this.NUM_OF_TABS = numberOfTabs;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Home homeFragment = new Home();
                return  homeFragment;
            case 1:
                USNews usNewsFragment = new USNews();
                return usNewsFragment;
            case 2:
                Politics politicsFragment = new Politics();
                return politicsFragment;
            case 3:
                LiveFragment liveFragment = new LiveFragment();
                return  liveFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_OF_TABS;
    }
}