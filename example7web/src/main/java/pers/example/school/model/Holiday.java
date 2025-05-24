package pers.example.school.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Holiday {

    private final String day;
    private final String reason;
    private final Type type;

    public enum Type {
        FESTIVAL, FEDERAL
    }
}
