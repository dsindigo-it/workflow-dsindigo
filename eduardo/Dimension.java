public class Dimension{
    private int length;
    private int width;
    private int height;

    public Dimension(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLargest(){
        int largest = 0;
        largest = largest <= length ? length : largest;
        largest = largest <= width ? width : largest;
        largest = largest <= height ? height : largest;
        return largest;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getlength(){
        return this.length;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getWidth(){
        return this.width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return this.height;
    }
}