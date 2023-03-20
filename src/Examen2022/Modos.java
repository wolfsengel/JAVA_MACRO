package Examen2022;

/**
 *
 * DELEGATE
 *
 */

interface Mode {
    String getColor();
    void display();
}
class DarkMode implements Mode {
    private final String color;
    public DarkMode(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;

    }
    public void display() {
        System.out.println("Dark Mode..." + color);
    }
}
class LightMode implements Mode {
    private final String color;
    public LightMode(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void display() {
        System.out.println("Light Mode..." + color);
    }
}
class MyCustomMode implements Mode {
    private final Mode mode;
    public MyCustomMode(Mode mode) {
        this.mode = mode;
    }
    public String getColor() {
        return mode.getColor();
    }
    public void display() {
        mode.display();
    }
}
class App{
    public static void main(String[] args) {
        MyCustomMode mimodo= new MyCustomMode(new DarkMode("OSCURO PERSONALIZADO"));
        mimodo.display();
        mimodo= new MyCustomMode(new LightMode("CLARO PERSONALIZADO"));
        mimodo.display();
    }
}
