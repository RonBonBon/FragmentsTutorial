package hackeru.edu.fragmentstutorial;

import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Random;

public class ColorFragment extends Fragment implements View.OnClickListener {

    public ColorFragment() {
        // Required empty public constructor
    }

    ConstraintLayout layout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_color, container, false);
        layout = (ConstraintLayout) v.findViewById(R.id.colorLayout);

        layout.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        Random r = new Random();
        layout.setBackgroundColor(Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
    }
}
