package Overriding;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OverridingMain {
    public static void main(String[] args) {
        /* For m1 */
        Parent p11 = new Parent();
        try {
            p11.m1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Parent p12 = new Children();
        try {
            p12.m1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Children c1 = new Children();
        c1.m1();
        /* End */

        /* For m2*/
        Parent p21 = new Parent();
        p21.m2();

        Parent p22 = new Children();
        p22.m2();

        Children c21 = new Children();
        c21.m2();
        /* End */

        /* For m3 */
        Parent p31 = new Parent();
        try {
            p31.m3();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Parent p32 = new Children();
        try {
            p32.m3();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Children c31 = new Children();
        try {
            c31.m3();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /* End */

        /* For m4 */
        Parent p41 = new Parent();
        try {
            p41.m4();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent p42 = new Children();
        try {
            p42.m4();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Children c41 = new Children();
        try {
            c41.m4();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /* End */

        /* For m5 */
        Parent p51 = new Parent();
        try {
            p51.m5();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent p52 = new Children();
        try {
            p52.m5();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Children c51 = new Children();
        try {
            c51.m5();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
            e.printStackTrace();
        }
        /* End */

        /* For m6 */
        Parent p61 = new Parent();
        try {
            p61.m6();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent p62 = new Children();
        try {
            p62.m6();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Children c61 = new Children();
        try {
            c61.m6();
        } catch (EOFException e) {
            e.printStackTrace();
        }
        /* End */

        /* For m7 */
        Parent p71 = new Parent();
        try {
            p71.m7();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent p72 = new Children();
        try {
            p72.m7();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Children c71 = new Children();
        c71.m7();
        /* End */
    }
}
