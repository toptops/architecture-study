package com.layered;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * - Web 패키지에서는 Service 패키지만 의존하지만 구현부에 대해서는 알 수 없다.
 * - Service 패키지에서도 마찬 가지로 데이터 엑세스 계층에 의존하지만 구현부에 대해서는 알 수 없다.
 *
 * - Web패키지에서 Response DTO는 서비스 계층에서 만들어주는게 아니라
 *   데이터를 받아와서 Web 패키지 내에서 응답 객체를 만들어야 한다.
 */
@SpringBootApplication
public class LayeredArchitectureApplication {

  public static void main(String[] args) {
    SpringApplication.run(LayeredArchitectureApplication.class, args);
  }

}
