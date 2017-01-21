package com.tredo.api.services;

import com.tredo.api.models.User;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mfebrianto on 21/01/2017.
 */
public class UserService {

    private static String url = "http://localhost:4100/auth/api";

    public boolean postUser(User user) throws IOException{
        HttpClient client = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);

        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("email", user.getEmail()));
        urlParameters.add(new BasicNameValuePair("password", user.getPassword()));
        urlParameters.add(new BasicNameValuePair("password_confirmation", user.getPasswordConfirmation()));
        urlParameters.add(new BasicNameValuePair("confirm_success_url", "http://localhost:4100"));

        post.setEntity(new UrlEncodedFormEntity(urlParameters));

        HttpResponse response = client.execute(post);

        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());

        return true;
    }

}
