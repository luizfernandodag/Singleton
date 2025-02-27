public class Singleton {

    private static Singleton instance;

    private Singleton()
    {
        System.out.println("Singleton instance created");
    
    }

    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }

        return instance;

    }

    public void showMessage()
    {
        System.out.println("Hello from singleton ");
    }

    public static void main(String[] args) {

        Singleton singleton1 = new Singleton();
        Singleton singleton2 = new Singleton();

        singleton1.showMessage();

        System.out.println("singleton1 hashcode:" + singleton1.hashCode());
        System.out.println("singleton2 hashcode:" + singleton2.hashCode());

        
    }

}
