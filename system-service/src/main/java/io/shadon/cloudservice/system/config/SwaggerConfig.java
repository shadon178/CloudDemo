package io.shadon.cloudservice.system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author https://github.com/shadon178
 */
@EnableOpenApi
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket getUserDocket() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("系统管理")
                .description("系统管理相关接口描述")
                .version("1.0.0")
                .contact(new Contact("彭小冬",
                        "https://github.com/shadon178",
                        "344064802@qq.com"))
                .build();

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("io.shadon.cloudservice.system"))
                .paths(PathSelectors.any())
                .build();
    }

}
