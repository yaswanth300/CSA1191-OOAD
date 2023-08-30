

/**
 * Class Admin1
 */
public class Admin1 {

  //
  // Fields
  //

  private int Admin_id;
  private String password;
  
  //
  // Constructors
  //
  public Admin1 () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Admin_id
   * @param newVar the new value of Admin_id
   */
  public void setAdmin_id (int newVar) {
    Admin_id = newVar;
  }

  /**
   * Get the value of Admin_id
   * @return the value of Admin_id
   */
  public int getAdmin_id () {
    return Admin_id;
  }

  /**
   * Set the value of password
   * @param newVar the new value of password
   */
  public void setPassword (String newVar) {
    password = newVar;
  }

  /**
   * Get the value of password
   * @return the value of password
   */
  public String getPassword () {
    return password;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String Add_customer_details()
  {
  }


  /**
   * @return       String
   */
  public String update_customer_details()
  {
  }


}



/**
 * Class remaining_stock
 */
public class remaining_stock {

  //
  // Fields
  //

  private String stock_name;
  private int quantity_of_stock;
  
  //
  // Constructors
  //
  public remaining_stock () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of stock_name
   * @param newVar the new value of stock_name
   */
  public void setStock_name (String newVar) {
    stock_name = newVar;
  }

  /**
   * Get the value of stock_name
   * @return the value of stock_name
   */
  public String getStock_name () {
    return stock_name;
  }

  /**
   * Set the value of quantity_of_stock
   * @param newVar the new value of quantity_of_stock
   */
  public void setQuantity_of_stock (int newVar) {
    quantity_of_stock = newVar;
  }

  /**
   * Get the value of quantity_of_stock
   * @return the value of quantity_of_stock
   */
  public int getQuantity_of_stock () {
    return quantity_of_stock;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String product_name()
  {
  }


  /**
   * @return       String
   */
  public String remaining_quantity()
  {
  }


}
