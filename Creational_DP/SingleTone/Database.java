package Creational_DP.SingleTone;

public class Database {
    public static Database databaseInstance;
    private String connectionString;

    private Database(String connectionString) {
        this.connectionString = connectionString;
    }

    public static Database getDatabaseInstance(String connectionString) {
        if (databaseInstance == null) {
            databaseInstance = new Database(connectionString);
        }
        return databaseInstance;
    }

    public String getConnectionString() {
        return connectionString;
    }
}
