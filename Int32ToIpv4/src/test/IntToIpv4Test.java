package test;

import main.IntToIpv4;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntToIpv4Test {
    @Test
    @DisplayName("It should convert a given int32 ip to the value in octets")
    public void shouldConvertIntIpToOctets() {
        assertEquals("128.114.17.104", IntToIpv4.longToIP(2154959208L));
        assertEquals("0.0.0.0", IntToIpv4.longToIP(0));
        assertEquals("128.32.10.1", IntToIpv4.longToIP(2149583361L));
    }

}

