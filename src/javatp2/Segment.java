
package javatp2;

/**
 *
 * @author armel
 */
public class Segment {
    
    //les attributs de la classe
    private Point a;
    private Point b;
    private float longueur;

    //Constructeur Par defaut
    public Segment(){
        a = new Point();
        b = new Point();
        longueur = 0.0f;
    }
    
    public Segment(Point lePoint1, Point lePoint2){
        a = lePoint1;
        b = lePoint2;
        longueur = this.calculerLongueur();
    }
    
    //Calcul de la longueur
    public float calculerLongueur(){
        float distance = 0.0f;
        distance = (float) Math.sqrt(((Math.pow((a.getX() - b.getX()), 2)) + Math.pow((a.getY() - b.getY()),2)));
        return distance;
    }

    public float getLongueur() {
        return longueur;
    }

    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }
    
    public void deplace(int dx, int dy){
        a.deplace(dx,dy);
        b.deplace(dx,dy);;
    } 
    
    @Override
    public String toString() {
        return ("Information:\n\tPoint1:" + a.toString() + "\n\tPoint2: " + b.toString() + "\n\tLongueur: " + getLongueur());
    }
    
    public void affiche(){
        System.out.println("Je suis un segment constitué des deux points suivants: \t");
        a.affiche();
        System.out.println("\t");
        b.affiche();
        System.out.println("\n\tEt ma longueur est de " + getLongueur());
    }
    
    public void affiche(String chaine){
        System.out.println("Segment: " + chaine);
    }
}
