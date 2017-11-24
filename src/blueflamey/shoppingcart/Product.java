package blueflamey.shoppingcart;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class Product {
  private String code;
  private String name;
  private String description;
  private String statusCurrent;
  private ArrayList<ProductStatus> statusHistory;
  private BigDecimal priceCurrent;
  private String currencyCurrent;
  private ArrayList<ProductPrice> priceHistory;
  private Date created;
  private Date updated;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public String getStatusCurrent() {
    // TODO: Get max price from priceHistory if not set
    return statusCurrent;
  }

  public ArrayList<ProductStatus> getStatusHistory() {
    return statusHistory;
  }

  public void setStatusHistory(ArrayList<ProductStatus> statusHistory) {
    this.statusHistory = statusHistory;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getPriceCurrent() {
    // TODO: Get max price from priceHistory if not set
    return priceCurrent;
  }

  public String getCurrencyCurrent() {
    // TODO: Get max price currency from priceHistory if not set
    return currencyCurrent;
  }

  public ArrayList<ProductPrice> getPriceHistory() {
    return priceHistory;
  }

  public void setPriceHistory(ArrayList<ProductPrice> priceHistory) {
    this.priceHistory = priceHistory;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Date getUpdated() {
    return updated;
  }

  public void setUpdated(Date created) {
    this.updated = created;
  }
}
