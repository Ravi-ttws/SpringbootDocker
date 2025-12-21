package com.springbootdcoker;

import com.azure.data.appconfiguration.ConfigurationClientBuilder;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.spring.cloud.appconfiguration.config.ConfigurationClientCustomizer;

//@Component
public class AppConfigCredential implements ConfigurationClientCustomizer {

    @Override
    public void customize(ConfigurationClientBuilder builder, String endpoint) {
        builder.credential(new DefaultAzureCredentialBuilder().build());
    }
}
