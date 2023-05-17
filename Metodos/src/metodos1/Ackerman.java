package metodos1;

public class Ackerman {

    public static long ackerman(long m,long n){
    	
    	int Ack =0;
        if(m == 0){
            Ack += n+1;
        }else if(n == 0){
            Ack +=ackerman(m-1,1);
        }else if(m>0 && n<0){

        	Ack +=ackerman(m-1,ackerman(m,n-1));
        	
        }
        return Ack;
    }
}
