
package javatp2;

/**
 *
 * @author armel
 */
public class Point {
    
    //les attributs de la classe
    private int x;
    private int y;
    private String name;
    
    //Constructeur Par defaut
    public Point(){
        x = 0;
        y = 0;
        name = "Inconnu";
    }
    
    public Point(int abs, int ord){
        x = abs;
        y = ord;
        name = "Inconnu";
    }
    
    //Ce constructeur fait appel au constructeur par defaut puis modifie le nom
    public Point(String lenom){
        super();
        name = lenom;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "nom=" + name + " abscisse=" + x + ", ordonnee=" + y;
    }
    
    public void affiche(){
        System.out.println("Je suis le point: "+ name +" de coordonnées(" + x + ", " + y + ").");
    }
    
    public void affiche(String chaine){
        System.out.println(chaine);
    }
    
    public void deplace(int dx, int dy){
        x += dx;
        y += dy;
    } 
}

