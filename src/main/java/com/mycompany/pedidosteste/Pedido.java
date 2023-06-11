package com.mycompany.pedidosteste;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Your Name &lt;francelino at ifnmg&gt;
 */
public class Pedido {


    private double desconto;
    private double total;
    private List<ItemPedido> itensPedido;

    public Pedido() {
        desconto = 0d;
        itensPedido = new ArrayList<ItemPedido>();
    }

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public void setItemPedido(ItemPedido itemPedido) {
        this.itensPedido.add(itemPedido);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    
//</editor-fold>

    public void addDesconto(double desconto) {
        this.desconto = this.desconto + desconto;
    }

    public double getTotal() {
        total = 0d;
        for(ItemPedido i : this.itensPedido){
            total = total + i.getQuantidadeProduto() * i.getValorProduto();
        }
        return total;
    }

}
