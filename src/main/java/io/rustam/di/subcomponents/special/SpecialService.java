package io.rustam.di.subcomponents.special;

import javax.inject.Inject;

public class SpecialService {
    @Inject
    public SpecialService() {}

    public String getSpecialThings() {
        return "Special Things";
    }
}