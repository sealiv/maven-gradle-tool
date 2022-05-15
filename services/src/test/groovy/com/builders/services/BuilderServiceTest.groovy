package com.builders.services;

import spock.lang.Specification

class BuilderServiceTest extends Specification {

    def "should read property 'test_hello' when read properties-file from resources"() {
        def properties = new Properties()
        this.getClass().getResource( '/service_config_test.properties' ).withInputStream {
            properties.load(it)
        }
        expect:
        properties."test_hello"
    }
}