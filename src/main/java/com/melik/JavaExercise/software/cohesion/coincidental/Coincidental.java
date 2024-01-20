package com.melik.JavaExercise.software.cohesion.coincidental;

/**
 * @Author mselvi
 * @Created 27.11.2023
 */

public class Coincidental {

    /*
     *Görüldüğü gibi Helper utility class'ı birbiri ile alakasız 3 method'dan meydana geliyor.Bu class'ın cohesion'u rastgele
     *yani Coincidental dizayn edilmiş. Burada yapılması gereken bu class'ı bölmek veya kullanıldıkları yerde tanımlanmak.
     *Ufak bir çözüm olarak bu Helper class'ını EmailHelper ve CustomerHelper olarak 2'ye böldük.
     * */
    public class Helper {

        public boolean sendEmailNotification() {
            //do send action
            return true;
        }

        public Object prepareCustomerObject(Object customer) {
            //before save
            return new Object();
        }

        public void printCustomerReport(Object customer) {
            //print report
        }
    }

    public class EmailHelper {
        public boolean sendEmailNotification() {
            //do send action
            return true;
        }
    }

    public class CustomerHelper {
        public Object prepareCustomerObject(Object customer) {
            //before save
            return new Object();
        }

        public void printCustomerReport(Object customer) {
            //print report
        }
    }
}
