package co.gov.icfes.AzureLogin;

//region import
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
//endregion import

@SpringBootApplication
public class AzureLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureLoginApplication.class, args);
	}

}
