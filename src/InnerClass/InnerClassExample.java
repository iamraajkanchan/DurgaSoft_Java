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

            public static class WifeDrawer {
                private final String drawerName = "MillerKnoll";
                private final InnerClassExample instance = new InnerClassExample();

                void makeup() {
                    System.out.println(instance.a + " is doing make up on a " + drawerName + " drawer.");
                }

                void clean() {
                    System.out.println(instance.a + " is cleaning " + drawerName + " drawer.");
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
