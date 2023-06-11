package com.mycompany.pedidosteste;

/**
 *
 * @author Your Name &lt;francelino at ifnmg&gt;
 */
public class PedidosTeste {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        ItemPedido itempedido = new ItemPedido(5, false,
                "sabão", 10.00);
        itempedido.setPedido(pedido);
        pedido.setItemPedido(itempedido);
        itempedido = new ItemPedido(10, false, "óleo", 10.05);
        itempedido.setPedido(pedido);
        pedido.setItemPedido(itempedido);
        Desconto descontoTotalAcima = new DescontoTotalAcimaDe(100.0,10.0);
        Desconto descontoItensEspeciais = new DescontoItensEspeciais(8.0);
        Desconto descontoQtdeItens = new DescontoQtdeItens(5,7.0);
        descontoTotalAcima.setProximo(descontoItensEspeciais);
        descontoItensEspeciais.setProximo(descontoQtdeItens);
        descontoTotalAcima.implantarDesconto(pedido);
        System.out.println(pedido.getDesconto());
    }
}
