
package rijia.rebecca.hou_assignment2_p3;
/**
 * LinearSearch realization
 */
public class LinearSearch {
/**
 * The method for finding a key in the list
 * @return the position of the key in the array
 */
 public static int linearSearch(int[] list, int key) {
    for (int i = 0; i < list.length; i++) {
      if (key == list[i])
        return i;
    }
    return -1;
  }    
}
