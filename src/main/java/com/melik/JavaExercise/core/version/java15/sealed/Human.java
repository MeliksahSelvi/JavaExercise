package com.melik.JavaExercise.core.version.java15.sealed;

/*
* Human sealed class'tır. Permits verdikleri onu extend veya implement edebilir.
* */
public sealed interface Human permits Ali {
    void talk();
}
