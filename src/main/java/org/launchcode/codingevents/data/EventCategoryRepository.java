package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.EventCategory;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Oksana
 */
public interface EventCategoryRepository extends CrudRepository<EventCategory, Integer> {

}
