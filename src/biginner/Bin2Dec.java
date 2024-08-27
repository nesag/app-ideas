package src.biginner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bin2Dec {

    public static void main(String[] args) {
        List<Integer> binaryList = new ArrayList<>();
        binaryList.add(0b1101);
        binaryList.add(0b1010);
        binaryList.add(0b1111);
        binaryList.add(0b1001);
        binaryList.add(0b101111011011);
        binaryList.add(0b111010011100);
        binaryList.add(0b111110010011);
        binaryList.add(0b100111011111);
        binaryList.add(0b111011111011);
        binaryList.add(0b101101001110);
        binaryList.add(0b111101011111);
        binaryList.add(0b101110101101);
        binaryList.add(0b110000110111);
        binaryList.add(0b110010010100);
        binaryList.add(0b100110110111);
        binaryList.add(0b110011100011);
        binaryList.add(0b101101010001);
        binaryList.add(0b111011010110);
        binaryList.add(0b110000111001);
        binaryList.add(0b100010110010);
        binaryList.add(0b100100010000);
        binaryList.add(0b101111111010);
        binaryList.add(0b100011001001);
        binaryList.add(0b110111111111);
        binaryList.add(0b100000101101);
        binaryList.add(0b110110100011);
        binaryList.add(0b101101110111);
        binaryList.add(0b101111000011);
        binaryList.add(0b111001101100);
        binaryList.add(0b101001101000);
        binaryList.add(0b101111010001);
        binaryList.add(0b110011000011);
        binaryList.add(0b111001100001);
        binaryList.add(0b100111100111);

        for(Integer binary : binaryList){
            System.out.println("Binario: -> " + Integer.toBinaryString(binary) + " Decimal: -> " + binary);
        }

        List<String> decimalList = binaryList.stream()
                .map(Integer::toBinaryString)
                .collect(Collectors.toList());

        decimalList.forEach(decimal -> System.out.println("Descimal: " + decimal) );
    }
}
