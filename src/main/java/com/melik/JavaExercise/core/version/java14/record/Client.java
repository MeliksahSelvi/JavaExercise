package com.melik.JavaExercise.core.version.java14.record;

/*
 * Burada record tipinin kullanımını gördük.İki class'ın da nesnesi görüldüğü gibi aynı şekilde oluşturuldu.Class'lar incelendiğinde ikisi de aynı şekilde bir dto.Ama farklı olan
 * EmployeeRecord daha basit şekilde tasarlandı.Bir nevi lombok'ın bize sunduğu basit ve sadece kod sağlandı.
 * */


public class Client {
    public static void main(String[] args) {
        EmployeeRecord employeeRecord = new EmployeeRecord("Ali", "Demir");
        EmployeeNonRecord employeeNonRecord = new EmployeeNonRecord("Veli", "Keskin");
    }

}
