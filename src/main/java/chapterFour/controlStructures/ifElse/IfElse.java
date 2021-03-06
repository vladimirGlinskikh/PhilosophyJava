package chapterFour.controlStructures.ifElse;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 08.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class IfElse {
    static int result = 0;

    static void test(int testval, int target) {
        if (testval > target)
            result = +1;
        else if (testval < target)
            result = -1;
        else
            result = 0;
    }

    public static void main(String[] args) {
        test(10, 5);
        print(result);
        test(5, 10);
        print(result);
        test(5, 5);
        print(result);
    }
}
