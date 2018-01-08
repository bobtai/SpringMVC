package springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// 掃描路徑下的商業邏輯組件
@ComponentScan({"springmvc.dao", "springmvc.model", "springmvc.service"})
public class RootConfig {
}
