package io.rustam.subcomponents.di.flow.special;

import javax.inject.Inject;

public class SpecialService {
    @Inject
    public SpecialService() {}

    public String getSpecialThings() {
        return "Special Things";
    }
}