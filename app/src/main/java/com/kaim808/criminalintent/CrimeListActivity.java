package com.kaim808.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by KaiM on 4/23/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
