public class Main {

    public String Author;
    public String Book;
    public String Chapter;
    public String subChapter;
    public int Paragraph;
    public String Image;
    public String Table;

    public Main(String aut, String book, String ch, String sCh, int par, String im, String tab)
    {
        this.Author = aut;
        this.Book = book;
        this.Chapter = ch;
        this.subChapter = sCh;
        this.Image = im;
        this.Table = tab;
    }

    public static void main(String [] args) throws Exception
    {


        long startTime = System.currentTimeMillis();
        ImageProxy img1 = new ImageProxy("Imag1");
        ImageProxy img2 = new ImageProxy("Imag2");
        ImageProxy img3 = new ImageProxy("Imag3");
        Section VogueS1 = new Section("Imag4");
        VogueS1.add(img1);
        Section VogueS2 = new Section("Summer Girls");
        VogueS2.add(img2);
        VogueS2.add(img3);
        Book vogue = new Book("Vogue");
        vogue.addContent(VogueS1);
        vogue.addContent(VogueS2);
        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        VogueS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing of the section 1 took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        VogueS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing again the section 1 took " + (endTime -
                startTime) + " milliseconds");

    }

    public String getAuthor()
    {
        return Author;
    }

    public void setAuthor(String author)
    {
        Author = author;
    }

    public String getBook()
    {
        return Book;
    }

    public void setBook(String book)
    {
        Book = book;
    }


    public int getParagraph()
    {
        return Paragraph;
    }

    public void setParagraph(int paragraph)
    {
        Paragraph = paragraph;
    }

    public String getImage()
    {
        return Image;
    }

    public void setImage(String image)
    {
        Image = image;
    }

    public String getTable()
    {
        return Table;
    }

    public void setTable(String table)
    {
        Table = table;
    }
}
