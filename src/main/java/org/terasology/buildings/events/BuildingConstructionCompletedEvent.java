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
package org.terasology.buildings.events;

import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.event.Event;
import org.terasology.math.Region3i;
import org.terasology.math.geom.Vector3i;
import org.terasology.protobuf.EntityData;
import org.terasology.taskSystem.BuildingType;

import java.util.List;

public class BuildingConstructionCompletedEvent implements Event {

    public List<Region3i> absoluteRegions;
    public BuildingType buildingType;
    public Vector3i centerBlockPosition;
    public EntityRef constructedBuildingEntity;

    public BuildingConstructionCompletedEvent(List<Region3i> regions, BuildingType building, Vector3i center, EntityRef buildingEntity) {
        this.absoluteRegions = regions;
        this.buildingType = building;
        this.centerBlockPosition = center;
        this.constructedBuildingEntity = buildingEntity;
    }
}
