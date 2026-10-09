package DataStructures.Task2;

public class TwoDArray {
    public static void main(String[] args){
        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        System.out.println("2D Array:");
        int i = 0;
        while (i < numbers.length){
            int j = 0;
            while (j < numbers[i].length)
            {
                System.out.print(numbers[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
