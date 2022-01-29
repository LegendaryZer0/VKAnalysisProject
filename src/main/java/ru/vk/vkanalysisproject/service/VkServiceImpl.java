package ru.vk.vkanalysisproject.service;

import com.vk.api.sdk.client.ClientResponse;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class VkServiceImpl implements VkService{
    private final String APP_ID = "8064726";
    @Override
    public void getToken() throws IOException {
        TransportClient transportClient = HttpTransportClient.getInstance();
        VkApiClient vk = new VkApiClient(transportClient);
        ClientResponse response = transportClient.get("https://oauth.vk.com/authorize?client_id="+APP_ID+"&display=page&redirect_uri=http://localhost:8080/callbackVk&scope=friends&response_type=code&v=5.131");
        System.out.println(response.getContent());
    }
}
