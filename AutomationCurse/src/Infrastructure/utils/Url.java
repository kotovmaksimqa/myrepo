package Infrastructure.utils;

public class Url {

    private final String protocol;

    private final String domain;

    private final String port;

    private final String path;

    private final String oneParam;

    private final String keyValueParam;

     private Url(UrlBuilder urlBuilder) {
        this.protocol = urlBuilder.getProtocol();
        this.domain = urlBuilder.getDomain();
        this.port = urlBuilder.getPort();
        this.path = urlBuilder.getPath();
        this.oneParam = urlBuilder.getOneParam();
        this.keyValueParam = urlBuilder.getKeyValueParam();
    }

    @Override
    public String toString() {
        return protocol + "://" +
                domain + "/" +
                port + "" +
                path + "/" +
                oneParam + "" +
                keyValueParam + "";
    }

    public static class UrlBuilder {

        private  String protocol;
        private  String domain;
        private  String port;
        private  String path;
        private  String oneParam;
        private  String keyValueParam;

        public UrlBuilder protocol(final String protocol) {
            this.protocol = protocol;
            return this;
        }

        public UrlBuilder domain(final String domain) {
            this.domain = domain;
            return this;
        }

        public UrlBuilder port(final String port) {
            this.port = port;
            return this;
        }

        public UrlBuilder path(final String path) {
            this.path = path;
            return this;
        }

        public UrlBuilder oneParam(final String oneParam) {
            this.oneParam = oneParam;
            return this;
        }

        public UrlBuilder keyValueParam(final String keyValueParam) {
            this.keyValueParam = keyValueParam;
            return this;
        }

        public String getProtocol() {
            return protocol;
        }

        public String getDomain() {
            return domain;
        }

        public String getPort() {
            return port;
        }

        public String getPath() {
            return path;
        }

        public String getOneParam() {
            return oneParam;
        }

        public String getKeyValueParam() {
            return keyValueParam;
        }

        public String build() {
            return new Url(this).toString();
        }
    }
}
