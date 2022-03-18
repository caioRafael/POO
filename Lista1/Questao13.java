public class Questao13 {
    public static void main(String[] args){
        int initial = 100, limit = 1000;
        double c,d,u, sum;

        for(int num = initial; num < limit; num++){
            c = num/100;
            d = num % 100/10;
            u = num %10;

            sum = Math.pow(c, 3)+Math.pow(d, 3)+Math.pow(u, 3);

            if(sum == num){
                System.out.println(num);
            }
            
        }
    }
}
