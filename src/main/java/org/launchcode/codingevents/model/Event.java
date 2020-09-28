package org.launchcode.codingevents.model;

/**
 * @author Oksana
 */
public class Event {
   private String name;
   private String description;
   private String location;
   private String picture;

   public Event(String name, String description, String location, String picture) {
      this.name = name;
      this.description = description;
      this.location = location;
      this.picture = picture;
   }

   public Event() {
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getLocation() {
      return location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public String getPicture() {
      return picture;
   }

   public void setPicture(String picture) {
      this.picture = picture;
   }
}
