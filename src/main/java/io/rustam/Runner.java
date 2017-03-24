package io.rustam;

public class Runner {
    public static void main(String[] args) {
        MainApplication mainApplication = new MainApplication();
        SpecialApplication specialApplication = new SpecialApplication();
        System.out.println(mainApplication.getResult());
        System.out.println(specialApplication.specialService.getSpecialThings());
    }
}