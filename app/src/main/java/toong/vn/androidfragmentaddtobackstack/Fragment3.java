package toong.vn.androidfragmentaddtobackstack;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment3 extends BaseFragment {
    private static final String TAG = "TAG_FRAGMENT";

    public static Fragment3 newInstance() {
         Bundle args = new Bundle();
         Fragment3 fragment = new Fragment3();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_3, null, false);

        rootView.findViewById(R.id.button_pop_without_animation)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        getFragmentManager().popBackStack();
                    }
                });

        rootView.findViewById(R.id.button_go_to_fragment_4)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        getChildFragmentManager().beginTransaction()
                                .replace(R.id.frame_fragment_3, Fragment4.newInstance())
//                                .addToBackStack("")
                                .commit();
                    }
                });

        return rootView;
    }
}