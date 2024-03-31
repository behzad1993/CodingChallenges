package interview;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class UrlBuilderTest {

    @Test
    public void test_buildUrlWithNoPort() {
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("key1", "value1");
        stringStringHashMap.put("key2", "value2");

        URL url = new UrlBuilder()
                .host("codility.com")
                .path("/test/hello/world")
                .queryParams(stringStringHashMap)
                .build();

        assertEquals("http://codility.com/test/hello/world?key1=value1&key2=value2", url.getURL());
    }

    @Test
    public void test_buildUrlWithPort() {
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("key1", "value1");
        stringStringHashMap.put("key2", "value2");

        URL url = new UrlBuilder()
                .port(8080)
                .host("codility.com")
                .https()
                .build();

        assertEquals("https://codility.com:8080", url.getURL());
    }
}