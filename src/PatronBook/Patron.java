
package PatronBook;

import java.util.Scanner;

 
public class Patron {
    String name, pname;
    Object b1, b2, b3, b4, b5;
    Patron(String name) {

    }
    Patron p = new Patron();

    private Patron() {
        
    }
    
       public String getName(){
           Scanner input = new Scanner(System.in);
           System.out.println("Enter Your Name: ");
           this.pname = input.nextLine();
           
           return pname;
}
       public String hasBook(){
               return name;
}
       public boolean Borrow(Book b, String a){
           if (b1==null){
               b1 = b;
               return true;
           }
           else if (b1==a){
                return false;
       }
           else if (b2==null){
               b2 = b;
               return true;
           }
           else if(b2==a) {
                   return false;
       }
           else if (b3==null){
               b3 = b;
               return true;
           }
           else if(b3==a){
                   return false;
           }
       }
       public boolean returnBook(Book b){
           if(b1 == b){
               b1=null;
               return true;
           }
           
           if(b2 == b){
               b2=null;
               return true;
           }
           
           if(b3 == b){
               b3=null;
               return true;
           }
             
         System.out.println("Leading 4 books to " + p.getName());
         if (p.Borrow(b1))   System.out.println (b1.getTitle() + " successfully borrowed. ");
         else                System.out.println (b1.getTitle() + " could not be borrowed. ");

         if (p.Borrow(b2))   System.out.println (b2.getTitle() + " successfully borrowed. ");
         else                System.out.println (b2.getTitle() + " could not be borrowed. ");)
         
         if (p.borrow(b3))   System.out.println (b3.getTitle() + " successfully borrowed. ");
         else                System.out.println (b3.getTitle() + " could not be borrowed. ");
}
       
   
       

