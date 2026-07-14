public class RangePrimeNumbers {
    RangePrimeNumbers(int start, int end){
        for(int i=start;i<=end;i++){
            boolean isPrime=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime && i>1){
                System.out.print(i+" ");
            }
        }
        }
    public static void main(String[] args) {
        RangePrimeNumbers rangePrimeNumbers=new RangePrimeNumbers(10,50);
        System.out.println("Prime number between 10 and 50 are: "+rangePrimeNumbers);
    }
    
}
