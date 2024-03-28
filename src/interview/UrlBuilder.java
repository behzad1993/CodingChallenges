package interview;

import java.util.HashMap;

public class UrlBuilder {

    String http = "http";
    String host = "";
    int port = 0;
    String path = "";
    String queryParams = "";

    public UrlBuilder https() {
        this.http = "https";
        return this;
    }

    public UrlBuilder host(String host) {
        this.host = host == null ? "" : host;
        return this;
    }

    public UrlBuilder port(int port) {
        this.port = port;
        return this;
    }

    public UrlBuilder path(String path) {
        this.path = path == null ? "" : path;
        return this;
    }

    public UrlBuilder queryParams(HashMap<String, String> queryParams) {
        this.queryParams = queryToString(queryParams);
        return this;
    }

    public URL build() {
        if (this.port == 0) {
            return new URL(this.http, this.host, this.path, this.queryParams);
        }
        return new URL(this.http, this.host, this.port, this.path, this.queryParams);
    }

    private static String queryToString(HashMap<String, String> queryParams) {
        if (queryParams == null) {
            return "";
        }
        StringBuilder queryParamStringBuilder = new StringBuilder();
        int counter = 1;
        for (String key : queryParams.keySet()) {
            queryParamStringBuilder.append(key)
                    .append("=")
                    .append(queryParams.get(key));
            if (counter < queryParams.keySet().size()) {
                queryParamStringBuilder.append("&");
            }
            counter++;
        }
        return "?" + queryParamStringBuilder;
    }
}
