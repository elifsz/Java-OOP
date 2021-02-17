package Memory;

import ClinicalCase.ClinicalCase;

/**
 *
 * @author elif
 */
public class Alzheimer extends MemoryDeficit {

    private String decliningArea;
    private static int totalAlzheimer = 0;
    private ClinicalCase clin;

    public Alzheimer(String deficitID, String memoryLoss,
            String decliningArea,
            String patientID, String patientName, String patientSurname,
            int age, String gender) {
        super(deficitID, memoryLoss);
        this.decliningArea = decliningArea;
        clin = new ClinicalCase(patientID, patientName,
                patientSurname, age, gender);
        totalAlzheimer++;
    }

    public static int getTotalAlzheimer() {
        return totalAlzheimer;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + clin
                + "\nDeclining Area: " + decliningArea;
    }

}
