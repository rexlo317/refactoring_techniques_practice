package com.tws.refactoring.extract_variable;

public class BannerRender {
    private String platform;
    private String browser;

    public String getPlatform() {
        return platform;
    }

    public String getBrowser() {
        return browser;
    }

    public BannerRender(String platform, String browser){
        this.platform = platform;
        this.browser = browser;
    }

    public void renderBanner() {
        if (doesPlatformHasMAC(platform) && doesBrowserHasIE(browser)) {
            doSomething();
        }
    }

    boolean doesPlatformHasMAC(String platform){
        return platform.toUpperCase().contains("MAC");
    }

    boolean doesBrowserHasIE(String browser){
        return browser.toUpperCase().contains("IE");
    }

    void doSomething(){
        this.platform = "Window";
    }

}
