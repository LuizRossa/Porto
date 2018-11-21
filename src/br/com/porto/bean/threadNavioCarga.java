/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.porto.bean;

/**
 *
 * @author Luiz Rossa
 */
public class threadNavioCarga implements Runnable
{
    private String nomeNavio, tipoCarga;
    
    public threadNavioCarga()
    {
        
    }
    
    @Override
    public void run() 
    {
        try
        {
            System.out.println("|| Carregando Navio ||");
            //inicia a execução da lista de navio
            for(int i = 0; i < 5; i++)
            {
                //verificar a prioridade da carga
                System.out.println(getNomeNavio() + " : " + getTipoCarga());
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public String getNomeNavio() 
    {
        return nomeNavio;
    }

    public void setNomeNavio(String nomeNavio) 
    {
        this.nomeNavio = nomeNavio;
    }

    public String getTipoCarga() 
    {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) 
    {
        this.tipoCarga = tipoCarga;
    }
    
    
    
}
