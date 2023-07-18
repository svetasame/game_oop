package units;

import java.sql.Array;
import java.util.ArrayList;

public interface InGameDN {
    void step(ArrayList<Units> enemy, ArrayList<Units> ally);
    String getInfo();
    int getSpeed();
    int getHealth();


}
