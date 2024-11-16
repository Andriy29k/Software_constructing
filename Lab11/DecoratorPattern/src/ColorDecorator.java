public class ColorDecorator extends RectangleDecorator {
    private String color;
    public ColorDecorator(Rectangle rectangle, String color) {
        super(rectangle);
        this.color = color;
    }

    @Override
    public void draw(){
        decoratedRectangle.draw();
        System.out.println("Color: " + color);
    }
}
