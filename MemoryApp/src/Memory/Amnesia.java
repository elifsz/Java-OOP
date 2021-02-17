package Memory;

import ClinicalCase.ClinicalCase;

/**
 *
 * @author elif
 */
public class Amnesia extends MemoryDeficit {

    private String amnesiaType;
    private String cause;
    private String location;
    private ClinicalCase clin;
    private static int totalAmnesia = 0;

    public Amnesia(String deficitID, String memoryLoss,
            String amnesiaType, String cause, String location,
            String patientID, String patientName,
            String patientSurname, int age, String gender) {
        super(deficitID, memoryLoss);
        this.amnesiaType = amnesiaType;
        this.cause = cause;
        this.location = location;
        clin = new ClinicalCase(patientID, patientName,
                patientSurname, age, gender);
        totalAmnesia++;
    }

    public static int getTotalAmnesia() {
        return totalAmnesia;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + clin
                + "\nAmnesia Type: " + amnesiaType
                + "\nCause: " + cause + "\nLocation: " + location;
    }

}
