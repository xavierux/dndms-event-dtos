package com.xvclemente.dnd.dtos.events;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CombatantStatsDto {
    private String nombre;
    private int hpActual;
    private int ataqueActual;
    private int defensaActual;
}