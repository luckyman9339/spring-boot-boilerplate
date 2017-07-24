package in.clouthink.daas.sbb.event;

import in.clouthink.daas.sbb.event.sms.service.SmsService;
import in.clouthink.daas.sbb.event.sms.service.impl.SmsServiceMocker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@ComponentScan({"in.clouthink.daas.sbb.event"})
@EnableMongoRepositories({"in.clouthink.daas.sbb.event"})
public class MockEventModuleConfiguration {

	@Bean
	@Autowired
	public SmsService smsServiceImpl() {
		return new SmsServiceMocker();
	}

}
