//question 4(iii)
public class Box {
    private float width;
    public Box(float width){
        this.width = width;
    }
//using getters and setters
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public static void main(String[] args){
//        creating instance of a box
        Box box1 = new Box(12.3F);
        System.out.println("before: "+box1.getWidth());
//        updating the width
        box1.setWidth(14.5F);
        System.out.println("after: "+box1.getWidth());
    }
}

