package cc.hy.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	// 注册登陆API
	@RequestMapping("/hello")
	public Object helloworld(){
		return "hello world !";
	}
}
