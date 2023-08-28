

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
 * Class computer
 */
public class computer {

  //
  // Fields
  //

  private String student_record;
  private String booklist;
  
  //
  // Constructors
  //
  public computer () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of student_record
   * @param newVar the new value of student_record
   */
  public void setStudent_record (String newVar) {
    student_record = newVar;
  }

  /**
   * Get the value of student_record
   * @return the value of student_record
   */
  public String getStudent_record () {
    return student_record;
  }

  /**
   * Set the value of booklist
   * @param newVar the new value of booklist
   */
  public void setBooklist (String newVar) {
    booklist = newVar;
  }

  /**
   * Get the value of booklist
   * @return the value of booklist
   */
  public String getBooklist () {
    return booklist;
  }

  //
  // Other methods
  //

  /**
   */
  public void maintain_student_record()
  {
  }


  /**
   */
  public void enter_issue()
  {
  }


  /**
   */
  public void oder_new_books()
  {
  }


  /**
   */
  public void check_availability()
  {
  }


}
