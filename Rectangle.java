public class Rectangle{
    private int length;
    private int width;
    public Rectangle(){
        length=1;
        width=1;

    }
    public Rectangle(int length,int width){
        length=length;
        width=width;
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }

}
class Test{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(2,4);
        System.out.println(r1.getLength()+" "+r1.getWidth());
        System.out.println(r2.getLength()+" "+r2.getWidth());
    }

}