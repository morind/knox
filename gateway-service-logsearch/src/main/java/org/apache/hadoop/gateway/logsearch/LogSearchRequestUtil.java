package org.apache.hadoop.gateway.logsearch;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.apache.http.client.methods.HttpUriRequest;
import org.slf4j.LoggerFactory;

public class LogSearchRequestUtil {

    private static org.slf4j.Logger log = LoggerFactory.getLogger(LogSearchRequestUtil.class);

    static HttpUriRequest modifyOutboundRequest(HttpUriRequest outboundRequest, HttpServletRequest inboundRequest) throws IOException {
        log.info("inboundRequest path: " + inboundRequest.getPathInfo());
        log.info("inboundRequest URL: " + inboundRequest.getRequestURL());
        log.info("inboundRequest URI: " + inboundRequest.getRequestURI());

        log.info("outboundRequest path: " + outboundRequest.getURI().toString());

        if (!inboundRequest.getPathInfo().endsWith("/")) {
            log.info("previous request URI: " + inboundRequest.getRequestURI());
            log.info("new request URI: " + inboundRequest.getRequestURI() + "/");
        }
        return outboundRequest;
    }
}
