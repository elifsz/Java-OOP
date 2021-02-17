
package Memory;

/**
 *
 * @author elif
 */
public abstract class MemoryDeficit {

    protected String deficidID;
    protected String memoryLoss;
    protected static int totalDeficit = 0;

    public MemoryDeficit(String deficidID, String memoryLoss) {
        this.deficidID = deficidID;
        this.memoryLoss = memoryLoss;
        totalDeficit++;
    }

    @Override
    public String toString() {
        return "Deficit ID: " + deficidID + "\nMemory Loss: "
                + memoryLoss;
    }

    public String getDeficidID() {
        return deficidID;
    }

    public static int getTotalDeficit() {
        return totalDeficit;
    }

}
