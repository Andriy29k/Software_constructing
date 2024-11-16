abstract class RectangleDecorator implements Rectangle {
    protected Rectangle decoratedRectangle;

    public RectangleDecorator(Rectangle rectangle){
        this.decoratedRectangle = rectangle;
    }

    @Override
    public void draw() {
        decoratedRectangle.draw();
    }
}
