

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



/**
 * Class Application
 */
public class Application {

  //
  // Fields
  //

  private String Name;
  private int Age;
  private int DOB;
  private int phone_no;
  private String nationality;
  private char mail_id;
  
  //
  // Constructors
  //
  public Application () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Name
   * @param newVar the new value of Name
   */
  public void setName (String newVar) {
    Name = newVar;
  }

  /**
   * Get the value of Name
   * @return the value of Name
   */
  public String getName () {
    return Name;
  }

  /**
   * Set the value of Age
   * @param newVar the new value of Age
   */
  public void setAge (int newVar) {
    Age = newVar;
  }

  /**
   * Get the value of Age
   * @return the value of Age
   */
  public int getAge () {
    return Age;
  }

  /**
   * Set the value of DOB
   * @param newVar the new value of DOB
   */
  public void setDOB (int newVar) {
    DOB = newVar;
  }

  /**
   * Get the value of DOB
   * @return the value of DOB
   */
  public int getDOB () {
    return DOB;
  }

  /**
   * Set the value of phone_no
   * @param newVar the new value of phone_no
   */
  public void setPhone_no (int newVar) {
    phone_no = newVar;
  }

  /**
   * Get the value of phone_no
   * @return the value of phone_no
   */
  public int getPhone_no () {
    return phone_no;
  }

  /**
   * Set the value of nationality
   * @param newVar the new value of nationality
   */
  public void setNationality (String newVar) {
    nationality = newVar;
  }

  /**
   * Get the value of nationality
   * @return the value of nationality
   */
  public String getNationality () {
    return nationality;
  }

  /**
   * Set the value of mail_id
   * @param newVar the new value of mail_id
   */
  public void setMail_id (char newVar) {
    mail_id = newVar;
  }

  /**
   * Get the value of mail_id
   * @return the value of mail_id
   */
  public char getMail_id () {
    return mail_id;
  }

  //
  // Other methods
  //

  /**
   */
  public void search_name()
  {
  }


  /**
   */
  public void verify_phone_no()
  {
  }


  /**
   */
  public void verify_mail_id()
  {
  }


}
