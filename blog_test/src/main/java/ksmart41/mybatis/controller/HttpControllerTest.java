package ksmart41.mybatis.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청 ->응답 (HTML파일)
//@Controller
//사용자가 요청 -> 응답(DATA)
	@RestController
	public class HttpControllerTest {
		//인터넷 브라우져  요청은 무조건 get 요청 밖에 할 수 없다.
		@GetMapping ("/getmapping")
		public String getTest() { //데이터를 줘!
			return "get요청 :  데이터를 줘! : select ";
			
		}
		@PostMapping ("/postmapping")
		public String postTest() { //데이터를 추가해줘!
			return "post요청 :  데이터를 추가 해줘! : insert ";
		}
		@PutMapping("/putmapping")
		public String putTest() { // 데이터를 수정해줘!
			return "put요청 : 데이터를 수정해줘! : update" ;
		}
		@DeleteMapping("/deletemapping")
		public String deleteTest() { //데이터를 지워줘!
			return "delete요청 :  데이터를 지워줘 : delete ";
		}
	
}
