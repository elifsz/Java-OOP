
import Memory.Alzheimer;
import Memory.Amnesia;
import Memory.MemoryDeficit;
import java.util.ArrayList;

/**
 *
 * @author elif
 */
public class InfoClass {

    public static ArrayList<MemoryDeficit> memoryArrayList = new ArrayList<>();

    public static void addMemory(MemoryDeficit def) {
        memoryArrayList.add(def);
    }

    public static String getAllMemory() {
        String res = "";
        for (int i = 0; i < memoryArrayList.size(); i++) {
            res += memoryArrayList.get(i).toString() + "\n";
        }
        return res;

    }

    public static String getAmnesia() {
        String res = "";
        for (int i = 0; i < memoryArrayList.size(); i++) {
            if (memoryArrayList.get(i) instanceof Amnesia) {
                res += memoryArrayList.get(i).toString() + "\n";
            }
        }
        return res;

    }

    public static String getAlzhemier() {
        String res = "";
        for (int i = 0; i < memoryArrayList.size(); i++) {
            if (memoryArrayList.get(i) instanceof Alzheimer) {
                res += memoryArrayList.get(i).toString() + "\n";
            }
        }
        return res;

    }

    public static MemoryDeficit searchMemory(String id) {
        for (int i = 0; i < memoryArrayList.size(); i++) {
            if (memoryArrayList.get(i).getDeficidID() == id) {
                return memoryArrayList.get(i);
            }
        }
        return null;

    }

    public static String showTotalMemory() {
        String res = Integer.toString(MemoryDeficit.getTotalDeficit());
        return res;

    }

    public static String showTotalImprovement() {
        String res = "";
        return res;

    }

}
