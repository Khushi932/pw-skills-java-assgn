public class que_2 {
    public static void main(String[] args) {
        String str[] = {"ab","bc","cd","de","ef","fg","gh","hi"};
        for(int i=0;i<str.length;i++){
            if((i%2)!= 0){
                System.out.println(str[i]);
            }
        }
    }
}
