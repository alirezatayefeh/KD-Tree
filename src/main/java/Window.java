import java.util.ArrayList;

public class Window {
    public ArrayList<Point> list = new ArrayList<>();

    public Point[] range = new Point[4];
    public Window l, r, f;

    public int situ;

    public Window(Point[] range, int situ) {
        this.range = range;
        this.situ = situ;
    }

    public void sortX() {
        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j).x > list.get(j + 1).x) {
                    Point temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public void sortY() {
        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j).y > list.get(j + 1).y) {
                    Point temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public void findPoints(ArrayList<Point> listii) {
        if (situ == 1) {
            for (int i = 0; i < listii.size(); i++) {
                //System.out.println("I am searching");
                int x = listii.get(i).x;
                if (x > range[0].x && x <= range[1].x) {
                    this.list.add(listii.get(i));
                }
            }
        } else {
            for (int i = 0; i < listii.size(); i++) {
                int y = listii.get(i).y;
                if (y > range[0].y && y <= range[2].y) {
                    this.list.add(listii.get(i));
                }
            }
        }
    }

    public Point middle() {
        if (situ == 0) {
            sortX();
            return list.get(list.size() / 2 - 1);
        } else {
            sortY();
            return list.get(list.size() / 2);
        }
//
//		if (list.size() % 2 == 0)
//			return list.get(list.size() / 2 -1);
//		else
//			return list.get(list.size() / 2 -1);

    }
}
