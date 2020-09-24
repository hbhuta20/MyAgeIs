class CheckMyAge {
  public static void main(String[] args) {
    int myAge = 15;
    int myBirthday = 23;
    int todaysDate = 24;

    System.out.println(" I am "+ myAge + " years old.");
    System.out.println(" I was born on "+ myBirthday + "rd Febraury 2005.");
    System.out.println(" Today is "+ todaysDate +"th September 2020 and it is a Thursday.");

    if(myAge==todaysDate){
      myAge=myAge+1;
      System.out.println(" I am "+ myAge +" years old.");
    }else if(myAge!=todaysDate){
      System.out.println(" I am " + myAge + " years old.");
    }

  }
}