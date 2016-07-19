package com.wavemaker.utils.messages;

/**
 * Created by sainihala on 14/7/16.
 */
public class ClientNotExists implements Message {
    @Override
    public MessageType getType() {
        return MessageType.NO_CLIENT_EXISTS;
    }
}
