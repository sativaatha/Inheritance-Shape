package PersonStudentTeacher.ShapeCircleRectangleCube;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(){
        super();
        length = 0;
        width = 0;
    }
    public Rectangle(String name, String color, int length, int width){
        super(name, color);
        this.length = length;
        this.width = width;
    }

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
    public void print(){
        super.print();
        System.out.println("Length:\t" +length);
        System.out.println("Width:\t" +width);
    }
    public void luas(){
        System.out.println("Luas Rectangle adalah " + (length*width));
    }


}
