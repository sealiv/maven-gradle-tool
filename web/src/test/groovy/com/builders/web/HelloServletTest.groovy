package com.builders.web;

import spock.lang.Specification

class HelloServletTest extends Specification {

    def "should read property 'test_hello' when read properties-file from resources"() {
        def properties = new Properties()
        this.getClass().getResource( '/web_config_test.properties' ).withInputStream {
            properties.load(it)
        }
        expect:
        properties."test_hello"
    }
}
