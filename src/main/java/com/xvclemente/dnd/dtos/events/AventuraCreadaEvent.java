package com.xvclemente.dnd.dtos.events;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AventuraCreadaEvent {
    private String adventureId;
    private String challengeType;
    private String environment;
    private int numEncounters; // de 1 a 3
    private String goldRewardTier; // "poor", "generous", "treasure"

    public AventuraCreadaEvent(String adventureId, String challengeType, String environment, int numEncounters, String goldRewardTier) {
        this.adventureId = adventureId;
        this.challengeType = challengeType;
        this.environment = environment;
        this.numEncounters = numEncounters;
        this.goldRewardTier = goldRewardTier;
    }
