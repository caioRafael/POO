public class Questao14 {
    public static void main(String[] args){
        // utilizei valores inteiros pois não acho que seja possivel ter 1/2 pessoas
        int populationA = 7000;
        int populationB = 20000;
        int years = 0;

        while(populationA < populationB){

            populationA += (0.035*populationA);
            populationB += (0.01*populationB);

            years+=1;
        }

        System.out.println("Cidade A: "+populationA);
        System.out.println("Cidade B: "+populationB);
        System.out.println("A populacao da cidade A ultrapassou a populacao da cidade B em "+years+" anos");
    }
}
