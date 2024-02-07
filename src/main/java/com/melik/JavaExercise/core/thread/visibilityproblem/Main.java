package com.melik.JavaExercise.core.thread.visibilityproblem;

/**
 * @Author mselvi
 * @Created 27.01.2024
 */

public class Main {

    /*
     * Burada sorun main thread visiblityProblem thread'inin cache'indeki gerçek değeri göremiyor.
     * Çözüm visible field'ı volatile veya atomicboolean yapılabilir.
     * Böyle olursa main thread gerçek değere ulaşabilir.
     * */
    public static void main(String[] args) throws InterruptedException {
        VisibilityProblem visibilityProblem = new VisibilityProblem();
        visibilityProblem.start();
        Thread.sleep(1000);
        visibilityProblem.visible = true;
        visibilityProblem.join();//main thread bu kod satırında visibilityProblem thread'i işini bitirene kadar bekler.
        System.out.println("main thread saw work is over");
    }

    static class VisibilityProblem extends Thread {
        boolean visible = false;

        @Override
        public void run() {
            while (!visible) {
            }
            System.out.println("work is done");
        }
    }
}
