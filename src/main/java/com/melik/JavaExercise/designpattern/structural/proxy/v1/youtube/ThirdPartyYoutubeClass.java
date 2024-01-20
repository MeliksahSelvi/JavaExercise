package com.melik.JavaExercise.designpattern.structural.proxy.v1.youtube;

import com.melik.JavaExercise.designpattern.structural.proxy.v1.video.Video;

import java.util.HashMap;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {
    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.println("Downloading Populars ...");

        experienceNetworkLatency();
        HashMap<String, Video> popularHashMap = new HashMap<>();
        popularHashMap.put("1", new Video("1", "BirTitle", "Data1"));
        popularHashMap.put("2", new Video("2", "IkiTitle", "Data2"));
        popularHashMap.put("3", new Video("3", "UcTitle", "Data3"));

        System.out.println("Done! ..");

        return popularHashMap;
    }

    private void connectToServer(String server) {
        System.out.println("Connecting To ..." + server + " ....");
        experienceNetworkLatency();
        System.out.println("Connected! \n");
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com" + videoId);
        return getSomeVideo(videoId);
    }

    private Video getSomeVideo(String videoId) {
        System.out.println("Downloading Video ....");

        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title", "Data");

        System.out.println("Done!");
        return video;
    }

    private int random(int min, int max) {
        int result = (int) (min + (Math.random() * ((max - min) + 1)));
        return result;
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
