
public class LeranWriters {
public static void main(String[] args) {
    File f = new File("test.txt");
    FileWriter fw;
    try {
        fw = new FileWriter(f);
        fw.write("Test");
        fw.write("\n");
        fw.write("Automation..................");
        fw.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
