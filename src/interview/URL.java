package interview;

import java.util.HashMap;

public class URL {

    String URL;
    public URL(String http, String host, int port, String path, String queryParams) {

        this.URL = new StringBuilder()
                .append(http)
                .append("://")
                .append(host)
                .append(":" + port)
                .append(path)
                .append(queryParams)
                .toString();
    }

    public URL(String http, String host, String path, String queryParams) {

        this.URL = new StringBuilder()
                .append(http)
                .append("://")
                .append(host)
                .append(path)
                .append(queryParams)
                .toString();
    }

    public String getURL() {
        return this.URL;
    }
}
