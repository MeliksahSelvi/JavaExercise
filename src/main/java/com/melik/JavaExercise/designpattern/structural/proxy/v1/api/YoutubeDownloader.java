package com.melik.JavaExercise.designpattern.structural.proxy.v1.api;

import com.melik.JavaExercise.designpattern.structural.proxy.v1.video.Video;
import com.melik.JavaExercise.designpattern.structural.proxy.v1.youtube.ThirdPartyYoutubeLib;

import java.util.HashMap;

public class YoutubeDownloader {

    private ThirdPartyYoutubeLib youtubeLib;

    public YoutubeDownloader(ThirdPartyYoutubeLib youtubeLib) {
        this.youtubeLib = youtubeLib;
    }

    public void renderVideoPage(String videoId) {
        Video video = youtubeLib.getVideo(videoId);
        System.out.println("\n-----------------------");
        System.out.println("Video page(imagine fancy HTML)");
        System.out.println("ID :" + videoId);
        System.out.println("Title :"+video.getTitle());
        System.out.println("Data :"+video.getData());
        System.out.println("\n-----------------------");
    }

    public void renderPopularVideos(){
        HashMap<String, Video> popularVideos = youtubeLib.popularVideos();
        System.out.println("\n-----------------------");
        System.out.println("Most Popular Videos(imagine fancy HTML)");
        for (Video video : popularVideos.values()) {
            System.out.println("ID :"+video.getId()+" /Title :"+video.getTitle());
        }
        System.out.println("\n-----------------------");
    }
}
