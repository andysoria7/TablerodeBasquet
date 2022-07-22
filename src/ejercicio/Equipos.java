/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author ANDRES
 */
public class Equipos 
{
    int Simple;
    int Doble;
    int Triple;
    int Menosuno;
    int valoractual = 0;

    public Equipos() 
    {
        
    }

    public Equipos(int Simple, int Doble, int Triple, int Menosuno, int valoractual) 
    {
        this.Simple = Simple;
        this.Doble = Doble;
        this.Triple = Triple;
        this.Menosuno = Menosuno;
        this.valoractual = valoractual;
    }

    public int getSimple() 
    {
        return Simple;
    }

    public void setSimple(int Simple) 
    {
        this.Simple = Simple;
    }

    public int getDoble() 
    {
        return Doble;
    }

    public void setDoble(int Doble) 
    {
        this.Doble = Doble;
    }

    public int getTriple() 
    {
        return Triple;
    }

    public void setTriple(int Triple) 
    {
        this.Triple = Triple;
    }

    public int getMenosuno() 
    {
        return Menosuno;
    }

    public void setMenosuno(int Menosuno) 
    {
        this.Menosuno = Menosuno;
    }

    public int getValoractual() 
    {
        return valoractual;
    }

    public void setValoractual(int valoractual) 
    {
        this.valoractual = valoractual;
    }
    
    

    
    
    
    public int contadorsimple()
    {
        if (getSimple() >=0) 
        {
            setValoractual(getValoractual()+1);
            return valoractual;
            
        }
        
        return 0;
    
    }
    
    public int contadordoble()
    {
        if (getDoble() >=0) 
        {
            setValoractual(getValoractual()+2);
            return valoractual;
        }
        
        return 0;
        
    }
    
    public int contadortriple()
    {
        if (getTriple() >=0) 
        {
            setValoractual(getValoractual()+3);
            return valoractual;
        }
        
        return 0;
    
    }
    
    public int decrementar()
    {
        if (getMenosuno()>=0) 
        {
            setValoractual(getValoractual()-1);
            return valoractual;
        }
        
        return 0;
    
    }
    
    
    
    
    
    
    
    
}
