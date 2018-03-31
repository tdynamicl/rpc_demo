package priv.tdll.study.proj1.entity;

import java.io.Serializable;

public class Product implements Serializable {

    private String id;

    private Integer amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
