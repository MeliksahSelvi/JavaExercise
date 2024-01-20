package com.melik.JavaExercise.designpattern.behavioral.iterator.v1.iterator;

import com.melik.JavaExercise.designpattern.behavioral.iterator.v1.channel.Channel;

public interface ChannelIterator {

    boolean hasNext();

    Channel next();
}
