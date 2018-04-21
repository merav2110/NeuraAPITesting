package com.merav.testing.tests;

import com.merav.testing.infra.APICalls;
import com.merav.testing.infra.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

public class BuilderURLTest {

    final private static Logger LOGGER = LoggerFactory.getLogger(BuilderURLTest.class.getName());

    @Test
    public void testDailySummary(){

        String date = "2018-04-20";
        Request request = new Request.RequestBuilder().
                setBaseURLEnabled("https://wapi.theneura.com/v1/").
                setAPICallEnabled(APICalls.DAILY_SUMMARY.toString()).
                setDateEnabled(date).
                build();

        String expectedURL = "https://wapi.theneura.com/v1/users/profile/daily_summary/extended?date=2018-04-20";
//https://wapi.theneura.com/v1/users/profile/daily_summary/extended?date=2018-04-20

        LOGGER.info("request: "+request.toString());
        Assert.assertEquals(request.toString(),expectedURL );
    }

    @Test
    public void testSleepProfile(){

        String startDate = "2018-04-18";
        String endDate = "2018-04-19";

//https://wapi.theneura.com/v1/users/profile/sleep?start_date=2018-04-18&end_date=2018-04-19
    }

    @Test
    public void testDailyJournal(){

        String date = "2018-04-20";

//https://wapi.theneura.com/v1/journals/extended?date=2018-04-20
    }
}
