import objet.*;
import math.*;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("------- Démarrage du programme -------");

        System.out.println("Test des points :");

        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(3, 0, 3);

        System.out.println("On affiche le point P2 " + p2);

        System.out.println("Distance entre p et P2 " + p1.distance(p2));

        System.out.println("\n\nTest des surfaces");

        Point p3 = new Point(4, 5, 6);

        Surface s = new Surface("S1");

        System.out.println("Affichage surface 1 : " + s);

        s.ajoutePoint(p1);
        s.ajoutePoint(p2);
        s.ajoutePoint(p3);

        System.out.println("Affichage des Points contenu dans la surface :");

        for (Point p : s.getList()){
            System.out.println(p);
        }

        System.out.println("\n\nTest des Matrices :");

        Matrice m1 = new Matrice(5,5);

        m1.setAllTable(3);
        System.out.println(m1);

        Matrice m2 = m1.copy();


        System.out.println(m2);

        m2.setAllTable(5);
        m2.setDiagonale(3);
        System.out.println(m2);

        Matrice m3 = new Matrice(6,5);

        m3.setAllTable(2);
        System.out.println(m3);

        m2.additionMatrice(m1);
        System.out.println(m2);

        m2.additionMatrice(m3);
        System.out.println(m2);

        System.out.println("Affichage surface 1 : " + s);
    }
}    