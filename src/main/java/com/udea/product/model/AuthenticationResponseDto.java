import java.io.Serializable;

public record AuthenticationResponseDto(String jwt) implements Serializable {}