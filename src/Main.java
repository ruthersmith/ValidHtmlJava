import java.io.IOException;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        try {

            Queue<HtmlTag> tags = HtmlReader.getTagsFromHtmlFile("test7.html");
            Stack nonValids  = HtmlValidator.isValidHtml(tags);
            printIfHtmlValid(nonValids);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printIfHtmlValid(Stack nonValids){
        if (nonValids.empty()){
            System.out.println("Valid Html Sequence");
        }else{
            System.out.println("Non valid Html sequence");
        }
    }
}
