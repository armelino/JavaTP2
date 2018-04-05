
package javatp2;

import java.util.Scanner;

/**
 *
 * @author armel
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //lecture au clavier
        Scanner sc = new Scanner(System.in);
        
        Point p1 = new Point(); //objet utilisant le premier constructeur
        int coord_x, coord_y;
        String nom_chaine;//pour stocker le nom
        
        //saisie de la premiere coordonnée
        System.out.print("Entrez la coordonnée en X du point: ");
        coord_x = sc.nextInt();
        
        //saisie de la deuxième coordonnée
        System.out.print("\nEntrez la coordonnée en Y du point: ");
        coord_y = sc.nextInt();

        Point p2 = new Point(coord_x, coord_y);//objet utilisant le second constructeur
        
        //saisie du nom du point
        System.out.print("\nEntrez le nom du point: ");
        nom_chaine = sc.next();
        
        Point p3 = new Point(nom_chaine);//objet utilisant le troisième constructeur
        
        //Modification du nom de l'objet p2
        p2.setName(nom_chaine);
        
        p1.affiche(); // affichage de l'objet en utiliant la methode sans parametre
        p1.affiche(p1.toString());// affichage de l'objet en utiliant la methode avec parametre
        
        p2.affiche();// affichage de l'objet avec en utiliant la methode sans parametre
        p2.affiche(p2.toString());// affichage de l'objet en utiliant la methode avec parametre
        
        p3.affiche();// affichage de l'objet en utiliant la methode sans parametre
        p3.affiche(p3.toString());// affichage de l'objet en utiliant la methode avec parametre
        
        Segment s1 = new Segment(p1, p2); //Création d'un premier segment
        System.out.println("La longueur de ce segment(S1) est: " + s1.getLongueur()); //affichage uniquement de la longueur du segment
        
        Segment s2 = new Segment(p2, p3);//Création d'un deuxième segment
        System.out.println("La longueur de ce segment(S2) est: " + s2.getLongueur());//affichage uniquement de la longueur du segment
        
        s1.affiche();// affichage du premier segment en utiliant la methode sans parametre
        s2.affiche(s2.toString());// affichage du premier segment en utiliant la methode avec parametre
        
        s1.affiche();// affichage du deuxième segment en utiliant la methode sans parametre
        s2.affiche(s2.toString());// affichage du deuxième segment en utiliant la methode avec parametre
        
        s1.deplace(p3.getX(), p3.getY()); //Déplacement des points du segment s1
        s1.affiche();// Affichage détaillé du segment
        
        // Le polygone
        Point pt1 = new Point();
        Point pt2 = new Point();
        Point pt3 = new Point();
        Point pt4 = new Point();
        
        //Creation des segments
        Segment seg1 = new Segment(pt1, pt2);
        Segment seg2 = new Segment(pt3, pt4);
        Segment[] monTableau = new Segment[2];
        monTableau[0] = seg1;
        monTableau[1] = seg2;
        
        
    }
    
}
