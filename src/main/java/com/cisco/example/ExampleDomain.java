package com.cisco.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ExampleDomain {
    public String say;

    public ExampleDomain() {
    }

    public ExampleDomain(String variable) {
        this.say = variable;
    }
}
