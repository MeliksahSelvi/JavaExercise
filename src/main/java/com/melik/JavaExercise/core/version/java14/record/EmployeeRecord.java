package com.melik.JavaExercise.core.version.java14.record;

/*
 * Recordlar bir nevi dto gibidir.İmmutable veri taşırlar final'dırlar.Extend edilmezler.
 * Record objeleri içinde default olarak constructor,getter,setter,equals ve hashcode oluşturulur.
 * */
public record EmployeeRecord(String name, String surName) {
}
