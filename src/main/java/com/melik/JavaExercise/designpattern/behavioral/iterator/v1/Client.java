package com.melik.JavaExercise.designpattern.behavioral.iterator.v1;

import com.melik.JavaExercise.designpattern.behavioral.iterator.v1.collection.ChannelCollection;
import com.melik.JavaExercise.designpattern.behavioral.iterator.v1.channel.Channel;
import com.melik.JavaExercise.designpattern.behavioral.iterator.v1.channel.ChannelType;
import com.melik.JavaExercise.designpattern.behavioral.iterator.v1.collection.ChannelCollectionImpl;
import com.melik.JavaExercise.designpattern.behavioral.iterator.v1.iterator.ChannelIterator;

/*
* Iterator Core Java'da oldukça fazla kullanılan bir pattern.Özellikle Collection Framework'te bolca kullanılıyor.
* Bu pattern'ın sağladığı genel avantajlar:
*
* --Client bir Collection üzerinde iterate(yineleme) yaparken arka plandaki karışk mantığı bilmeden iterate yapabiliyor.
* --Client arayüzler üzerinden Collection ve Iterator class'ları ile çalıştığı için somut class'lara bağımlı değildir.
* --Bir Collection üzerinde yineleme yaparken çeşitli yollar ile yapabilmeyi sağlıyor.
*  Üstelik Client'ın bu ceşitli yineleme işlemlerini aynı arayüz ile yapmasını sağlıyor.
* */
public class Client {
    public static void main(String[] args) {

        ChannelCollection channelCollection = populateChannels();
        ChannelIterator baseIterator = channelCollection.iterator(ChannelType.ALL);
        runIterator(baseIterator);

        System.out.println("------------");

        ChannelIterator englishIterator = channelCollection.iterator(ChannelType.TURKISH);
        runIterator(englishIterator);
    }

    private static void runIterator(ChannelIterator iterator) {
        while (iterator.hasNext()) {
            Channel channel = iterator.next();
            System.out.println(channel);
        }
    }

    private static ChannelCollection populateChannels() {

        ChannelCollection channelCollection = new ChannelCollectionImpl();
        channelCollection.addChannel(new Channel(97.5, ChannelType.ALL));
        channelCollection.addChannel(new Channel(97.6, ChannelType.ALL));
        channelCollection.addChannel(new Channel(97.8, ChannelType.ALL));
        channelCollection.addChannel(new Channel(97.9, ChannelType.ALL));
        channelCollection.addChannel(new Channel(95.5, ChannelType.TURKISH));
        channelCollection.addChannel(new Channel(97.5, ChannelType.FRENCH));
        channelCollection.addChannel(new Channel(100.9, ChannelType.ENGLISH));
        return channelCollection;
    }
}
