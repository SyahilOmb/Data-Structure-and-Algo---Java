public class reversing {


public static void reversingArray(int arry[]){
  int first = 0 ; int last = arry.length - 1;
  while(first < last){
    int temp = arry[last];
    arry[last] = arry[first];
    arry[first] = temp;

    first++;
last--;
  } 
}

    public static void main(String[] args) {
        int arry[] = {1,2,3,6,7,8,9,50};

        reversingArray(arry);
        for (int idx = 0; idx < arry.length; idx++) {
            System.out.print("array ekemnets :" + arry[idx]);
            
        }
    }
}
