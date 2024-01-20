package com.melik.JavaExercise.core.version.java8.lambdaexpressions;

/**
 * @Author mselvi
 * @Created 08.07.2023
 */

/*
 * beforeLambda methodu incelendiğinde görüldüğü üzere implementation'u olmayan bir methodu implement edebilmek için Anonymous class yazarak bu ihtiyacımızı giderdik.
 * Uzunca bir kod oldu ve görüntü olarak karmaşık bir düzende.
 *
 * afterLambda methodunu incelediğimizde ise Anonymous class yerine lambda expressions kullanmamız kodu daha okunabilir hale getirdi.
 * */
public class Lambda {

    public static void main(String[] args) {

        beforeLambda();

        afterLambda();
    }

    private static void afterLambda() {
        FunctionalTemplate functionalTemplate = (String param) -> param + " I wrote you";
        String writeMe = functionalTemplate.writeMe("Hi ");
        System.out.println(writeMe);
    }

    private static void beforeLambda() {
        FunctionalTemplate functionalTemplate = new FunctionalTemplate() {
            @Override
            public String writeMe(String param) {
                return param + " I wrote you";
            }
        };

        String writeMe = functionalTemplate.writeMe("Hi");
        System.out.println(writeMe);
    }
}
