package oop.secure;

import org.junit.Assert;
import org.junit.Test;

public class SslSecureTest {

    @Test
    public void secureHttps() {

        String[] urlsHttp = {
            "http://github.com/zVFSDmts/supra-api-nodejs/tree/master/modules/auth",
            "http://docs.google.com/spreadsheets/d/1lk7Z1SQXIIHUU/edit#gid=0",
            "http://learn.maxima.school.com/video-calls/schoolwork/579",
            "http://okko.tv.com/movie/captain-america-civil-war"
        };

        SslSecure sslSecure = new SslSecure();
        String[] result = sslSecure.urlWebSites(urlsHttp);

        String[] expected = {
            "https://github.com/",
            "https://docs.google.com/",
            "https://learn.maxima.school.com/",
            "https://okko.tv.com/"
        };

        Assert.assertArrayEquals(expected, result);
    }

}