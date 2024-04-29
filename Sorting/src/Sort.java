import java.util.Scanner;

public class Sort {
    static Scanner scanner=new Scanner(System.in);
    private int[] epic=new int[5];
    public void coolio() {
        int e=0;
        for (int i=0; i<epic.length;i++) {
            ++e;
            System.out.println("Please type int "+e);
            int newly = Integer.parseInt(scanner.next());
            epic[i]=newly;
        }
    }
    public void unsorted(){
        System.out.println("Unsorted: ["+epic[0]+", "+epic[1]+", "+epic[2]+", "+epic[3]+", "+epic[4]+"]");
    }
    public void sorted(){
        int temp;
        for(int i=0;i<epic.length-1;i++) {
            for (int j=0;j<epic.length-i-1;j++) {
                if (epic[j] > epic[j + 1]) {
                    temp = epic[j];
                    epic[j] = epic[j + 1];
                    epic[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted: ["+epic[0]+", "+epic[1]+", "+epic[2]+", "+epic[3]+", "+epic[4]+"]");
    }
}
