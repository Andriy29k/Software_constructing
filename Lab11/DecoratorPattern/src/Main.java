// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Rectangle basicRectangle = new BasicRectangle();
        Rectangle coloredRectangle = new ColorDecorator(basicRectangle, "Red");
        Rectangle styledRectangle = new LineStyleDecorator(coloredRectangle, "Solid");

        styledRectangle.draw();
    }
}