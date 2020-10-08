package com.dumbdogdiner.stickyapi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import lombok.Getter;
import lombok.Setter;

public class StickyAPI {
    @Getter
    public static Logger logger = Logger.getLogger("StickyAPI");

    @Getter @Setter
    private static ExecutorService pool = Executors.newFixedThreadPool(3);
}
