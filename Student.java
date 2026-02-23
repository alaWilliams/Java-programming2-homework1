package dev.m3s.programming2.homework1;

public class Student {
  //attributes
  private String firstName = ConstantValues.NO_NAME;
  private String lastName = ConstantValues.NO_NAME;
  private int id;
  private double bachelorCredits;
  private double masterCredits;
  private String titleOfMasterThesis = ConstantValues.NO_TITLE;
  private String titleOfBachelorsThesis = ConstantValues.NO_TITLE;
  private int startYear = java.time.Year.now().getValue();
  private int graduationYear;
  private String birthDate = ConstantValues.NO_BIRTHDATE;

  //constructors
  Student() {
    this.firstName = ConstantValues.NO_NAME;
    this.lastName = ConstantValues.NO_NAME;
    this.id = ConstantValues.MIN_ID + (int)(Math.random() * (ConstantValues.MAX_ID - ConstantValues.MIN_ID + 1));
    this.bachelorCredits = 0.0;
    this.masterCredits = 0.0;
    this.titleOfMasterThesis = ConstantValues.NO_TITLE;
    this.titleOfBachelorsThesis = ConstantValues.NO_TITLE;
    this.startYear = java.time.Year.now().getValue();
    this.graduationYear = -1;
    this.birthDate = ConstantValues.NO_BIRTHDATE;
  };

  Student(String lname, String fname) {
    this.firstName = fname;
    this.lastName = lname;
    this.id = ConstantValues.MIN_ID + (int)(Math.random() * (ConstantValues.MAX_ID - ConstantValues.MIN_ID + 1));
    this.bachelorCredits = 0.0;
    this.masterCredits = 0.0;
    this.titleOfMasterThesis = ConstantValues.NO_TITLE;
    this.titleOfBachelorsThesis = ConstantValues.NO_TITLE;
    this.startYear = java.time.Year.now().getValue();
    this.graduationYear = -1;
    this.birthDate = ConstantValues.NO_BIRTHDATE;
  };

  //methods
  public String getFirstName () {
    return firstName;
  };

  public void setFirstName(String firstName) {
    if (firstName != null) {
      this.firstName = firstName;
    } 
  };

    public String getLastName () {
    return lastName;
  };

  public void setLastName(String lastName) {
    if (lastName != null) {
      this.lastName = lastName;
    }
  };

  public int getId () {
    return id;
  };

  public void setId(final int id) {
    if (id >= ConstantValues.MIN_ID && id <= ConstantValues.MAX_ID) {
        this.id = id;
    }
  };

  public double getBachelorCredits () {
    return bachelorCredits;
  };

 public void setBachelorCredits(final double bachelorCredits) {
    if (bachelorCredits >= ConstantValues.MIN_CREDITS && bachelorCredits <= ConstantValues.MAX_CREDITS) {
        this.bachelorCredits = bachelorCredits;
    }
}



}
