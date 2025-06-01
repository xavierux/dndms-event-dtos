package com.xvclemente.dnd.dtos.events;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AventuraFinalizadaEvent {
    private String adventureId;
    private List<String> pjsGanadoresIds; // IDs de los PJs que sobrevivieron/ganaron
    private List<String> ensDerrotadosIds; // IDs de todos los ENs derrotados en la aventura
    private int oroGanadoPorPJ; // 0 si los PJs perdieron la aventura
    private String resultadoAventura; // ej: "PJs VICTORIOSOS", "PJs DERROTADOS"
}
