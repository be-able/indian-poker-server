package com.beable.poker.game.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(title = "indian-poker-server API 명세서",
                description = "API 명세서",
                version = "v1",
                license = @License(name = "Apache 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0.html")
        )
)
@Configuration
public class OpenApiConfig {
    /**
     * customGameOpenApi.
     *
     * @return GroupedOpenApi
     */
    @Bean
    public GroupedOpenApi gameOpenApi() {
        String[] paths = {"/v1/**"};
        return GroupedOpenApi.builder().setGroup("v1").pathsToMatch(paths)
                .build();
    }
}
