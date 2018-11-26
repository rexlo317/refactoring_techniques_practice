package com.tws.refactoring.extract_variable;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BannerRenderTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }


    @Test
    void renderBanner() {
        BannerRender bannerRender = new BannerRender("MAC", "IE");
        bannerRender.renderBanner();
        assertEquals("Window", bannerRender.getPlatform());
    }

    @Test
    void doesPlatformHasMAC() {
        BannerRender bannerRender = new BannerRender("MAC", "IE");
        assertTrue(bannerRender.doesPlatformHasMAC(bannerRender.getPlatform())) ;
    }

    @Test
    void doesBrowserHasIE() {
        BannerRender bannerRender = new BannerRender("MAC", "IE");
        assertTrue(bannerRender.doesBrowserHasIE(bannerRender.getBrowser()));
    }

    @Test
    void doSomething() {
        BannerRender bannerRender = new BannerRender("MAC", "IE");
        bannerRender.doSomething();
        assertEquals("Window", bannerRender.getPlatform());
    }
}