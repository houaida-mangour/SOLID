package com.directi.training.ocp.exercise_refactored;

public class SpaceSlotResource implements Resource {
    @Override
    public int allocate() {
        int resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
    }

    private void markSpaceSlotFree(int resourceId) { /* impl */ }
    private void markSpaceSlotBusy(int resourceId) { /* impl */ }
    private int findFreeSpaceSlot() { return 200; }
}
