public class Questao10 {
    public static void main(String[] args){
        int numbers = 1;

        for(int i = 0; i < 6; i++){
            for(int x = numbers; x < numbers+10; x++){
                if(x < 10){
                    System.out.print("0"+x+" ");
                }else{
                    System.out.print(x+" ");
                }

            }
            System.out.print('\n');
            numbers+=10;
        }
    }
}
