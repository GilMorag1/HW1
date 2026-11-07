import java.util.Arrays;

public class Assignment01Q04 {
    private static int[] Reverse(int[] array ,int start,int end){
        int limit = (end-start+1) / 2;
        int counter = 0;
        while (counter < limit) {
            int first = array[start + counter];
            int last = array[end - counter];
            array[start + counter] = last;
            array[end-counter] = first;
            counter++;
        }
        return array;
    }
    private static int Adujst(int n, int move, char direction){
        move = move % n;
        if (direction == 'L'){move = -move;}
        return ((move + n) % n);
    }
    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (array.length == 0 ){return array;}
        else if (((direction!='R') && (direction!='L')) || (move % array.length == 0)){return array;}
        else{
            move = Adujst(array.length, move, direction);
            array = Reverse(array, 0, array.length-1);
            array = Reverse(array, 0, move-1);
            array = Reverse(array, move, array.length-1);
            return array;
        }  
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}