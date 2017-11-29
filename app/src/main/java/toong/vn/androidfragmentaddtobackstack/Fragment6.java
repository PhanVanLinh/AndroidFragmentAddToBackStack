package toong.vn.androidfragmentaddtobackstack;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment6 extends android.support.v4.app.Fragment {
    private static final String TAG = "TAG_FRAGMENT";

    public static Fragment6 newInstance() {
         Bundle args = new Bundle();
         Fragment6 fragment = new Fragment6();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_6, null, false);

        return rootView;
    }
}