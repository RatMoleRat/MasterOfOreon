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
package org.terasology.taskSystem;

import org.terasology.rendering.nui.Color;

import java.util.List;
import java.util.ArrayList;

public class Task {
    public static final String HEALTH_ATTR = "health";
    public static final String INTELLIGENCE_ATTR = "intelligence";
    public static final String STRENGTH_ATTR = "strength";
    public static final String HUNGER_ATTR = "hunger";

    // Effects on different Oreon attributes after task completion
    public int health;
    public int intelligence;
    public int strength;
    public int hunger;

    public String primaryAttr;

    // Task specifications
    public String assignedTaskType = AssignedTaskType.NONE;
    public float taskDuration;
    public Color taskColor = Color.MAGENTA.alterAlpha(90);
    public BuildingType buildingType = BuildingType.None;
    public long requiredBuildingEntityID;
    public List<String> requiredBlocks = new ArrayList<>();
    public String blockResult = "";

    public boolean isAdvanced;

    // URI of the block to render as an indication for the task being performed
    public String blockToRender = "";

    public int getSkillInPrimary() {
        switch (primaryAttr) {
            case HEALTH_ATTR:
                return health;
            case INTELLIGENCE_ATTR:
                return intelligence;
            case STRENGTH_ATTR:
                return strength;
            default:
                return hunger;
        }
    }
}
