

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
 * Class vaccancy_class
 */
public class vaccancy_class {

  //
  // Fields
  //

  private int vacancy_id;
  private String vacancy_type;
  private String vacancy_description;
  private int job_id;
  
  //
  // Constructors
  //
  public vaccancy_class () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of vacancy_id
   * @param newVar the new value of vacancy_id
   */
  private void setVacancy_id (int newVar) {
    vacancy_id = newVar;
  }

  /**
   * Get the value of vacancy_id
   * @return the value of vacancy_id
   */
  private int getVacancy_id () {
    return vacancy_id;
  }

  /**
   * Set the value of vacancy_type
   * @param newVar the new value of vacancy_type
   */
  private void setVacancy_type (String newVar) {
    vacancy_type = newVar;
  }

  /**
   * Get the value of vacancy_type
   * @return the value of vacancy_type
   */
  private String getVacancy_type () {
    return vacancy_type;
  }

  /**
   * Set the value of vacancy_description
   * @param newVar the new value of vacancy_description
   */
  private void setVacancy_description (String newVar) {
    vacancy_description = newVar;
  }

  /**
   * Get the value of vacancy_description
   * @return the value of vacancy_description
   */
  private String getVacancy_description () {
    return vacancy_description;
  }

  /**
   * Set the value of job_id
   * @param newVar the new value of job_id
   */
  private void setJob_id (int newVar) {
    job_id = newVar;
  }

  /**
   * Get the value of job_id
   * @return the value of job_id
   */
  private int getJob_id () {
    return job_id;
  }

  //
  // Other methods
  //

  /**
   */
  public void add_vacancy()
  {
  }


  /**
   */
  public void edit_vacancy()
  {
  }


  /**
   */
  public void delete_vacancy()
  {
  }


  /**
   */
  public void search_vacancy()
  {
  }


}
