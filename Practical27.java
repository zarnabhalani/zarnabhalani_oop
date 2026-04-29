import java.io.*;

public class StudentFile {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("students.txt");
            fw.write("1 Zarna 85\n");
            fw.write("2 Riya 90\n");
            fw.write("3 Amit 78\n");
            fw.close();

            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            System.out.println("Student Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (fw != null) fw.close();
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
