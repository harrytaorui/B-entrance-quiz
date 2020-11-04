package com.thoughtworks.capability.gtb.entrancequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GtbEntranceQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtbEntranceQuizApplication.class, args);
	}

}

// TODO GTB-完成度: * 完成了所有功能，新增学员没有做名字为空的校验
// TODO GTB-测试: * 没有包含测试
// TODO GTB-知识点: * Spring MVC相关的知识点掌握的不错
// TODO GTB-知识点: * Restful API Design相关的知识点掌握的不错
// TODO GTB-知识点: * 使用了CorsFilter设置跨域规则
// TODO GTB-知识点: * 缺少必要的参数校验和异常处理
// TODO GTB-工程实践: * 项目结构划分合理，使用了分层的架构
// TODO GTB-综合: * 整体完成度较高，可以尝试将学员与组相关的接口拆分在不同的类中