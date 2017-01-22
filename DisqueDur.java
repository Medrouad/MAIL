package TP1;


/**
 * Write a description of class DisqueDur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisqueDur
{
    // instance variables - replace the example below with your own
    private int capacite;

    public DisqueDur(int x)
    {
        capacite = x;
    }
    
    public int getCapacite(){
        return capacite;
    }
    
    public void setCapacite(int x){
        capacite=x;
    }
    
    public String toString(){
     return "La capacité de mon disque dur est de : "+capacite+" GB";   
    }
        
    public void affiche()
    {
        System.out.println(this.toString());
    }
}
