package com.naleid.sample;

import javax.inject.Inject;

public class SampleService {
    @Inject
    CookieHolder cookieHolder;

    public String showThreadLocalCookie() {
        return cookieHolder.getCookie();
    }
}
