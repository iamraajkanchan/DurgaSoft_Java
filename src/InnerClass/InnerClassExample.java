package InnerClass;

public class InnerClassExample {
    public String a = "anushka";

    public class MyHome {
        void cook() {
            System.out.println(a + " is cooking");
        }

        public class BrotherRoom {

            public class WifeMirror {
                String mirrorName = "Gold Round Mirror";

                void makeup() {
                    System.out.println(a + " is doing make up on a drawer");
                }
            }

            public class WifeDrawer {
                String taylor = "Taylor Swift";

                void makeup() {
                    System.out.println(taylor + " is doing make up on a drawer");
                }

            }


        }

        public class FatherRoom {
            public class WifeDrawer {

            }
        }

        public class MotherRoom {

        }

    }
}
