package units;

import java.util.ArrayList;

public class Coordinates {

    int x,y;

    public Coordinates (int x, int y) {
        this.x = x;
        this.y = y;
    }

    //ситает расстояния
    public double countDistance(Coordinates coordinates){
        int dx = coordinates.x - x;
        int dy = coordinates.y - y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }


    //рассчитывает куда встать
    public Coordinates newPosition (Coordinates units) {
        Coordinates currentPos = new Coordinates(x,y);
        //если расстояние больше по координате х
            if (Math.abs(units.x - currentPos.x) > Math.abs(units.y - currentPos.y)) {
                if (units.x - currentPos.x > 0 ) currentPos.x +=1;
                else currentPos.y -=1;
            }
        //если расстояние больше по координате у
            if (Math.abs(units.x - currentPos.x) < Math.abs(units.y - currentPos.y)) {
                if (units.y - currentPos.y > 0 ) currentPos.y +=1;
                else currentPos.x -=1;
            }
        // если по диагонали ровно
            if (Math.abs(units.x - currentPos.x) == Math.abs(units.y - currentPos.y)) {
                if (units.x - currentPos.x > 0 ) {
                    currentPos.x += 1;
                    currentPos.y +=1;
                }
                else {
                    currentPos.x -= 1;
                    currentPos.y -= 1;
                }
            }
        return currentPos;
    }

    public boolean containsByPos (Coordinates unit, ArrayList<Units> ally){
        for (Units units: ally){
            if (units.coordinates == unit) return  true;
        }
        return false;
    }




}
