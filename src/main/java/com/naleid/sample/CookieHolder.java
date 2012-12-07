package com.naleid.sample;

public class CookieHolder {

    private static ThreadLocal<String> cookieThreadLocal = new ThreadLocal<String>();

    public void setCookie(String cookie) {
        if (cookie == null) {
            cookieThreadLocal.remove();
        } else {
            cookieThreadLocal.set(cookie);
        }
    }

    public String getCookie() {
        return cookieThreadLocal.get();
    }
}
