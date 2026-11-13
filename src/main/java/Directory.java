import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent{
    private String name;
    private List<FileSystemComponent> components;

    public Directory(String name){
        this.name=name;
        this.components = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println("Folder name: "+name);
        for(FileSystemComponent component: components){
            component.display();
        }
    }

    public void addComponent( FileSystemComponent component){
        components.add(component);
    }
}
