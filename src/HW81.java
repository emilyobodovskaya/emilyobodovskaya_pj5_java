public class HW81 {
    public static void main(String[] args){
        for(int i = 0; i <= 100; i++) {
            String iToStr = String.valueOf(i);
            if(!(iToStr.contains("4") || iToStr.contains("9"))) {
                System.out.println( i + "-space shuttle" );
            }

        }
    }
}