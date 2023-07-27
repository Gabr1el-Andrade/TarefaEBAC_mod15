public class Demo {
    public static void main(String[] args) {
    Costumer cliente = new Costumer("B", true);
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.starEngine();
    }

    private static Factory getFactory(Costumer cliente) {
if (cliente.isHasCompanyContract()){
      return new ContratosFactory();
    } else {
    return new SemContrato();

}
    }

}
