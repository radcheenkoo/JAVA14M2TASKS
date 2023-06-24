public class NameEncoderDecoder {
    public String encode(String name){
        String nameCode = name.replace("e","1")
                .replace("u","2")
                .replace("i","3")
                .replace("o","4")
                .replace("a","5");
        return "NOTFORYOU" + nameCode + "YESNOTFORYOU";
    }
    public String decode(String name){
        String prefix = "NOTFORYOU";
        String postfix = "YESNOTFORYOU";

        name = name.replace(postfix, "")
                .replace(prefix, "");

        name = name.replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a");

        return name;
    }
}
