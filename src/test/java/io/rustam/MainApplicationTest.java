package io.rustam;

import io.rustam.di.service.Name;
import io.rustam.di.subcomponents.main.MainService;
import io.rustam.fake.DaggerFakeServiceComponent;
import io.rustam.fake.FakeNetworkModule;
import io.rustam.fake.FakeServiceModule;
import io.rustam.fake.subcomponent.FakeMainServiceModule;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;


public class MainApplicationTest {
    @Inject
    MainService service;

    @Inject
    Name serviceName;

    @Before
    public void setup() {
        DaggerFakeServiceComponent
                .builder()
                .serviceModule(new FakeServiceModule())
                .networkModule(new FakeNetworkModule())
                .build()
                .plus(new FakeMainServiceModule())
                .inject(this);
    }


    @Test
    public void should_return_response_from_service() throws Exception {
        //given
        String expectedResponse = "Fake name: http://fake.com - fake";

        //when
        String actualResponse = service.getResponse().getStringResponse();

        //then
        assertEquals("Response should be equal", expectedResponse, actualResponse);
    }

    @Test
    public void should_return_service_name() throws Exception {
        //given
        String expectedName = "Fake name";

        //when
        String actualName = serviceName.getStringName();

        //then
        assertEquals("Name should be equal", expectedName, actualName);
    }
}