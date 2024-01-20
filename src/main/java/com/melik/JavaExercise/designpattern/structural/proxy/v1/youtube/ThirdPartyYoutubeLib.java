package com.melik.JavaExercise.designpattern.structural.proxy.v1.youtube;

import com.melik.JavaExercise.designpattern.structural.proxy.v1.video.Video;

import java.util.HashMap;

public interface ThirdPartyYoutubeLib {

    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
