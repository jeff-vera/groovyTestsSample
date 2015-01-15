package com.mymatrixx.tests.servicesApi

import com.mymatrixx.servicesApi.redbook

class redbookTest extends GroovyTestCase {

    void testGetAwp() {
        def output = redbook.getAwp("12345", "1/1/2001")

        assert output != null;
    }
}
