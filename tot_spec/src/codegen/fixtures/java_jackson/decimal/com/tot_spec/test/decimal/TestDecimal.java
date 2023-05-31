package com.tot_spec.test.decimal;
import lombok.*;
import java.util.*;

// struct for decimal field
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestDecimal {
    private java.math.BigDecimal value;
}
