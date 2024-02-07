package com.melik.JavaExercise.core.thread.executorservice;

import java.util.concurrent.*;

/**
 * @Author mselvi
 * @Created 30.01.2024
 */

public class ExecutorServiceBasic {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        fixedThreadPool();
//        cachedThreadPool();
//        scheduledThreadPool();
//        singleThread();
//        lifeCycleMethodsOfExecutorService();
        callableExample();
    }

    /*
     * FixedThreadPool'da thread oluşturma ile biz ilgilenmiyoruz ve bu görevi FixedThreadPool'a devrediyoruz.
     * Verdiğimiz sayı kadar thread oluşturur.Ve bunları verdiğimiz task için koşturur. Verilen taskları
     * bir LinkedBlockingQueue yapısında tutarak thread'lerin bunları consume etmesini sağlar.
     * */
    private static void fixedThreadPool() {
        Runnable task = () -> System.out.println("I'm working my name is -> " + Thread.currentThread().getName());

        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(coreCount);
        for (int i = 0; i < 100; i++) {
            executorService.submit(task);
        }
        executorService.shutdown();
    }

    /*
     * CachedThreadPool'da thread oluşturma ve bu thread'lerin sayısı ile biz ilgilenmiyoruz ve bu görevi
     * CachedThreadPool'a devrediyoruz. Bizim verdiğimiz taskın hacmine göre 0'dan başlayarak thread oluşturmaya başlıyor.
     * Thread sayısı ile alakalı üst sınır Integer max value'dir. Sayıyı arttırmadan önce şu kontrolü yapıyor:
     * Benim elimde şuanda hiçbir iş yapmayan idle olan bir thread var mı? Eğer varsa onu kullanıyor yoksa sayıyı arttırıyor.
     * Thread'lerin default 60 saniyelik life time'ı var. Bu süre içinde eğer görevini bitirirse geriye kalan süre boyunca
     * ona task ataması yapılabilir. Eğer bu süre bittiğinde üzerinde bir task yok ise bu thread'ler kill ediliyor.
     * CachedThreadPool Verilen taskları aynı anda bir task barındırsın diye SynchronousQueue içinde tutarak thread'lerin
     * bunları consume etmesini sağlar.Bir task consume edildiği anda yeni task SynchronousQueue'ya eklenir.
     * Short running task için iyi bir seçenektir.Long running task için pek uygun değil.Gün içinde uygulamamızın
     * yükü değişiyorsa belirli saatlerde azalıyor belirli saatlerde artıyorsa CachedThreadPool bizim senaryomuza uygun olabilir.
     * */
    private static void cachedThreadPool() {
        Runnable task = () -> System.out.println("I'm working my name is -> " + Thread.currentThread().getName());
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            executorService.submit(task);
        }
        executorService.shutdown();
    }

    /*
     * Submit ettiğimiz task'ın belirli bir delay ile veya belirli bir zamanlama ile çalışmasını istiyorsak
     * ScheduledThreadPool kullanabiliriz.Thread'lerin default 60 saniyelik life time'ı var.
     * Verilen taskları bir DelayedWorkQueue yapısında tutarak thread'lerin bunları consume etmesini sağlar.
     * */
    private static void scheduledThreadPool() {
        Runnable task = () -> System.out.println("I'm working my name is -> " + Thread.currentThread().getName());
        int coreCount = Runtime.getRuntime().availableProcessors();
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(coreCount);

        //her 5 saniyede bir çalışan bir schedule methodu
        scheduledExecutorService.schedule(task, 5, TimeUnit.SECONDS);

        /*
         * her 5 saniyede bir 1 saniyelik başlangıç gecikmesi ile çalışan schedule methodu
         * gecikme süresi task bitmesini beklemeden başlar.
         * */
        scheduledExecutorService.scheduleAtFixedRate(task, 1, 5, TimeUnit.SECONDS);

        /*
         * her 5 saniyede bir 1 saniyelik başlangıç gecikmesi ile çalışan schedule methodu
         * gecikme süresi task bittikten sonra başlar.Üst üste binen thread'ler olduğu zaman bu seçenek kullanılabilir.
         * */
        scheduledExecutorService.scheduleWithFixedDelay(task, 1, 5, TimeUnit.SECONDS);
    }

    /*
     * Sadece bir thread ile çalışır.Verilen taskları bir LinkedBlockingQueue yapısında tutarak
     * thread'lerin bunları consume etmesini sağlar.
     * */
    private static void singleThread() {
        Runnable task = () -> System.out.println("I'm working my name is -> " + Thread.currentThread().getName());
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 100; i++) {
            executorService.submit(task);
        }
        executorService.shutdown();
    }


    private static void lifeCycleMethodsOfExecutorService() throws InterruptedException {
        Runnable task = () -> System.out.println("I'm working my name is -> " + Thread.currentThread().getName());
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        //task'ı koşturur.
        executorService.submit(task);

        //verilen tasklar bittiğinde executor service'yi kapatır.
        executorService.shutdown();

        //verilen tasklar bitmeden direkt executor service'yi kapatır.
        executorService.shutdownNow();

        //20 saniyelik gecikmeden sonra executor service'yi kapatır.
        executorService.awaitTermination(20, TimeUnit.SECONDS);
    }

    /*
     * Runnable void return type idi. Eğer return type olarak bir değer istiyorsak
     * bize Future return type sağlayan Callable interface'sini kullanabiliriz.
     * */
    private static void callableExample() throws InterruptedException, ExecutionException {
        Callable<String> callableTask = () -> {
            Thread.sleep(5000);
            return "I'm working my name is -> " + Thread.currentThread().getName();
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> submit = executorService.submit(callableTask);
        String value = submit.get();//kod burada bloklanır.
        System.out.println(value);

        executorService.shutdown();
    }
}
