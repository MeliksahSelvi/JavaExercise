package com.melik.JavaExercise.designpattern.behavioral.state.v2;

import com.melik.JavaExercise.designpattern.behavioral.state.v2.context.TvContext;
import com.melik.JavaExercise.designpattern.behavioral.state.v2.states.State;
import com.melik.JavaExercise.designpattern.behavioral.state.v2.states.TvStartState;
import com.melik.JavaExercise.designpattern.behavioral.state.v2.states.TvStopState;


public class Client {
    public static void main(String[] args) {

        TvContext tvContext=new TvContext();
        State tvStartState=new TvStartState();
        State tvStopState=new TvStopState();

        tvContext.setState(tvStartState);
        tvContext.doAction();

        tvContext.setState(tvStopState);
        tvContext.doAction();
    }
}
