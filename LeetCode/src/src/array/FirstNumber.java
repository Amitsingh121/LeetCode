package src.array;

public class FirstNumber {
    public static void main(String[] args){
        int[] arr ={43,22,13,44};
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("Enhanced For Loop");

        for(int a : arr){
            a = a+1;
            System.out.println(a);
        }

        System.out.println("new array resut");

        for(int a : arr){

            System.out.println(a);
        }
    }
}
