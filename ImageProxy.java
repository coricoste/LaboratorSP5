public class ImageProxy implements Element {

    private String title_image;
    //private String realImage;

    Image image = null;

    public ImageProxy(String title_image)
    {
        // TODO Auto-generated constructor stub
        super();
        this.title_image = title_image;
        //this.realImage = realImage;
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void print()
    {
        if(this.image == null)
        {
            this.image = new Image(this.title_image);
        }
        this.image.print();
    }

}