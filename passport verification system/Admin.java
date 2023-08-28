

/**
 * Class Admin
 */
public class Admin {

  //
  // Fields
  //

  private String admin_name;
  private int admin_id;
  private char address;
  
  //
  // Constructors
  //
  public Admin () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of admin_name
   * @param newVar the new value of admin_name
   */
  public void setAdmin_name (String newVar) {
    admin_name = newVar;
  }

  /**
   * Get the value of admin_name
   * @return the value of admin_name
   */
  public String getAdmin_name () {
    return admin_name;
  }

  /**
   * Set the value of admin_id
   * @param newVar the new value of admin_id
   */
  public void setAdmin_id (int newVar) {
    admin_id = newVar;
  }

  /**
   * Get the value of admin_id
   * @return the value of admin_id
   */
  public int getAdmin_id () {
    return admin_id;
  }

  /**
   * Set the value of address
   * @param newVar the new value of address
   */
  public void setAddress (char newVar) {
    address = newVar;
  }

  /**
   * Get the value of address
   * @return the value of address
   */
  public char getAddress () {
    return address;
  }

  //
  // Other methods
  //

  /**
   */
  public void issue()
  {
  }


  /**
   */
  public void reject()
  {
  }


}
