package com.mymatrixx.tests.servicesApi

import com.mymatrixx.servicesApi.redbook

class redbookTest extends GroovyTestCase {

    def fooTest() {
        def output = redbook.foo("oh yeah");

        assert output == "passed in: oh yeah";
    }
}
