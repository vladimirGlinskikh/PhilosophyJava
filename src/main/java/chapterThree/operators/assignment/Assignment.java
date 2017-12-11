package chapterThree.operators.assignment;

import static util.print.Print.*;

/**
 * Created by Vladimir Glinskikh on 07.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();

        t1.level = 9;
        t2.level = 47;

        print("1: t1.level: " + t1.level +
                ", t2.level: " + t2.level);

        t1 = t2;
        print("2: t1.level: " + t1.level +
                ", t2.level: " + t2.level);

        t1.level = 27;
        print("3: t1.level: " + t1.level +
                ", t2.level: " + t2.level);
    }
}