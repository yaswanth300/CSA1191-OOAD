

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
 * Class Customer
 */
public class Customer {

  //
  // Fields
  //

  private String name;
  private String address;
  private long int phone_no;
  
  //
  // Constructors
  //
  public Customer () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  public void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  public String getName () {
    return name;
  }

  /**
   * Set the value of address
   * @param newVar the new value of address
   */
  public void setAddress (String newVar) {
    address = newVar;
  }

  /**
   * Get the value of address
   * @return the value of address
   */
  public String getAddress () {
    return address;
  }

  /**
   * Set the value of phone_no
   * @param newVar the new value of phone_no
   */
  public void setPhone_no (long int newVar) {
    phone_no = newVar;
  }

  /**
   * Get the value of phone_no
   * @return the value of phone_no
   */
  public long int getPhone_no () {
    return phone_no;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String purchase_product()
  {
  }


  /**
   * @return       String
   */
  public String get_bill_details()
  {
  }


}
