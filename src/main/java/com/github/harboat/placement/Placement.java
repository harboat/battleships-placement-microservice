package com.github.harboat.placement;

import com.github.harboat.clients.game.ShipDto;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Document
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
@Builder
@SuppressFBWarnings(value = {"EI_EXPOSE_REP", "EI_EXPOSE_REP2"})

public class Placement {
    @Id private String id;
    private String roomId;
    private String playerId;
    private Collection<ShipDto> ships;
}
