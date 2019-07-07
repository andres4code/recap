package com.sda.tallinn6.evgenii.July_6th.tesk4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoAlpaSymbolsRemover {


    public static void main(String[] args) {
        String initialString = "as4%fmvFD$lDF";

        String result = removeAllNoAlphaSymb(initialString);
        System.out.println(result);
        // "asfmvFDlDF"
    }

    private static String removeAllNoAlphaSymb(String initialString) {
        String s = initialString
                .chars()
                .filter(el -> el < 'z' && el > 'A')
                .mapToObj(item -> (char) item)
                .collect(StringBuilder::new,
                        (sb, i) -> sb.append((char) i),
                        StringBuilder::append)
                .toString();

        return s;
    }

}

//ME TRYING MY VERSION
//    public static void main(String[] args) {
//        String initialString = "as4%fmvFD$lDF";
//
//        String result = removeAllNoAlphaSymb(initialString);//this was given. Is supposed to apply removing f to string
//        //as4fmvFDlDF is expected answer
////        Pattern regex = Pattern.compile("[$&+,:;=?@#|'<>.-^*()%!]");
////        Matcher matcher = regex.matcher(searchQuery.getSearchFor());
//
//    }
//
//    private static String removeAllNoAlphaSymb(String initialString) {//removes special stuff
//        //String[] result = initialString.split("\\a");//splits string into letters
//        Pattern p = Pattern.compile("[$&+,:;=?@#|'<>.-^*()%!]", Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher(initialString);
//        boolean b = m.find();
//
//        if (b) {
//            System.out.println("There is a special character in my string");
//            //removes the special symbols here
//        }else{
//            return null;
//        }
//        return null;
//    }
//}
