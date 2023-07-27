import java.util.Arrays;

public abstract class Car {
    private int horsePower;
    private String fuelSource;
    private String color;

        public Car(int horsePower, String fuelSource, String color){
            this.color = color;
            this.fuelSource = fuelSource;
            this.horsePower = horsePower;
        }

        public void starEngine(){
            for (String s : Arrays.asList(" 0 nome do carro em qustao é " + getClass().getSimpleName(), "O tanque está " + fuelSource + " e o motor foi ligado e está pronto para utilizar " + horsePower + " cavalos de potencia")) {
                System.out.println(s);
            }
        }
        public void clean(){
            System.out.println("O carro foi limpo e a cor " + color.toLowerCase() + " foi polida  ");
}
        public void mechanicCheck(){
            System.out.println("O carro foi verificado pelo mecânico. Tudo parece bem");
}
        public void fuelCar (){
            System.out.println("O carro está sendo abastecido com " + fuelSource.toLowerCase());
}

}
