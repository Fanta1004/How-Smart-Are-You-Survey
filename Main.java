import java.util.Scanner;//Scanner
class Main {
  public static void main(String[] args) {
  System.out.println("\nWelcome to my survey! \n"); //This line will print welcome to my survey

  Scanner jared = new Scanner(System.in );

  System.out.println("\nWhat is your name?"); //Line 8 will ask what is your name
  String name = jared.next();
  
  System.out.println("\n5 x 5? \n"); //This will do a simple math calculation that the user/person should understand
  int num = jared.nextInt();

  if (num == 25) {
    System.out.println("\nGreat job!"); //Printing great job if right
  }else {
    System.out.println("\nNice try, But its wrong");//Printing if wrong
  }  
  
  for(int m = 0; m < 5; m++ ) { //For 
      System.out.println("\nHow is it going so far?"); //Question how is it going
    }
  System.out.println("\nGood or Bad?"); //Asking
  String gb = jared.next();

  System.out.println("\n What is the biggest living animal in the world? (If it is the blue whale pick 1, If it is the mammoth pick 2.\n"); //Animal 
  int ani = jared.nextInt();
  
  if (ani == 1) 
  {
    System.out.println("\nGreat Job!"); //Good job!
  }else {
    System.out.println("\nNice try, But its wrong (We asked living)");
  }
  
  }
}  
