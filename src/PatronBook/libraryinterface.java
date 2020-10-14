
package PatronBook;
import java.util.Scanner;
import java.awt.print.Book;
import static java.sql.JDBCType.NULL;

/**
 *
 * @author bsamra
 */
public class libraryinterface {
     String name;
     String author;
     Scanner input = new Scanner(System.in);
    
     
      
            
    public static void main(String[] args) {
    
        Book b1, b2, b3, b4, b5;
        Book b1 = new Book1("From Russia With Love", "Greg Hines") ;
        libraryinterface b2 = new libraryinterface("Living Smart","Rita Langill");
        libraryinterface b3 = new libraryinterface("Singing in the Rain","Harry Conner");
        libraryinterface b4 = new libraryinterface("Good Housekeeping","Pat Burns");
        libraryinterface b5 = new libraryinterface("To Be a Model", "Lisa Lahey");
        System.out.println("Here are the books available:"  );
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println("Leading 4 books to " + p.getName());
         if (p.Borrow(b1))   System.out.println (b1.getTitle() + " successfully borrowed. ");
         else                System.out.println (b1.getTitle() + " could not be borrowed. ");

         if (p.Borrow(b2))   System.out.println (b2.getTitle() + " successfully borrowed. ");
         else                System.out.println (b2.getTitle() + " could not be borrowed. ");)
         
         if (p.borrow(b3))   System.out.println (b3.getTitle() + " successfully borrowed. ");
         else                System.out.println (b3.getTitle() + " could not be borrowed. ");
}

        
            }
}

