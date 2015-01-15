package com.mymatrixx.servicesApi

import groovyx.net.http.RESTClient
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

class redbook {

    static String url = "http://hq-devdotnet01/restapi/redbookapi/";

    static String getAwp(String ndc, String effectiveDate) {

        def parsedEffectiveDate = DateTime.parse(
                effectiveDate,
                DateTimeFormat.forPattern("MM/dd/yyyy"));

        def path = "awp/" + ndc + "/" + parsedEffectiveDate.year + "/" + parsedEffectiveDate.monthOfYear + "/" + parsedEffectiveDate.dayOfMonth;

        def client = new RESTClient(url);
        def response = client.get(path: path)

        if (response.status == 200) {
            return response.getData();
        }
    }
}
