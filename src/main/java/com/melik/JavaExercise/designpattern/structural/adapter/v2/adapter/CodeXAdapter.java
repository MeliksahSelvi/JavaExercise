package com.melik.JavaExercise.designpattern.structural.adapter.v2.adapter;

import com.melik.JavaExercise.designpattern.structural.adapter.v2.codex.CodeX;
import com.melik.JavaExercise.designpattern.structural.adapter.v2.crypt.Crypt;

public class CodeXAdapter implements Crypt {

    private CodeX codeX;

    public CodeXAdapter(CodeX codeX) {
        this.codeX = codeX;
    }

    @Override
    public void encrypt(String text) {
        codeX.textToCode(text);
    }

    @Override
    public void decrypt(String text) {
        codeX.codeToText(text);
    }
}
