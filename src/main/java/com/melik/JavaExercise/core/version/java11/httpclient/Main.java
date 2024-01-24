package com.melik.JavaExercise.core.version.java11.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

/**
 * @Author mselvi
 * @Created 21.01.2024
 */

public class Main {
    private static final HttpClient httpClient= HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpRequest httpRequest=HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://httpbin.org/json"))
                .build();

        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        HttpHeaders headers=response.headers();
        headers.map().forEach((k,v)->System.out.println(k+":"+v));

        System.out.println(response.statusCode());

        System.out.println(response.body());
    }
}
