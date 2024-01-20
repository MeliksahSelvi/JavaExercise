package com.melik.JavaExercise.software.cohesion.logical;

/**
 * @Author mselvi
 * @Created 27.11.2023
 */

public class Logical {

    /*
     * Burada logical cohesion söz konusu. Report işlemi üzerinden aralarında bir birliktelik söz konusu.
     * Eğer client national sales report istiyorsa 3 flag değerini göndererek istediği report'a ulaşıyor.
     * Sadece tek bir report türü istememize rağmen printAll methodunu çağırmak zorundayız.
     * Bunun yerine her bir report işlemi ayrı bir fonksiyona bölünebilir.Aşağıda Report2 class'ında bu minvalde bir çözüm denenmiştir.
     * */

    public class Report {

        public void printAll(int flag) {

            if (flag == 1) {
                //local sales report
            } else if (flag == 2) {
                //regional sales report
            } else if (flag == 3) {
                //national sales report
            } else if (flag == 4) {
                //International sales report
            }
        }
    }

    public class Report2 {

        public void printAll(int flag) {
            localSalesReport();
            nationalSalesReport();
            regionalSalesReport();
            internationSalesReport();
        }

        public void localSalesReport() {
            //Business Logic
        }
        public void nationalSalesReport() {
            //Business Logic
        }
        public void regionalSalesReport() {
            //Business Logic
        }
        public void internationSalesReport() {
            //Business Logic
        }
    }
}
