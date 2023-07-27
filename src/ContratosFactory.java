public class ContratosFactory extends Factory {
    @Override
    Car retriveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new ChevetteCar(150, "cheio", "preto");
        } else if ("B".equals(requestedGrade)) {
            return new MustangCar(200, "cheio", "azul");
        } ;
        return null;
    }
    }

