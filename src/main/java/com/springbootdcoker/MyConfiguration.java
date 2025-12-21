package com.springbootdcoker;

//@Configuration
public class MyConfiguration {


   // @Bean
    public AppConfigCredential clientSetup() {
        return new AppConfigCredential();
    }

}
