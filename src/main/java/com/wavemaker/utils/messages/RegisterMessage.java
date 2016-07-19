package com.wavemaker.utils.messages;

/**
 * Created by sainihala on 12/7/16.
 */
public class RegisterMessage implements Message {

    private String name;

    public RegisterMessage() {}

    public RegisterMessage(String name) {
        this.name = name;
    }

    @Override
    public MessageType getType() {
        return MessageType.REGISTER;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
