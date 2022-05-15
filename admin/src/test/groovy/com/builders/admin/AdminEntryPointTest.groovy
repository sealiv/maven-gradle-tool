package com.builders.admin;

import spock.lang.Specification

class AdminEntryPointTest extends Specification {

    def "should read property 'test_hello' when read properties-file from resources"() {
        def properties = new Properties()
        this.getClass().getResource( '/admin_config_test.properties' ).withInputStream {
            properties.load(it)
        }
        expect:
        properties."test_hello"
    }
}
