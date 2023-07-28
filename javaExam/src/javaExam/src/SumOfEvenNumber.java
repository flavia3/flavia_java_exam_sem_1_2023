//Quetion 1(i)
public class SumOfEvenNumber {
    public static void main(String[] args){
//        initialising an array of even numbers less than 8
        int[] arr1 = {2,4,6};
        int sum = 0;
//        looping through the array and adding its numbers to get its sum
        for (int i: arr1) {
            sum += i;
        }
        System.out.println("The sum of even numbers less than 8 is "+ sum);
    }
}
