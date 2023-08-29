

/**
 * Class admin
 */
public class admin {

  //
  // Fields
  //

  private String name;
  private int id;
  private String mail_id;
  
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
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId () {
    return id;
  }

  /**
   * Set the value of mail_id
   * @param newVar the new value of mail_id
   */
  public void setMail_id (String newVar) {
    mail_id = newVar;
  }

  /**
   * Get the value of mail_id
   * @return the value of mail_id
   */
  public String getMail_id () {
    return mail_id;
  }

  //
  // Other methods
  //

  /**
   */
  public void verify_student_details()
  {
  }


  /**
   */
  public void check_for_eligibility()
  {
  }


  /**
   */
  public void check_the_resume()
  {
  }


  /**
   */
  public void aprrove()
  {
  }


}



/**
 * Class student
 */
public class student {

  //
  // Fields
  //

  private char name;
  private int id_no;
  private String details;
  
  //
  // Constructors
  //
  public student () { };
  
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
  public void setName (char newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  public char getName () {
    return name;
  }

  /**
   * Set the value of id_no
   * @param newVar the new value of id_no
   */
  public void setId_no (int newVar) {
    id_no = newVar;
  }

  /**
   * Get the value of id_no
   * @return the value of id_no
   */
  public int getId_no () {
    return id_no;
  }

  /**
   * Set the value of details
   * @param newVar the new value of details
   */
  public void setDetails (String newVar) {
    details = newVar;
  }

  /**
   * Get the value of details
   * @return the value of details
   */
  public String getDetails () {
    return details;
  }

  //
  // Other methods
  //

  /**
   */
  public void fill_the_application()
  {
  }


  /**
   */
  public void pay()
  {
  }


}
