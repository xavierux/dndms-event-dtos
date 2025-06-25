package com.xvclemente.dnd.dtos.events;

import java.util.Map;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParticipantesListosParaAventuraEvent {
    private String adventureId; // El ID de la aventura original de MS1
    private Map<String, CombatantStatsDto> characters;
    private Map<String, CombatantStatsDto> enemies;

}