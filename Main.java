import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr,int value){
        for(int i:arr){
            if(i==value){
              return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] array={3,7,3,6,3,2,9,10,21,1,33,9,1,2,2,4,4,6};
        int[] duplicate= new int[array.length];
        int startIndex=0;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                if ((i!=j) && (array[i]==array[j])){
                    if (!isFind(duplicate,array[i]) && (array[i]%2==0)){
                        duplicate[startIndex++]=array[i];
                    }
                    break;
                }
            }
        }
        System.out.print("Dizide tekrar eden çift sayılar sayılar: ");
            for (int value:duplicate){
                if (value!=0){
                    System.out.print(+value+" , ");
                }
        }
    }
}
