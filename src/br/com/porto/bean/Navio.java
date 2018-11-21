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
public class Navio 
{
    private String nomeNavio;
    private String tipoCarga;
    
    /*
        A variavel acao define se o navio vai carregar ou descarregar.
        Para acao = 1 navio carrega.
        Para acao = 0 navio decarrega.
    */
    private String acao;
    
    public Navio()
    {
        
    }
    
    public Navio(String nomeNavio, String tipoCarga, String acao) 
    {
        this.nomeNavio = nomeNavio;
        this.tipoCarga = tipoCarga;
        this.acao = acao;
        
        System.out.println("Novo navio...");
        System.out.println(nomeNavio);
        System.out.println(tipoCarga);
        System.out.println(acao);
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

    public String getAcao() 
    {
        return acao;
    }

    public void setAcao(String acao) 
    {
        this.acao = acao;
    }
    
    
    
}
