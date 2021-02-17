package edu.udb.fragmentsapp;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListMenuFragment extends ListFragment {

    // Variables que almacenan la informacion a mostarar en la aplicacion
    String[] users = new String[] { "Eduardo","Kevin","Roberto","Willian","Nathaly","Alex" };
    String[] location = new String[]{"El Salvador","Guatemala","Honduras","Nicaragua","Costa Rica","Panama"};


    // Metodo que retorna MainActivity la lista de los usuarios para mostrarlos en un ListView en el Fragment izquierdo
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.listitems_info, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, users);
        setListAdapter(adapter);
        return view;
    }

    // Metodo que muestra la informacion del usuario y locacion en un TextView el fragment derecho
    // Ademas cambia de color la selccion que se realiza en el ListView
    @Override
    public void onListItemClick(ListView listview, View view, int position, long id) {
        DetailsFragment txt = (DetailsFragment)getFragmentManager().findFragmentById(R.id.fragment2);
        txt.change("Name: "+ users[position],"Location : "+ location[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}