package chapterSeven.theCombinationOfCompositionAndInheritance;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 13.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Fork extends Utensil {
    Fork(int i) {
        super(i);
        print("Constructor Fork.");
    }
}
