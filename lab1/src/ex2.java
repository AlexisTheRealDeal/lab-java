public class ex2 {
    public static void main(String[] args){
        int month_days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("lunile cu 31 de zile sunt:");
        for(int i=0;i<12;i++){
            if(month_days[i]==31) {
                System.out.println(months[i]);
            }
        }
    }
}
