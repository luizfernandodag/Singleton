public class Main {
public static void main(String[] args) {
     // Get the Singleton instance
     Singleton singleton1 = Singleton.getInstance();
     Singleton singleton2 = Singleton.getInstance();

     // Display message
     singleton1.showMessage();

     // Verify that both references point to the same instance
     System.out.println("singleton1 hashcode: " + singleton1.hashCode());
     System.out.println("singleton2 hashcode: " + singleton2.hashCode());
    
}
 
}
