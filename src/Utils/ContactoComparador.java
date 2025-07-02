package Utils;

import java.util.Comparator;

import Models.Contacto;

public class ContactoComparador implements Comparator<Contacto> {


    @Override
    public int compare(Contacto c1, Contacto c2) {
        //Primero comparo por el apellido alfabeticamente
        int resultComparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        
        if(resultComparacionApellido != 0){
            return resultComparacionApellido;
        }

        int resultComparacionNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());
        return resultComparacionNombre;
        

    }


}
