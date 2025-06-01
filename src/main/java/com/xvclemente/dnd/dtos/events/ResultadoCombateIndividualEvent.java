package com.xvclemente.dnd.dtos.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultadoCombateIndividualEvent {
    private String adventureId;
    private int encounterNum; // Número del encuentro dentro de la aventura
    private String winnerId; // ID del PJ o EN ganador
    private String loserId;  // ID del PJ o EN perdedor
    private String winnerType; // "PJ" o "EN"
    private String loserType;  // "PJ" o "EN"
}
