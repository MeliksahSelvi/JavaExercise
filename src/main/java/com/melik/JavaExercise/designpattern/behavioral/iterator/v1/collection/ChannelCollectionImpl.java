package com.melik.JavaExercise.designpattern.behavioral.iterator.v1.collection;

import com.melik.JavaExercise.designpattern.behavioral.iterator.v1.channel.Channel;
import com.melik.JavaExercise.designpattern.behavioral.iterator.v1.channel.ChannelType;
import com.melik.JavaExercise.designpattern.behavioral.iterator.v1.iterator.ChannelIterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channelList;

    public ChannelCollectionImpl() {
        this.channelList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel channel) {
        this.channelList.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        this.channelList.remove(channel);
    }

    @Override
    public ChannelIterator iterator(ChannelType channelType) {
        return new ChannelIteratorImpl(channelType, this.channelList);
    }

    private class ChannelIteratorImpl implements ChannelIterator {

        private ChannelType channelType;
        private List<Channel> channels;
        private int position;

        public ChannelIteratorImpl(ChannelType channelType, List<Channel> channelList) {
            this.channelType = channelType;
            this.channels = channelList;
        }

        @Override
        public boolean hasNext() {
            while (position < channels.size()) {
                Channel channel = channels.get(position);
                if (channelType.equals(channel.getChannelType()) || channelType.equals(ChannelType.ALL)) {
                    return true;
                } else {
                    position++;
                }
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel channel = channels.get(position);
            position++;
            return channel;
        }
    }
}
