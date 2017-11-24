package blueflamey.shoppingcart;

import java.math.BigDecimal;
import java.util.Date;

public class ProductPrice {
  private BigDecimal price;
  private String currency;
  private Date updated;

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    // TODO: Should allow 3 letters only
    this.currency = currency;
  }

  public Date getUpdated() {
    return updated;
  }

  public void setUpdated(Date updated) {
    this.updated = updated;
  }

}
