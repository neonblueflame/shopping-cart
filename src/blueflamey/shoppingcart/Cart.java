package blueflamey.shoppingcart;

import java.util.ArrayList;
import java.util.Date;

public class Cart {
  private Customer customer;
  private ArrayList<Product> items;
  private ArrayList<PromoRules> promos;
  private Date created;
  private Date updated;
  
  public Customer getCustomer() {
    return customer;
  }
  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
  
  public ArrayList<Product> getItems() {
    return items;
  }
  public void setItems(ArrayList<Product> items) {
    this.items = items;
  }
  
  public ArrayList<PromoRules> getPromos() {
    return promos;
  }
  public void setPromos(ArrayList<PromoRules> promos) {
    this.promos = promos;
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
  public void setUpdated(Date updated) {
    this.updated = updated;
  }
}
