package Structural_DP.Composite_DP;

public class Client {
    public static void main(String[] args) {
        File f0 = new File(600);
        File f1 = new File(200);
        File f2 = new File(100);
        File f3 = new File(900);
        File f4 = new File(500);

        Directory dir1 = new Directory();
        Directory dir2 = new Directory();
        Directory dir3 = new Directory();
        Directory root = new Directory();

        dir3.addComponent(f3);
        dir3.addComponent(f4);
        dir2.addComponent(dir3);
        dir2.addComponent(f2);
        dir1.addComponent(dir2);
        dir1.addComponent(f1);
        root.addComponent(dir1);
        root.addComponent(f0);

        System.out.println(root.fileSize());

    }
}
