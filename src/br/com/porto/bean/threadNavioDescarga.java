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
public class threadNavioDescarga implements Runnable
{
    private String nomeNavio, tipoCarga;
    
    
    public threadNavioDescarga(String nomeNavio, String tipoCarga)
    {
        this.nomeNavio = nomeNavio;
        this.tipoCarga = tipoCarga;
    }
    
    
    
    @Override
    public void run() 
    {

    }
    
}
