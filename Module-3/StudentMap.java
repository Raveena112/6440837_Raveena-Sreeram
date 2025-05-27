import java.util.HashMap;
import java.util.Scanner;
public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID and name (0 to stop):");
        while (true) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            if (id == 0) break;
            System.out.print("Name: ");
            String name = sc.nextLine();
            studentMap.put(id, name);
        }
        System.out.print("Enter ID to lookup: ");
        int lookupId = sc.nextInt();
        String result = studentMap.get(lookupId);
        if (result != null)
            System.out.println("Student Name: " + result);
        else
            System.out.println("ID not found.");

        sc.close();
    }
}
