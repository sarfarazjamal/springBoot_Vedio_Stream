package com.jamal.videostream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * @author JAMAL
 *
 */

/**
Repository contains the code to stream the video in HTTP. Used the 
      Spring fromework to Stream the Video
      
      Url endpoint is video/stream/mp4/toystory
      Here the Path params are video/stream/{fileType}/{fileName}
      
      Applicaiton looks for the video in the resources/video folder, if want to
      work on own video, place the file in video folder in resources and 
      play around it.
      
      Start the applciation and hit the below url to try it out
      http://localhost:8080/video/stream/mp4/toystory
      
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
