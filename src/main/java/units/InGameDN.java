package units;

import java.sql.Array;
import java.util.ArrayList;

public interface InGameDN {
    void step(ArrayList<Units> units1, ArrayList<Units> units2);
    String getInfo();
    float getHealth();

}
