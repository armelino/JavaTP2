
package javatp2;

/**
 *
 * @author armel
 */
public class Triangle extends Polygone{
    
// les attributs de la classe
    private float perimetre;
    private float surface;

    public Triangle (Segment monTableau[]){
        super(monTableau);
    }

    //Calcul du périmètre du triangle
    public float calculPremietre(){
        perimetre = 0.0f;
        for(int i=0; i<nbSeg ; i++){
            perimetre += tab[i].getLongueur();
        }
        return perimetre;
    }
    
    //Calcul de la surface du triangle
    public float calculSurface(){
        float peri = perimetre/2; //on obtien la moitié du périmètre pour le calcul de la surface
        surface = peri; //
        for(int i=0; i<nbSeg ; i++){
            surface *= (peri - tab[i].getLongueur());
        }
        surface = (float)Math.sqrt(surface);
        return surface;
    }
    
    // affichage ...
    public void affiche(){
       System.out.println("Triangle avec: ");
       for(int i=0; i<nbSeg; i++){
           System.out.println("Segment" + (i+1));
           tab[i].affiche(tab[i].toString());
       }
       System.out.println("Mon Perimetre est =" + perimetre +" et ma Surface est =" + surface);
   }
}
