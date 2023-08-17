package homework2;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

/**
 * task1
 */
public class task1 {
    public static void main(String[] args) throws IOException {
        int [] array = {2, 4, 1, -7, -3, 64, 10, -123, 20, -54, 0};
        for (int i : array) {
            System.out.print(i);
        }
        int[] newArr = listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        for (int i : newArr) {
            System.out.println(i);
        }
    }
    public static int[] listSort(int [] arr) throws SecurityException, IOException{
        Logger logger = Logger.getLogger(task1.class.getName());
        FileHandler fh = new FileHandler("homework2/logTaskbubble.xml", false);
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        String sb;
        for(int k = 0; k < arr.length-1; k++) {
            
            for (int i = 0; i < arr.length - k-1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
                sb = Arrays.toString(arr);
                logger.info(sb);
            }
        }
        return arr;
    }
    
}
