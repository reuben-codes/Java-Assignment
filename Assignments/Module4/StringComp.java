package Module4;

public class StringComp {
    public static void main(String[] args) {
        String str="SN";
        str+="PSU";
        System.out.println("String: "+str);
        StringBuilder sb=new StringBuilder("SN");
        sb.append("PSU");
        System.out.println("StringBuilder: "+sb);
        StringBuffer sbf=new StringBuffer("SN");
        sbf.append("PSU");
        System.out.println("StringBuffer: "+sbf);
    }
}
