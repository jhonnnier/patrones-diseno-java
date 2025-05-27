package com.company.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements Internet {
    private Internet internet = new AccessToInternet();
    private static List<String> bannerUrl;

    static {
        bannerUrl = new ArrayList<>();
        bannerUrl.add("https://www.twitter.com");
        bannerUrl.add("https://www.facebook.com");
        bannerUrl.add("https://www.google.com");
    }

    @Override
    public void connectTo(String url) throws Exception {
        if (bannerUrl.contains(url)) {
            throw new Exception("URL Bloqueada - Acceso Denegado - Consulta con tu administrador");
        }

        internet.connectTo(url);
    }
}
