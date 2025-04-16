# Convert Unsigned 32-bit Number to IPv4 Address

## Explanation

Take the following IPv4 address: **128.32.10.1**

This address consists of **4 octets**, where each octet is a single byte (or 8 bits).

### Binary Representation of Each Octet:
- **1st octet (128):** `10000000`
- **2nd octet (32):** `00100000`
- **3rd octet (10):** `00001010`
- **4th octet (1):** `00000001`

When combined, the full binary representation of the IP address is:
```10000000.00100000.00001010.00000001```


Since the above IP address has 32 bits, we can represent it as a **single unsigned 32-bit number** in decimal format: **2149583361**

---

## Objective

Complete a function that:
1. Takes an unsigned **32-bit number**.
2. Returns a **string representation** of its corresponding IPv4 address.

---

## Examples

| Unsigned 32-bit Number | IPv4 Address    |
|-------------------------|-----------------|
| **2149583361**         | `"128.32.10.1"` |
| **32**                 | `"0.0.0.32"`    |
| **0**                  | `"0.0.0.0"`     |
