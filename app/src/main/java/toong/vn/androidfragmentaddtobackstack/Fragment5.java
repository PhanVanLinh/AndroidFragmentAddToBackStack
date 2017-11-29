package toong.vn.androidfragmentaddtobackstack;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment5 extends android.support.v4.app.Fragment {
    private static final String TAG = "TAG_FRAGMENT";

    public static Fragment5 newInstance() {
         Bundle args = new Bundle();
         Fragment5 fragment = new Fragment5();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_5, null, false);

        rootView.findViewById(R.id.button_go_to_fragment_6)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        getParentFragment().getChildFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frame_fragment_3, Fragment6.newInstance())
                                .addToBackStack("5")
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