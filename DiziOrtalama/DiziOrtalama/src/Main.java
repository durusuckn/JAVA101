public class Main {
    public static void main(String[] args) {
        double [] arr={1,2,3,4,5};
        double sum=0;
        double harmonik=0;

        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            harmonik+=1/arr[i];
        }

        System.out.println("Aritmetik: "+sum/arr.length);
        System.out.println("Harmonik: "+harmonik);

    }
}