package main;

public class IntToIpv4 {

    public static String longToIP(long ip) {
        StringBuilder ipBinary = getBinaryIp(ip);
        StringBuilder ipv4 = getIpv4(ipBinary);
        return ipv4.toString();
    }

    private static StringBuilder getIpv4(StringBuilder ipBinary) {
        StringBuilder ipv4 = new StringBuilder();
        while (!ipBinary.isEmpty()) {
            ipv4.append(Integer.parseInt(ipBinary.substring(0, 8), 2));
            ipv4.append(".");
            ipBinary.delete(0, 8);
        }
        // delete last . in result xx.xx.xx.xx.
        ipv4.setLength(ipv4.length() - 1);
        return ipv4;
    }

    private static StringBuilder getBinaryIp(long ip) {
        return new StringBuilder(String.format("%32s", Long.toBinaryString(ip)).replace(" ", "0"));
    }

    public static void main(String[] args) {
        longToIP(32L); // 0.0.0.32
        longToIP(2147483648L); // 128.0.0.0
        longToIP(2149583361L);
    }

}
