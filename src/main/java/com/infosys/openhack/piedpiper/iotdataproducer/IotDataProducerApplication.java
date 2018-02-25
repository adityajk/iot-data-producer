package com.infosys.openhack.piedpiper.iotdataproducer;

import com.infosys.openhack.piedpiper.iotdataproducer.config.IotMqttConf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.mqtt.core.DefaultMqttPahoClientFactory;
import org.springframework.integration.mqtt.core.MqttPahoClientFactory;
import org.springframework.integration.mqtt.outbound.MqttPahoMessageHandler;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;

@SpringBootApplication
@IntegrationComponentScan
public class IotDataProducerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				new SpringApplicationBuilder(IotDataProducerApplication.class)
						.run(args);
		IotMqttConf.MyGateway gateway = context.getBean(IotMqttConf.MyGateway.class);
		gateway.sendToMqtt("foo");
	}


}
