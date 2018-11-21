/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.porto.bean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luiz Rossa
 */
public class Porto 
{

    /*
        A variavel acao define se o navio vai carregar ou descarregar.
        Para acao = 1 navio carrega.
        Para acao = 0 navio decarrega.
    */
    private int acao;
    private int quantidade_navio;
    private String tipoCarga;
    

    public Porto()
    {
        
    }

    
    public int getAcao() 
    {
        return acao;
    }

    public void setAcao(int acao) 
    {
        this.acao = acao;
    }

    public int getQuantidade_navio() 
    {
        return quantidade_navio;
    }

    public void setQuantidade_navio(int quantidade_navio) 
    {
        this.quantidade_navio = quantidade_navio;
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
