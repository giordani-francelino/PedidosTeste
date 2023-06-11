/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedidosteste;

import java.util.List;

/**
 *
 * @author Your Name &lt;francelino at ifnmg&gt;
 */
public class DescontoQtdeItens implements Desconto {

    private Desconto proximo;
    private int qtdeItens;
    private double valorDesconto;

    public DescontoQtdeItens(int qtdeItens, double valorDesconto) {
        this.qtdeItens = qtdeItens;
        this.valorDesconto = valorDesconto;
    }

    
    
    @Override
    public void implantarDesconto(Pedido pedido) {
        List<ItemPedido> itensPedido = pedido.getItensPedido();
        int qtdeItens = 0;
        for(ItemPedido ip : itensPedido){
            qtdeItens = qtdeItens + ip.getQuantidadeProduto();
        }
        if (qtdeItens > this.qtdeItens) {
            pedido.addDesconto(valorDesconto);
        }
        if (proximo != null) {
            proximo.implantarDesconto(pedido);
        }
    }

    @Override
    public void setProximo(Desconto desconto) {
        this.proximo =  desconto;
    }
}
