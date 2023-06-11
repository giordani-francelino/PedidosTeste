package com.mycompany.pedidosteste;

import java.util.List;

/**
 *
 * @author Your Name &lt;francelino at ifnmg&gt;
 */
public class DescontoItensEspeciais implements Desconto {

    private Desconto proximo;
    private double valorDesconto;

    public DescontoItensEspeciais(double valorDesconto) {
        this.valorDesconto = valorDesconto;

    }

    @Override
    public void implantarDesconto(Pedido pedido) {
        List<ItemPedido> itensPedido = pedido.getItensPedido();
        boolean temItensEspeciais = false;
        for (ItemPedido ip : itensPedido) {
            if (ip.isProdutoEspecial()) {
                temItensEspeciais = true;
                break;
            }
        }
        if (temItensEspeciais) {
            pedido.addDesconto(valorDesconto);
        }
        if (proximo != null) {
            proximo.implantarDesconto(pedido);
        }
    }

    @Override
    public void setProximo(Desconto desconto) {
        this.proximo = desconto;
    }
}
