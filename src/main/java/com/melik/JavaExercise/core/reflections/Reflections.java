package com.melik.JavaExercise.core.reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class Reflections {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> clazz;
        try {
            clazz = Class.forName("corejava.reflections.Employee");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Constructor<?> constructorWithNoArgs = clazz.getConstructor();
        Object newInstance = constructorWithNoArgs.newInstance();

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            String name = method.getName();

            if (name.startsWith("met")){
                method.setAccessible(true);
                Object invoke = method.invoke(newInstance);
                System.out.println(invoke);
            }
        }

        Field[] declaredFields = newInstance.getClass().getDeclaredFields();

        for (Field field : declaredFields) {

            System.out.print(field.getName()+" -> ");
            System.out.println(Modifier.isPrivate(field.getModifiers()));
            System.out.println(field.getType().getSimpleName());

            if (Modifier.isPrivate(field.getModifiers())){
                field.setAccessible(true);
                field.set(newInstance,field.getName());
                System.out.println(newInstance+","+field.getName());
            }
        }

        System.out.println();

        Constructor<?> constructor;
        try {
            constructor = clazz.getConstructor(String.class);//tek bir string parametresi alan contructor'a eriştik.verdiğimiz parametrede constructor yoksa null atar.
            System.out.println(constructor);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }


        String pathName = clazz.getName();//path
        String className = clazz.getSimpleName();//gerçek ad

        int modifiers = clazz.getModifiers();//tanımlayıcı türü public 1,private 2, ... vs
        boolean isPublic = Modifier.isPublic(modifiers);

        if (isPublic) {
            System.out.println("Yes " + className + " is a public class");
        }
        Class<?> superclass = clazz.getSuperclass();
        String superClassName = superclass.getSimpleName();
        Class<?>[] interfaces = superclass.getInterfaces();


        System.out.println("superClass'ın interfaceleri");
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getSimpleName());
        }

        System.out.println(className + " 'ın superClass'ı " + superClassName);
        Method[] declaredMethods = clazz.getDeclaredMethods();//tanımlı methodlar

        for (Method declaredMethod : declaredMethods) {

            System.out.println(declaredMethod.getReturnType().getSimpleName() + "," + declaredMethod.getName());
            Annotation[] declaredAnnotations = declaredMethod.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                System.out.println(declaredAnnotation.annotationType().getSimpleName());
            }

            System.out.println("================");
        }
    }
}
