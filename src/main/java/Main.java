public class Main {
    public static void main(String[] args) {
        //create leaf object (files)
        FileSystemComponent file1 = new File("Take Care.opus", 5000);
        FileSystemComponent file2 = new File("Myth.opus", 4000);

        //new Directory (composite)
        Directory directory = new Directory("Beach House");
        Directory directory2 = new Directory("Artist");

        directory2.addComponent(directory);

        directory.addComponent(file2);
        directory.addComponent(file1);

        System.out.println("==============================================");
        directory2.display();
        System.out.println("==============================================");

    }
}
