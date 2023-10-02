
public class Testdrive {

    public static void main(String[] args) {
      Application app1 = new Application( new WindowsFactory());
        app1.render();
        Application app2 = new Application( new MacFactory());
        app2.render();
    }

}