package assignment04.net.assignment04_v1;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    Activity activity = getActivity();
    ListView listv;

    String[] statuslist = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};
    ArrayAdapter adapter;
    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        listv = (ListView) activity.findViewById(R.id.listv);
        adapter = new ArrayAdapter<String>(activity,R.layout.fragment_list,statuslist);
        listv.setAdapter(adapter);
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

}
