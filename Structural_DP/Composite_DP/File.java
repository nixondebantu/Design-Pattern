package Structural_DP.Composite_DP;

public class File implements FileSystemComponent{
    private int size;

    public File(int size) {
        this.size = size;
    }


    @Override
    public int fileSize() {
        return size;
    }

}
