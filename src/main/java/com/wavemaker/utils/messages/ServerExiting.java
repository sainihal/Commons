package com.wavemaker.utils.messages;

/**
 * Created by sainihala on 13/7/16.
 */
public class ServerExiting implements Message {
    private String data = "Server Exiting";

    public ServerExiting(){}

    public ServerExiting(String data){
        this.data = data;
    }
    @Override
    public MessageType getType() {
        return MessageType.SERVER_EXITING;
    }
    public String toString(){
        return data;
    }
}
