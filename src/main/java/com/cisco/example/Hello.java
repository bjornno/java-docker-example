package com.cisco.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Hello {
    public String say;

    public Hello() {
    }

    public Hello(String variable) {
        this.say = variable;
    }
}
