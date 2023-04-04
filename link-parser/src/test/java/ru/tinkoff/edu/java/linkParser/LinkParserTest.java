package arsi.backend;

import org.junit.Assert;
import org.junit.Test;
import ru.tinkoff.edu.java.linkParser.GithubParser;
import ru.tinkoff.edu.java.linkParser.StackOverflowParser;

import java.net.URISyntaxException;

public class LinkParserTest {

    @Test
    public void GitHubValidTest() throws URISyntaxException {
        String URL = "https://github.com/dina/dinar";
        GithubParser linkParser = new GithubParser();
        Assert.assertEquals(new String[]{"dina"}[0],linkParser.parse(URL)[0]);
        Assert.assertEquals(new String[]{"dina","dinar"}[1],linkParser.parse(URL)[1]);
    }
    @Test
    public void StackOverflowValidTest() throws URISyntaxException {
        String URL = "https://stackoverflow.com/questions/47179937/how-to-get-string-from-monostring-in-reactive-java";
        StackOverflowParser linkParser = new StackOverflowParser();
        Assert.assertEquals("47179937",linkParser.parse(URL)[0]);
    }
    @Test
    public void InvalidTest() throws URISyntaxException {
        String URL = "fwefwfwe";
        GithubParser linkParser = new GithubParser();
        Assert.assertEquals("",linkParser.parse(URL)[0]);
    }
}