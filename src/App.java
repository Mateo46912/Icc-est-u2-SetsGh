import java.util.Set;

import Controllers.ContactoController;
import Controllers.Ejercicios;
import Controllers.Sets;

public class App {
    
    public static void main(String[] args) throws Exception {
        //Sets set = new Sets();
        // System.out.println("--MATEO CORDERO--");
        // System.out.println("--IMPRIMIMOS USANDO HASHSET--");
        // runHashSet(set);
        // System.out.println("--IMPRIMIMOS USANDO LINKEDHASHSET--");
        // runLinkedHashSet(set);
        // System.out.println("--IMPRIMIMOS USANDO TREESET(menos a mayor)--");
        // runTreeSet(set);
        // System.out.println("--IMPRIMIMOS USANDO TREESET EMPLEANDO UN COMPARADOR SEGUN LA LONGUITUD DE LA PALABRA DE MENOR A MAYOR--");
        // runTreeSetConComparador(set);
        // System.out.println("--IMPRIMIMOS USANDO TREESET EMPLEANDO UN COMPARADOR SEGUN LA LONGUITUD DE LA PALABRA DE MAYOR A MENOR--");
        // runTreeSetConComparadorMayor(set);
        //ContactoController agenda = new ContactoController();
        Ejercicios ejercicios = new Ejercicios();
        
    }

    public static void runHashSet(Sets sets) {
        Sets palabrasSet = new Sets();
        Set<String> palabras = palabrasSet.construirHashSet();
        for (String palabrasImp : palabras) {
            System.out.println("-" + palabrasImp);
        }
    }
    public static void runLinkedHashSet(Sets sets) {
        Sets palabrasSet = new Sets();
        Set<String> palabras = palabrasSet.construirLinkedHashSet();
        for (String palabrasImp : palabras) {
            System.out.println("-" + palabrasImp);
        }
    }
    public static void runTreeSet(Sets sets) {
        Sets palabrasSet = new Sets();
        Set<String> palabras = palabrasSet.construirTreeSet();
        for (String palabrasImp : palabras) {
            System.out.println("-" + palabrasImp);
        }
    }
    public static void runTreeSetConComparador(Sets sets) {
        Sets palabrasSet = new Sets();
        Set<String> palabras = palabrasSet.construirTreeSetConComparador();
        for (String palabrasImp : palabras) {
            System.out.println("-" + palabrasImp);
        }
    }
    public static void runTreeSetConComparadorMayor(Sets sets) {
        Sets palabrasSet = new Sets();
        Set<String> palabras = palabrasSet.construirTreeSetConComparadorMayor();
        for (String palabrasImp : palabras) {
         
            System.out.println("-" + palabrasImp);
        }
    }
}
