package com.sda.tallinn6.fundamentals.data.types;

public class HexaBinaryPrimitives {

    public static void main(String[] args) {
        int hexa = 0x0001;
        short hexa1 = 0x0001;
        byte hexa2 = 0x0001;
        long hexa3 = 0x0001;

        //short range -128 127
        //-0x0101 : -257
        short hexaByte = -0x0101;

        // 0x7ffffff - 2147483647
        int hexaInt = 0x7ffffff;

        long hexaLong = 0x7fff_ffff_ffff_ffffl;
        long hexaBytes = 0xFFECDE5E;
        int deadCode = 0xDEAD_C0DE;


        int binaryFirst = 0b10101010;
        int binaryThree = 0B00000011;  //IF number is too big(error), THEN add L or l
        int binaryUnderscore = 0B1100_0000;
        short binaryShort = 0b11111111; //255
        //byte binaryByte = 0b11111111; //255


    }

}
