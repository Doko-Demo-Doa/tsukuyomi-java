package com.clipsub.tsukuyomi;

import com.clipsub.tsukuyomi.constant.CommonConstants;
import com.clipsub.tsukuyomi.constant.SpringProfileConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class TsukuyomiApplication {
    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(TsukuyomiApplication.class);
        addDefaultProfile(app);

        Environment env = app.run(args).getEnvironment();
        // TODO: Logging below.
    }

    private static void addDefaultProfile(SpringApplication app) {
        Map<String, Object> defProperties = new HashMap<>();
        defProperties.put(SpringProfileConstants.SPRING_PROFILE_DEFAULT, SpringProfileConstants.SPRING_PROFILE_DEVELOPMENT);
        app.setDefaultProperties(defProperties);
    }
}
