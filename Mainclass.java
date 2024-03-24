public class MainClass {
    public static void main(String[] args) {
        EncapsulatedClass obj = new EncapsulatedClass();
        obj.setName("Fadhlan");
        obj.setAge(20);
        
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
