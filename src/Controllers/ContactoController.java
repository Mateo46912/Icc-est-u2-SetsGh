package Controllers;

import java.util.Set;
import java.util.TreeSet;
import Models.Contacto;
import Utils.ContactoComparador;
import Utils.ContactoComparadorHash;
import Utils.ContactoComparadorNumeros;

public class ContactoController {

    public ContactoController() {
        runTreeContacto();
        System.out.println();
        runTreeContactoNumeros();
        System.out.println();
        runTreeContactoHash();

    }

    public void runTreeContacto() {

        Set<Contacto> agenda = new TreeSet<>(new ContactoComparador());

        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        System.out.println("Agenda ordenada por Apellido - Nombre");
        for (Contacto contactos : agenda) {
            System.out.println(contactos);
        }
    }

    private void runTreeContactoNumeros() {
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparadorNumeros());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        System.out.println("Agenda ordenada por Apellido - Nombre - Telefonos");
        for (Contacto contactos : agenda) {
            System.out.println(contactos);
        }

        
    }
    private void runTreeContactoHash() {
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparadorHash());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        System.out.println("Agenda ordenada por HashCode(nombre-apellido)");
        for (Contacto contactos : agenda) {
            System.out.println(contactos);
        }

        
    }
}
