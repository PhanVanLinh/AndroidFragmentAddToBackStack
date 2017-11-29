package toong.vn.androidfragmentaddtobackstack;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment4 extends android.support.v4.app.Fragment {
    private static final String TAG = "TAG_FRAGMENT";

    public static Fragment4 newInstance() {
         Bundle args = new Bundle();
         Fragment4 fragment = new Fragment4();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_4, null, false);

        rootView.findViewById(R.id.button_go_to_fragment_5)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        getParentFragment().getChildFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frame_fragment_3, Fragment5.newInstance())
                                .addToBackStack("4")
                                .commit();
                    }
                });

        rootView.findViewById(R.id.button_pop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragment().getChildFragmentManager().popBackStack();
            }
        });

        return rootView;
    }
}