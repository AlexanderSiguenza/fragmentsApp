
package edu.udb.fragmentsapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by tutlane on 06-08-2017.
 */

public class DetailsFragment extends Fragment {

    // Variable para almacenar usuario y locacion
    TextView name,location;

    // Metodo que retorna MainActivity la informacion del nombre y location en cada TextView correspondiente.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.details_info, container, false);
        name = (TextView)view.findViewById(R.id.Name);
        location = (TextView)view.findViewById(R.id.Location);
        return view;
    }

    // Metodo que esta cambiando el nombre y locacion cuando cambia la seleccion del ListView
    public void change(String uname, String ulocation){
        name.setText(uname);
        location.setText(ulocation);
    }
}