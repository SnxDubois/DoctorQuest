package com.wildcodeschool.doctorQuest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DoctorQuestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorQuestApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul>\n" +
				"        <li><a href=\" /doctor/1\">1</a></li>\n" +
				"        <li><a href=\" /doctor/2\">2</a></li>\n" +
				"        <li><a href=\" /doctor/3\">3</a></li>\n" +
				"        <li><a href=\" /doctor/4\">4</a></li>\n" +
				"    </ul>";
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doctor1() {
		return "William Hartnell";
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String doctor2() {
		return "Patrick Troughton";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String doctor3() {
		return "Jon Pertwee";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String doctor4() {
		return "Tom Baker";
	}
}
