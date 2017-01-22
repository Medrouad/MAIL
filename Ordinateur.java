 package TP1 ;


/**
 * Write a description of class Ordianteur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ordinateur
{
    // instance variables - replace the example below with your own
    private String nom;
    private double prix;
    private DisqueDur d;

    /**
     * Constructor for objects of class Ordianteur
     */
    public Ordinateur(String nom , double prix)
    {
       this.nom=nom;
       this.prix=prix;
    }

   
   public String getNom(){
       return nom;
    }

   public double getPrix(){
       return prix;
   }
   
   public void setPrix(double prix ){
        this.prix=prix;
        
   }
    
   public void setDisqueDur(DisqueDur d){
        this.d=d;
   }
    
   public void affiche(){
       if(d == null){
           System.out.println("Bonjour je suis l'ordinateur : "+nom+" et je coûte : "+prix+"€");
       }
       else{
           System.out.println("Bonjour je suis l'ordinateur : "+nom+" et je coûte : "+prix+"€ ."+d.toString());
       }
   }
    
    
}