public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int limit = Integer.parseInt(args[0]);
        double dividor = 1;
        int counter = 0;
        for (int i=0; i<limit; i++){
            if (counter % 2 == 0){
                approxPi += (1 / dividor);
            } else{
                approxPi -= (1 / dividor);
            }
            counter++;
            dividor += 2; 
        }
        approxPi = 4 * approxPi;        
        System.out.println(approxPi + " " + actualPi);
    }
}
