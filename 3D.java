import java.util.*;
public class Main
{
	public static void main(String[] args) {
    int[][][] arr = null; 
    int grandParentSize = 0; 
    int parentSize = 0; 
    int childSize = 0;
    Scanner scan = null;
    scan = new Scanner(System.in);
    System.out.print(
        "Enter grandparent parent and child size = ");
    grandParentSize = scan.nextInt();
    parentSize = scan.nextInt();
    childSize = scan.nextInt();
    arr = new int[grandParentSize][parentSize][childSize];
    System.out.println("Enter array elements: ");
    for(int i=0; i<grandParentSize; i++) {
      for(int j=0; j<parentSize; j++) {
        for(int k=0; k<childSize; k++) {
          System.out.print("Element["+i+"]["+j+"]["+k+"]: ");
          arr[i][j][k] = scan.nextInt();
        }
      }
    }
    System.out.println("\nEntered 3D array,");
    for(int[][] i: arr){
      for(int[] j : i){
        for(int k: j){
          System.out.print(k + " ");
        }
        System.out.println();
      }
      System.out.println();
    }

   }
}
