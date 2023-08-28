

/**
 * Class admin
 */
public class admin {

  //
  // Fields
  //

  private admin student_details;
  private char book_list;
  
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
   * Set the value of student_details
   * @param newVar the new value of student_details
   */
  public void setStudent_details (admin newVar) {
    student_details = newVar;
  }

  /**
   * Get the value of student_details
   * @return the value of student_details
   */
  public admin getStudent_details () {
    return student_details;
  }

  /**
   * Set the value of book_list
   * @param newVar the new value of book_list
   */
  public void setBook_list (char newVar) {
    book_list = newVar;
  }

  /**
   * Get the value of book_list
   * @return the value of book_list
   */
  public char getBook_list () {
    return book_list;
  }

  //
  // Other methods
  //

  /**
   */
  public void verify_student_id()
  {
  }


  /**
   */
  public void check_for_book_availability()
  {
  }


  /**
   */
  public void issue_books()
  {
  }


  /**
   */
  public void order_for_new_books()
  {
  }


  /**
   */
  public void maintain_student_details()
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

  private String name;
  private int id;
  private int phone_no;
  private char mail_id;
  
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
  public void request()
  {
  }


  /**
   */
  public void return()
  {
  }


  /**
   */
  public void register()
  {
  }


}
