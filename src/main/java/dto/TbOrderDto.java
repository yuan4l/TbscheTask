package dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by yuan4j on 2017/5/15.
 */
public class TbOrderDto implements Serializable {
    private int id;

    /**
     * ����
     */
    private String billNumber;
    /**
     * ����ʱ��
     */
    private String buildDate;
    /**
     * �ͻ�
     */
    private String customer;
    /**
     * ��Ʒ��
     */
    private String goodsName;
    /**
     * ����
     */
    private BigDecimal Amount;
    /**
     * �۸�
     */
    private BigDecimal saleMoney;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(String buildDate) {
        this.buildDate = buildDate;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getAmount() {
        return Amount;
    }

    public void setAmount(BigDecimal amount) {
        Amount = amount;
    }

    public BigDecimal getSaleMoney() {
        return saleMoney;
    }

    public void setSaleMoney(BigDecimal saleMoney) {
        this.saleMoney = saleMoney;
    }
}
