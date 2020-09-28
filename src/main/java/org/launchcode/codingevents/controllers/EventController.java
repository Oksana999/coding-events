package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.model.Event;
import org.launchcode.codingevents.services.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

   private final EventService eventService;

   // private static List<String> events = new ArrayList<>();
   private static Map<String, Event> events = new HashMap<>();

   public EventController(EventService eventService) {
      this.eventService = eventService;
   }

   @GetMapping
   public String displayAllEvents(Model model) {
      Event event1 = eventService.getEvent("meeting1", "with manager",
              "Boulevard Kukulcan Km 20.5, Lote 64 2a etapa, Seccion A, Zona Hotelera, 77500 Cancún, " +
                      "Q.R., Mexico", "1.jpg");
      Event event2 = eventService.getEvent("meeting2", "with co-workers",
              "Boulevard Kukulcan Km 20.5, Lote 64 2a etapa, Seccion A, Zona Hotelera, 77500 Cancún, " +
                      "Q.R., Mexico", "2.jpg");
      Event event3 = eventService.getEvent("meeting3", "with bank",
              "Boulevard Kukulcan Km 20.5, Lote 64 2a etapa, Seccion A, Zona Hotelera, 77500 Cancún, " +
                      "Q.R., Mexico", "3.jpg");

      events.put("meeting1", event1);
      events.put("meeting2", event2);
      events.put("meeting3", event3);
      model.addAttribute("title", "All Events");
      model.addAttribute("events", events);
      return "events/index";
   }

   @GetMapping("create")
   public String displayCreateEventForm(Model model) {
      model.addAttribute("title", "Create Event");
      return "events/create";
   }

   @PostMapping("create")
   public String processCreateEventForm(@RequestParam String eventName, String description) {
      Event event1 = eventService.getEvent(eventName, description,
              "Boulevard Kukulcan Km 20.5, Lote 64 2a etapa, Seccion A, Zona Hotelera, 77500 Cancún, " +
                      "Q.R., Mexico", "1.jpg");
      events.put(eventName, event1);
      return "redirect:";
   }

}
