public class Client {
    public static void main(String[] args) {
        File file0 = new File(20);
        File file1 = new File(50);
        File file2 = new File(80);

        Directory directory1 = new Directory();
        Directory root = new Directory();

        root.add(directory1);
        root.add(file0);
        root.add(file1);
        directory1.add(file2);

        System.out.println(root.fileSystem());

    }
}
