/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedidosteste;

/**
 *
 * @author Your Name &lt;francelino at ifnmg&gt;
 */
public class ItemPedido {

    private int quantidadeProduto;
    private boolean produtoEspecial;
    private String descricaoProduto;
    private double valorProduto;
    private Pedido pedido;

    public ItemPedido() {
        produtoEspecial = false;
    }

    public ItemPedido(int quantidadeProduto, boolean produtoEspecial, String descricaoProduto, double valorProduto) {
        this.quantidadeProduto = quantidadeProduto;
        this.produtoEspecial = produtoEspecial;
        this.descricaoProduto = descricaoProduto;
        this.valorProduto = valorProduto;
    }

//<editor-fold defaultstate="collapsed" desc="getters and setters">

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public boolean isProdutoEspecial() {
        return produtoEspecial;
    }

    public void setProdutoEspecial(boolean produtoEspecial) {
        this.produtoEspecial = produtoEspecial;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }
    
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
//</editor-fold>


}
