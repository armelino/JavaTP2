
package javatp2;

/**
 *
 * @author armel
 */
public class Polygone {
    
    //les attributs de la classe
    protected int nbSeg;
    protected Segment[] tab;
    
     public Polygone(){
        nbSeg = 0;
        tab = null;
    }
    
    public Polygone(int taille){
        nbSeg = taille;
        tab = new Segment[nbSeg];
    }
    
    public Polygone(Segment[] tableau){
        nbSeg = tableau.length;
        tab = new Segment[nbSeg];
        for (int i=0; i<nbSeg; i++){
            tab[i] = tableau[i];
        }
    }
    
    public void deplace(int dx, int dy){
        for (int i=0; i<nbSeg; i++){
            tab[i].deplace(dx, dy);
        }
    }
    
    public void affiche(){
        for (int i=0; i<nbSeg; i++){
            System.out.println("\nInformation du segment" + (i+1) + ": ");
            tab[i].affiche(tab[i].toString());
        }
    } 
}
