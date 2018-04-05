
package javatp2;

/**
 *
 * @author armel
 */
public class Rectangle extends Polygone{
   
    //les attributs de la classe
    private float perimetre;
    private float surface;

    public Rectangle (Segment monTableau[]){
        super(monTableau);
    }

    public float calculPremietre(){
        perimetre = 0.0f; // on initiale le périmètre à 1 pour effectuer une somme.
        for(int i = 0; i < nbSeg ; i++){
            perimetre += tab[i].getLongueur();
        }
        return perimetre;
   }
    
    public float calculSurface(){
        surface = 1.0f; // on initialise à 1 pour effectuer un produit.
        for(int i = 0; i < nbSeg ; i++){
            surface *= tab[i].getLongueur();
        }
        return surface;
   }
    
    public void affiche(){
       System.out.println("Rectangle avec: ");
       for(int i=0; i<nbSeg; i++){
           System.out.println("Segment" + (i+1));
           tab[i].affiche(tab[i].toString());
       }
       System.out.println("Mon Perimetre est =" + perimetre +" et ma Surface est =" + surface);
   }
}
