package Structural_DP.Composite_DP;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private int size;
    private List<FileSystemComponent> childrens;

    

    public Directory() {
        this.size = 0;
        childrens = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component){
        childrens.add(component);
    }

    public void removeComponent(FileSystemComponent component){
        childrens.remove(component);
    }

    @Override
    public int fileSize() {
        for (FileSystemComponent component : childrens) {
            size += component.fileSize();
        }
        return size;
    }

}
