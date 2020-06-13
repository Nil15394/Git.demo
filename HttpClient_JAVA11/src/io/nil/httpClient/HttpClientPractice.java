package io.nil.httpClient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientPractice {
	
	private static HttpClient client;
	public static String URISOURCE = "https://www.pluralsight.com"; 
	
	public static void main(String[] args) {
		client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder(URI.create(URISOURCE)).
							  GET().
							  build();
		try {
			HttpResponse<Void> response = client.send(request, HttpResponse.BodyHandlers.discarding());
			System.out.println(response.toString());
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
