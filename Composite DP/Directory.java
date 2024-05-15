import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    public int size;
    public List<FileSystemComponent> children;

    

    public Directory() {
        this.size = 0;
        childrens = new ArrayList<>();
    }

    public void add(FileSystemComponent component){
        childrens.add(component);
    }

    @Override
    public int fileSystem() {
        for (FileSystemComponent component : children) {
            size += component.fileSystem();
        }
        return size;
    }

}
