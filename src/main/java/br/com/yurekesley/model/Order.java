package br.com.yurekesley.model;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
    private BigDecimal amount;

    public Order() {
    }

    public Order(int id, BigDecimal amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}