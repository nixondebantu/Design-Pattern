package Creational_DP.SingleTone;

public class Client {
    public static void main(String[] args) {
        Database session1 = Database.getDatabaseInstance("value-1");
        System.out.println(session1.getConnectionString());

        Database session2 = Database.getDatabaseInstance("value-2");
        System.out.println(session2.getConnectionString());

        System.out.println("Session1 and Session2 are same: " + (session1 == session2));
    }
}
