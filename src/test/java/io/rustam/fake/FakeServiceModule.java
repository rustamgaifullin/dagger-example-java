package io.rustam.fake;

import io.rustam.di.service.Name;
import io.rustam.di.service.ServiceModule;

public class FakeServiceModule extends ServiceModule {
    @Override
    public Name serviceName() {
        return new FakeName();
    }

    private static class FakeName implements Name {

        @Override
        public String getStringName() {
            return "Fake name";
        }
    }
}