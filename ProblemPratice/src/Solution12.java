import java.io.*;
import java.util.*;
//'[]
public class Solution12 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> seqList=new ArrayList<List<Integer>>();
        int lastAns=0;
        System.out.println("entr value");
        while(br.readLine()!=null)
            {
            String[] input=br.readLine().split(" ");
            for(int i=0;i<Integer.parseInt(input[0]);i++)
                {
                    seqList.add(i,new ArrayList<Integer>());
                }
                
                for(int j=0;j<Integer.parseInt(input[1]);j++)
                    {
                        String[] query=br.readLine().split(" ");
                        if(Integer.parseInt(query[0])==1)
                            {
                            int resp=(lastAns^Integer.parseInt(query[1]))%Integer.parseInt(input[0]);
                                (seqList.get(resp)).add(Integer.parseInt(query[2]));
                                
                            }
                        
                        if(Integer.parseInt(query[0])==2)
                        {
                           int seq= (lastAns^Integer.parseInt(query[1]))%Integer.parseInt(input[0]);
                           //System.out.println(seq);
                           int ele=Integer.parseInt(query[2])%(seqList.get(seq).size());
                           lastAns=seqList.get(seq).get(0);
                            
                            		//(seqList.get(Integer.parseInt(query[2])%seqList.get(seq).size()));
                            System.out.println(lastAns);
                        }
                                        

                }
        }
                    
            
        }
        
    }
