package blueflamey.shoppingcart;

import java.util.ArrayList;

public class Customer {
  private ArrayList<CustomerDetails> details;
  private String statusCurrent;
  private ArrayList<ProductStatus> statusHistory;

  public ArrayList<CustomerDetails> getDetails() {
    return details;
  }

  public void setDetails(ArrayList<CustomerDetails> details) {
    this.details = details;
  }

  public String getStatusCurrent() {
 // TODO: Get max status from priceHistory if not set
    return statusCurrent;
  }

  public ArrayList<ProductStatus> getStatusHistory() {
    return statusHistory;
  }

  public void setStatusHistory(ArrayList<ProductStatus> statusHistory) {
    this.statusHistory = statusHistory;
  }
  
  
}
