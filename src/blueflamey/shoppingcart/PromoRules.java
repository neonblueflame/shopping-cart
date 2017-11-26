package blueflamey.shoppingcart;

import java.util.Date;

public class PromoRules {
  private String description;
  private String type;
  private Date end;
  
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  
  public Date getEnd() {
    return end;
  }
  public void setEnd(Date end) {
    this.end = end;
  }
}
