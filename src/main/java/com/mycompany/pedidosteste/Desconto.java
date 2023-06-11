
package com.mycompany.pedidosteste;

/**
 *
 * @author Your Name &lt;francelino at ifnmg&gt;
 */
public interface Desconto {
    
    public void implantarDesconto(Pedido pedido);

    public void setProximo(Desconto desconto);
    
}
