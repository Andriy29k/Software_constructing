public class LineStyleDecorator extends RectangleDecorator {
    String lineStyle;

    public LineStyleDecorator(Rectangle rectangle, String lineStyle) {
        super(rectangle);
        this.lineStyle = lineStyle;
    }

    @Override
    public void draw(){
        decoratedRectangle.draw();
        System.out.println("Line Style: "+ lineStyle);
    }
}
