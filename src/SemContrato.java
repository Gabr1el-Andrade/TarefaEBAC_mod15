public class SemContrato extends Factory {
    @Override
    Car retriveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new FuscaCar(100, "meio cheio", "cinza");
        } else if ( "B".equals(requestedGrade)) {
            return new PalioCar(100, "cheio", "vermelho");
        }
        return null;
    }  }


