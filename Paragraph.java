public class Paragraph implements Element
{
    private String paragraph_title;

    public Paragraph()
    {

    }

    @Override
    public String toString()
    {
        return "Paragraph" + paragraph_title;
    }

    public String getparagraph_title()
    {
        return paragraph_title;
    }

    public void setparagraph_title(String paragraph_title)
    {
        this.paragraph_title = paragraph_title;
    }

    public Paragraph(String paragraph_title)
    {
        super();
        this.paragraph_title = paragraph_title;
    }

    public void print()
    {
        System.out.println("Paragraph: " + paragraph_title);
    }

}