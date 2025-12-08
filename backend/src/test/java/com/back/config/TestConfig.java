package com.back.config;

import static org.mockito.Mockito.*;

import org.mockito.Mockito;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import software.amazon.awssdk.services.s3.S3Client;

@TestConfiguration
public class TestConfig {

	@Bean
	@Primary
	public VectorStore testVectorStore() {
		return mock(VectorStore.class);
	}

	@Bean
	public S3Client s3Client() {
		return Mockito.mock(S3Client.class);
	}
}