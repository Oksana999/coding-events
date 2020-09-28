package org.launchcode.codingevents.services;

import org.launchcode.codingevents.model.Event;
import org.springframework.stereotype.Service;

/**
 * @author Oksana
 */
@Service
public class EventService {

   public Event getEvent(String name, String description, String location, String picture) {
      return new Event(name, description, location, picture);
   }

}
