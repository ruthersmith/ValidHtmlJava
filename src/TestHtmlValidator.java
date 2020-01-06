import org.junit.Test;

import java.io.IOException;
import java.util.Queue;
import java.util.Stack;

public class TestHtmlValidator {

    @Test
    public void test1() throws IOException {
        Queue<HtmlTag> tags = HtmlReader.getTagsFromHtmlFile("test1.html");
        Stack nonValids  = HtmlValidator.isValidHtml(tags);
        assert nonValids.empty();
    }

    @Test
    public void test2() throws IOException {
        Queue<HtmlTag> tags = HtmlReader.getTagsFromHtmlFile("test2.html");
        Stack nonValids  = HtmlValidator.isValidHtml(tags);
        assert !nonValids.empty();
    }

    @Test
    public void test3() throws IOException {
        Queue<HtmlTag> tags = HtmlReader.getTagsFromHtmlFile("test3.html");
        Stack nonValids  = HtmlValidator.isValidHtml(tags);
        assert !nonValids.empty();
    }

    @Test
    public void test4() throws IOException {
        Queue<HtmlTag> tags = HtmlReader.getTagsFromHtmlFile("test4.html");
        Stack nonValids  = HtmlValidator.isValidHtml(tags);
        assert !nonValids.empty();
    }

    @Test
    public void test5() throws IOException {
        Queue<HtmlTag> tags = HtmlReader.getTagsFromHtmlFile("test5.html");
        Stack nonValids  = HtmlValidator.isValidHtml(tags);
        assert nonValids.empty();
    }

    @Test
    public void test6() throws IOException {
        Queue<HtmlTag> tags = HtmlReader.getTagsFromHtmlFile("test6.html");
        Stack nonValids  = HtmlValidator.isValidHtml(tags);
        assert !nonValids.empty();
    }

    @Test
    public void test7() throws IOException {
        Queue<HtmlTag> tags = HtmlReader.getTagsFromHtmlFile("test7.html");
        Stack nonValids  = HtmlValidator.isValidHtml(tags);
        assert !nonValids.empty();
    }
}
