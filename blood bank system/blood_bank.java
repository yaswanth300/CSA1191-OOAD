

/**
 * Class admin
 */
public class admin {

  //
  // Fields
  //

  private int bp;
  private String blood_group;
  private String blood_type;
  
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
   * Set the value of bp
   * @param newVar the new value of bp
   */
  private void setBp (int newVar) {
    bp = newVar;
  }

  /**
   * Get the value of bp
   * @return the value of bp
   */
  private int getBp () {
    return bp;
  }

  /**
   * Set the value of blood_group
   * @param newVar the new value of blood_group
   */
  private void setBlood_group (String newVar) {
    blood_group = newVar;
  }

  /**
   * Get the value of blood_group
   * @return the value of blood_group
   */
  private String getBlood_group () {
    return blood_group;
  }

  /**
   * Set the value of blood_type
   * @param newVar the new value of blood_type
   */
  private void setBlood_type (String newVar) {
    blood_type = newVar;
  }

  /**
   * Get the value of blood_type
   * @return the value of blood_type
   */
  private String getBlood_type () {
    return blood_type;
  }

  //
  // Other methods
  //

  /**
   */
  public void requirements()
  {
  }


  /**
   */
  public void quantity_used()
  {
  }


  /**
   */
  public void availability()
  {
  }


}



/**
 * Class blood_bank
 */
public class blood_bank {

  //
  // Fields
  //

  private char name;
  private char address;
  private int phno;
  private int experience;
  
  //
  // Constructors
  //
  public blood_bank () { };
  
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
  private void setPhno (int newVar) {
    phno = newVar;
  }

  /**
   * Get the value of phno
   * @return the value of phno
   */
  private int getPhno () {
    return phno;
  }

  /**
   * Set the value of experience
   * @param newVar the new value of experience
   */
  private void setExperience (int newVar) {
    experience = newVar;
  }

  /**
   * Get the value of experience
   * @return the value of experience
   */
  private int getExperience () {
    return experience;
  }

  //
  // Other methods
  //

  /**
   */
  public void add_blood()
  {
  }


  /**
   */
  public void waste_blood()
  {
  }


  /**
   */
  public void remove_blood()
  {
  }


}
