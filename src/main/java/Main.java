public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Point p1 = new Point(6, 6);
        Point p2 = new Point(2, 2);
        Point p3 = new Point(8, 8);
        Point p4 = new Point(3, 4);
        Point p5 = new Point(7, 5);
        Point p6 = new Point(9, 9);

        KdTree k = new KdTree();

        Point start = new Point(0, 0);
        Point right = new Point(10, 0);
        Point left = new Point(0, 10);
        Point end = new Point(10, 10);
        Point[] range = new Point[4];
        range[0] = start;
        range[1] = right;
        range[2] = left;
        range[3] = end;

        Window w = new Window(range, 0);

        w.list.add(p1);
        w.list.add(p2);
        w.list.add(p3);
        w.list.add(p4);
        w.list.add(p5);
        w.list.add(p6);
        // w.list.add(p1);

        k.inOrder(w);
    }
}
