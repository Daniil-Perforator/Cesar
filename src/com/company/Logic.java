package com.company;
public class Logic {
    public void cesarCipherDecoder(int shift, StringBuilder stringForDecode) {
        String cipher = stringForDecode.toString();
        char[] charsForDecoder = cipher.toCharArray();
        String russianAlphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        char[] w = russianAlphabet.toCharArray();
        char[] d = russianAlphabet.toLowerCase().toCharArray();
        for (int i = 0; i < charsForDecoder.length; i++) {
            for (int j = 0; j < w.length; j++) {
                if (charsForDecoder[i] == w[j]) {
                    if (j + shift > w.length) {
                        charsForDecoder[i] = w[(shift - (w.length - j))];
                    } else {
                        charsForDecoder[i] = w[j + shift];
                    }
                    break;}}
            for (int j = 0; j < d.length; j++) {
                if (charsForDecoder[i] == d[j]) {
                    if (j + shift > (d.length - 1)) {
                        charsForDecoder[i] = d[(shift - (d.length - j))];
                    } else {
                        charsForDecoder[i] = d[j + shift];
                    }
                    break;
                }
            }
        }
        System.out.println(String.valueOf(charsForDecoder));
    }
}
