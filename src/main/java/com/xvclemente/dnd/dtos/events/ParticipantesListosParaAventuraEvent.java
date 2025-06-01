package com.xvclemente.dnd.dtos.events;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParticipantesListosParaAventuraEvent {
    private String adventureId; // El ID de la aventura original de MS1
    private List<String> characterIds; // Lista de IDs de los PJs que se unen
    private List<String> enemyIds; // Lista de IDs de los ENs que participarán

}