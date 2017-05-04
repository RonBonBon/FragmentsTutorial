package hackeru.edu.fragmentstutorial;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ImageFragment extends Fragment {


    public ImageFragment() {
        // Required empty public constructor
    }

    ConstraintLayout layout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_image, container, false);
        layout = (ConstraintLayout) v.findViewById(R.id.imageLayout);
        return v;
    }

}
