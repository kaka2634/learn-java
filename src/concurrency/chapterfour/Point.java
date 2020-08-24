package concurrency.chapterfour;

import net.jcip.annotations.Immutable;

//Immutable class is threadSafe
@Immutable
public class Point {
    public final int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
