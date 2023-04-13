package InnerClass;

public class InnerClassSimulator {
    public static void main(String... a) {
        InnerClassExample example = new InnerClassExample();
        System.out.println("Mirror Name " + example.new MyHome().new BrotherRoom().new WifeMirror().mirrorName);
        InnerClassExample.MyHome home = example.new MyHome();
        home.cook();
        InnerClassExample.MyHome.BrotherRoom.WifeDrawer drawer = new InnerClassExample.MyHome.BrotherRoom.WifeDrawer();
    }
}
