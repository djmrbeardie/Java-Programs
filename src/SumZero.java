public class SumZero {
    public static void main(String[] args) {
        int[] array = {1,3,-5,7,8,20,-40,6};
        int desiredResult = 0;
        int nearestValue = Integer.MAX_VALUE;
        int min=0,max=1;
        nearestValue = array[0]+array[1];
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                int sum = array[i]+array[j];
                if(Math.abs(nearestValue) > Math.abs(sum))
                {
                    nearestValue = sum;
                    min = i;
                    max = j;
                }
            }
        }

        System.out.println(array[min]+" "+array[max]+"->"+nearestValue);


    }
}
