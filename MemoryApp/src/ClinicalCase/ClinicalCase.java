/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicalCase;

/**
 *
 * @author elif
 */
public class ClinicalCase {

    private String patientID;
    private String patientName;
    private String patientSurname;
    private int age;
    private String gender;

    public ClinicalCase(String patientID, String patientName, String patientSurname, int age, String gender) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nPatient ID: " + patientID + "\nPatient Name: "
                + patientName + "\nPatient Surname: " + patientSurname
                + "\nAge: " + age + "\nGender: " + gender;

    }

    public String getPatientID() {
        return patientID;
    }

}
