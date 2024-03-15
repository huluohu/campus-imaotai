package com.oddfar.campus.huluwa.util;

import java.util.Random;

public class CommonUtils {
    public static void sleepSeconds(int maxSeconds) {
        try {
            Thread.sleep(((new Random()).nextInt(maxSeconds) * 1000));
        } catch (InterruptedException interruptedException) {}
    }

    public static void sleepMicroSeconds(int maxMicroSeconds) {
        try {
            Thread.sleep((new Random()).nextInt(maxMicroSeconds));
        } catch (InterruptedException interruptedException) {}
    }
}
