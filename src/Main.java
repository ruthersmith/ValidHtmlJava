import java.io.IOException;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        try {
            Queue<HtmlTag> tags = HtmlReader.getTagsFromHtmlFile("test1.html");
            System.out.println(tags);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
