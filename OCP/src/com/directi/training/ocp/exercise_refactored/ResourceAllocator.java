package com.directi.training.ocp.exercise_refactored;

import java.util.HashMap;
import java.util.Map;

public class ResourceAllocator {
    private final Map<String, Resource> resourceRegistry = new HashMap<>();

    public ResourceAllocator() {
        resourceRegistry.put("TIME_SLOT", new TimeSlotResource());
        resourceRegistry.put("SPACE_SLOT", new SpaceSlotResource());
    }

    public int allocate(String resourceTypeKey) {
        Resource resource = resourceRegistry.get(resourceTypeKey);
        if (resource == null) {
            throw new IllegalArgumentException("Unknown resource type: " + resourceTypeKey);
        }
        return resource.allocate();
    }

    public void free(String resourceTypeKey, int resourceId) {
        Resource resource = resourceRegistry.get(resourceTypeKey);
        if (resource == null) {
            throw new IllegalArgumentException("Unknown resource type: " + resourceTypeKey);
        }
        resource.free(resourceId);
    }
}
