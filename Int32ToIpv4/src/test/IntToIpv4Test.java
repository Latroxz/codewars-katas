package test;

import main.IntToIpv4;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntToIpv4Test {
    @Test
    @DisplayName("It should convert a given int32 IP to the value in Ipv4")
    public void shouldConvertIntIpToOctets() {
        assertEquals("128.114.17.104", IntToIpv4.longToIP(2154959208L));
        assertEquals("0.0.0.0", IntToIpv4.longToIP(0));
        assertEquals("0.0.0.32", IntToIpv4.longToIP(32L));
        assertEquals("128.32.10.1", IntToIpv4.longToIP(2149583361L));
    }

    @Test
    @DisplayName("It should convert a given int32 IP to the value in Ipv4 using streams")
    public void shouldConvertIntIpToOctetsUsingStreams() {
        assertEquals("128.114.17.104", IntToIpv4.longToIpStream(2154959208L));
        assertEquals("0.0.0.0", IntToIpv4.longToIpStream(0));
        assertEquals("0.0.0.32", IntToIpv4.longToIpStream(32L));
        assertEquals("128.32.10.1", IntToIpv4.longToIpStream(2149583361L));
        assertEquals(IntToIpv4.longToIP(32L), IntToIpv4.longToIpStream(32L));
    }

}

