/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.porto.controller;

import br.com.porto.view.Controle;
import br.com.porto.view.Operacao;

/**
 *
 * @author Luiz Rossa
 */
public class portoController 
{
   
    private static portoController instance;
    private Controle controle;
    private Operacao operacao;
    
    private portoController(){}
    
    public static portoController getInstance()
    {
        if(instance == null)
        {
            instance = new portoController();
	}
	return instance;
    }
    
    
    public void iniciarTelas()
    {
       controle = new Controle();
       operacao = new Operacao();
       controle.setVisible(true);
    }
    
    public void exibirTela(int i)
    {
        switch(i)
        {
            case 1:
                controle.setVisible(true);
                break;
            case 2:
                operacao.setVisible(true);
                break;
        }
    }
}
