package com.beable.poker.game.controller;

import com.beable.poker.game.message.Greeting;
import com.beable.poker.game.message.TestMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;
@Controller
public class JoinController {
	@MessageMapping("/connect")
	@SendTo("/connect")
	public Greeting join(TestMessage message) {
		return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
	}
}
