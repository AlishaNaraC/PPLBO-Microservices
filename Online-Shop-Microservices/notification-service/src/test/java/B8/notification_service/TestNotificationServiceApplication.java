package B8.notification_service;

import org.springframework.boot.SpringApplication;

import B8.notification.NotificationServiceApplication;

public class TestNotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(NotificationServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
