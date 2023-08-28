

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
 * Class user_class
 */
public class user_class {

  //
  // Fields
  //

  private int id;
  private int role_id;
  private String name;
  private date dob;
  private String address;
  
  //
  // Constructors
  //
  public user_class () { };
  
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
  private void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  private int getId () {
    return id;
  }

  /**
   * Set the value of role_id
   * @param newVar the new value of role_id
   */
  private void setRole_id (int newVar) {
    role_id = newVar;
  }

  /**
   * Get the value of role_id
   * @return the value of role_id
   */
  private int getRole_id () {
    return role_id;
  }

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  private void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  private String getName () {
    return name;
  }

  /**
   * Set the value of dob
   * @param newVar the new value of dob
   */
  private void setDob (date newVar) {
    dob = newVar;
  }

  /**
   * Get the value of dob
   * @return the value of dob
   */
  private date getDob () {
    return dob;
  }

  /**
   * Set the value of address
   * @param newVar the new value of address
   */
  private void setAddress (String newVar) {
    address = newVar;
  }

  /**
   * Get the value of address
   * @return the value of address
   */
  private String getAddress () {
    return address;
  }

  //
  // Other methods
  //

  /**
   */
  public void add()
  {
  }


  /**
   */
  public void edit()
  {
  }


  /**
   */
  public void delete()
  {
  }


  /**
   */
  public void search()
  {
  }


}
