public class Costumer {
    private String gradeRequest;
    private boolean hasCompanyContract;

        public Costumer ( String gradeRequest, boolean hasCompanyContract){
            this.gradeRequest = gradeRequest;
            this.hasCompanyContract = hasCompanyContract;
        }

    public boolean isHasCompanyContract() {
        return hasCompanyContract;
    }

    public String getGradeRequest() {
        return gradeRequest;
    }
}

