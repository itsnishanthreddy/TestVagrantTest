import static java.lang.Math.*;
class Solution1
{
    public static void main(String[] args)
    {
        int price[]={1100,900,200,100},gst[]={18,12,28,0},quantity[]={1,4,3,2},total=0,gstp=0,f=0;
        String product[]={"leatherwallet", "Umbrella","Cigarette","Honey"};
        for(int i=0;i<4;i++)
        {
            total = total + (price[i]+((price[i]*gst[i])/100))*quantity[i];
            int cur= ((price[i]*gst[i])/100)*quantity[i];
            if(cur>gstp){
                f=i;
            }
        gstp=max(gstp,cur);
        }
    System.out.println("The product for which we paid the highest GST is " + product[f]);
    System.out.println("The Total amount to be paid to the shopkeeper is Rs." + total);
    }
}