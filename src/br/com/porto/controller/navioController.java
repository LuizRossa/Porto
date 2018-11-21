/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.porto.controller;

import br.com.porto.bean.Navio;
import br.com.porto.bean.threadNavioCarga;
import java.util.ArrayList;

/**
 *
 * @author Luiz Rossa
 */
public class navioController 
{
    ArrayList<Navio> navio;
    
    private static navioController instance;
    Navio novoNavio;
    
    private navioController(){}
    
    threadNavioCarga tNavioCarga = new threadNavioCarga();
    Thread novaThread;
    
    
    public static navioController getInstance()
    {
        if(instance == null)
        {
            instance = new navioController();
	}
	return instance;
    }
    
    public void inicializar(String nomeNavio, String tipoCarga, String acao)
    {
        novoNavio = new Navio(nomeNavio, tipoCarga, acao);
        
        navio = new ArrayList<Navio>();
        navio.add(novoNavio);
        
        //String a = lista();
        //System.out.println(a);
    }
    
    public void navioCarga()
    {
        novaThread = new Thread(tNavioCarga);
        tNavioCarga.setNomeNavio(novoNavio.getNomeNavio());
        tNavioCarga.setTipoCarga(novoNavio.getTipoCarga());
        novaThread.start();
    }
}
