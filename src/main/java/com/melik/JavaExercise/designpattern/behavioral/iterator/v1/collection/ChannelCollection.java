package com.melik.JavaExercise.designpattern.behavioral.iterator.v1.collection;

import com.melik.JavaExercise.designpattern.behavioral.iterator.v1.channel.Channel;
import com.melik.JavaExercise.designpattern.behavioral.iterator.v1.channel.ChannelType;
import com.melik.JavaExercise.designpattern.behavioral.iterator.v1.iterator.ChannelIterator;

public interface ChannelCollection {

    void addChannel(Channel channel);

    void removeChannel(Channel channel);

    ChannelIterator iterator(ChannelType channelType);
}
