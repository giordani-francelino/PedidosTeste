package com.mycompany.pedidosteste;

/**
 *
 * @author Your Name &lt;francelino at ifnmg&gt;
 */
public class DescontoTotalAcimaDe implements Desconto {

    private Desconto proximo;
    private double acimaDe;
    private double valorDesconto;

    public DescontoTotalAcimaDe(double acimaDe, double valorDesconto) {
        this.acimaDe = acimaDe;
        this.valorDesconto = valorDesconto;
    }

    @Override
    public void implantarDesconto(Pedido pedido) {
        if (pedido.getTotal() > acimaDe) {
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
