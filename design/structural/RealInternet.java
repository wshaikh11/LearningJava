package org.git.design.structural;

public class RealInternet implements Internet {
    @Override
    public void connect(String serverHost) {
        System.out.println("connecting to" + " " + serverHost);
    }
}
