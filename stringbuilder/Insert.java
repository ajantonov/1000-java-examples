public class Insert {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-");
        sb.insert(0, "-");
        sb.insert(4, "-");
        System.out.println(sb);
    }
}
