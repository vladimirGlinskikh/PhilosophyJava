package chapterEight.theOrderOfInvocationOfConstructors;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 14.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Lunch extends Meal {
    public Lunch() {
        super();
        print("Lunch()");
    }
}
