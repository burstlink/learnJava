package com.leeyy.test01;

import java.util.logging.Logger;

public class Test04 {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory is running out....");
        logger.fine("ingored");
        logger.severe("process will be terminated...");
    }
}
