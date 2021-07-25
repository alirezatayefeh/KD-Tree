public class KdTree {
    public void inOrder(Window w) {
        System.out.println(w.list.size());
        if (w.list.size() == 1) {
            System.out.println("point x is: " + w.list.get(0).x + " and  y is: " + w.list.get(0).y);
            return;
        }
        if (w.list.size() == 0) {
            System.out.println("this is null");
            return;
        } else {

            if (w.situ == 0) {
                Point temp = w.middle();
                Point[] range = new Point[4];
                range[0] = w.range[0];
                range[1] = new Point(temp.x, w.range[1].y);
                range[2] = w.range[2];
                range[3] = new Point(temp.x, w.range[3].y);
                Window wl = new Window(range, 1);
                w.l = wl;
                wl.f = w;

                Point[] range2 = new Point[4];
                range2[0] = new Point(temp.x, w.range[0].y);
                range2[1] = w.range[1];
                range2[2] = new Point(temp.x, w.range[2].x);
                range2[3] = w.range[3];
                Window wr = new Window(range2, 1);
                w.r = wr;
                wr.f = w;

                wr.findPoints(w.list);
                wl.findPoints(w.list);

                inOrder(wl);
                inOrder(wr);
            } else {
                Point temp = w.middle();
                Point[] range = new Point[4];
                range[0] = w.range[0];
                range[1] = w.range[1];
                range[2] = new Point(w.range[2].x, temp.y);
                range[3] = new Point(w.range[3].x, temp.y);
                Window wr = new Window(range, 0);
                w.r = wr;
                wr.f = w;

                Point[] range2 = new Point[4];
                range2[0] = new Point(w.range[0].x, temp.y);
                range2[1] = new Point(w.range[1].x, temp.y);
                range2[2] = w.range[2];
                range2[3] = w.range[3];
                Window wl = new Window(range2, 0);
                w.l = wl;
                wl.f = w;


                wl.findPoints(w.list);
                wr.findPoints(w.list);

                inOrder(wl);
                inOrder(wr);


            }

        }

    }
}
