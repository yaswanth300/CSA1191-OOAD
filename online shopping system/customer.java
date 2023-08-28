

/**
 * Class admin
 */
public class admin {

  //
  // Fields
  //

  private integer id;
  private char name;
  
  //
  // Constructors
  //
  public admin () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  private void setId (integer newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  private integer getId () {
    return id;
  }

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  private void setName (char newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  private char getName () {
    return name;
  }

  //
  // Other methods
  //

  /**
   */
  public void view_product()
  {
  }


  /**
   */
  public void add_product()
  {
  }


  /**
   */
  public void delete_product()
  {
  }


  /**
   */
  public void modify_product()
  {
  }


  /**
   */
  public void make_shipment()
  {
  }


  /**
   */
  public void confirm_delivery()
  {
  }


}



/**
 * Class customer
 */
public class customer {

  //
  // Fields
  //

  private char id;
  private char name;
  private char address;
  private integer phno;
  
  //
  // Constructors
  //
  public customer () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  private void setId (char newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  private char getId () {
    return id;
  }

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  private void setName (char newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  private char getName () {
    return name;
  }

  /**
   * Set the value of address
   * @param newVar the new value of address
   */
  private void setAddress (char newVar) {
    address = newVar;
  }

  /**
   * Get the value of address
   * @return the value of address
   */
  private char getAddress () {
    return address;
  }

  /**
   * Set the value of phno
   * @param newVar the new value of phno
   */
  private void setPhno (integer newVar) {
    phno = newVar;
  }

  /**
   * Get the value of phno
   * @return the value of phno
   */
  private integer getPhno () {
    return phno;
  }

  //
  // Other methods
  //

  /**
   */
  public void buy_products()
  {
  }


  /**
   */
  public void view_products()
  {
  }


  /**
   */
  public void make_payment()
  {
  }


  /**
   */
  public void add_to_cart()
  {
  }


  /**
   */
  public void delete_from_cart()
  {
  }


}
