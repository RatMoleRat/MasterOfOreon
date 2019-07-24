/*
 * Copyright 2018 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.taskSystem.tasks;

import org.terasology.rendering.nui.Color;
import org.terasology.taskSystem.AssignedTaskType;
import org.terasology.taskSystem.BuildingType;
import org.terasology.taskSystem.Task;

public class BuildTask extends Task {
    private static final int HEALTH = 10;
    private static final int INTELLIGENCE = 0;
    private static final int STRENGTH = 0;
    private static final int HUNGER = 40;

    private static final float DURATION = 100;
    private static final Color COLOR = Color.GREY.alterAlpha(90);

    public BuildTask(BuildingType buildingType) {
        this.health = HEALTH;
        this.intelligence = INTELLIGENCE;
        this.strength = STRENGTH;
        this.hunger = HUNGER;

        this.primaryAttr = STRENGTH_ATTR;

        this.taskDuration = DURATION;
        this.taskColor = COLOR;
        this.assignedTaskType = AssignedTaskType.BUILD;

        this.buildingType = buildingType;
    }
}
