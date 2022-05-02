package co.gov.icfes.AzureLogin.controller;

//region import
import co.gov.icfes.AzureLogin.AzureLoginApplication;
import co.gov.icfes.AzureLogin.DTO.ApiResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.annotations.ApiIgnore;
//endregion import

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
@RestController
public class PingController {
    public static void main(String[] args) {
        SpringApplication.run(AzureLoginApplication.class, args);
    }

    @GetMapping("/PingApplication")
    public ApiResponse<HttpStatus> PingApplication(){
        return new ApiResponse.ApiResponseBuilder<HttpStatus>(HttpStatus.OK)
                .status(true)
                .build();
    }

    @ApiIgnore
    @GetMapping("/")
    public ModelAndView SwaggerHome() {
        return new ModelAndView("redirect:/swagger-ui/index.html");
    }

}