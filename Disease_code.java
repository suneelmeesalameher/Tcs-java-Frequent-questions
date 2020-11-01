import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	Medicine[] medicine=new Medicine[4];
    	Medicine[] med=new Medicine[4];
    	for(int i=0;i<4;i++)
    	{
    		medicine[i]=new Medicine(sc.next(),sc.next(),sc.next(),sc.nextInt());
    		sc.nextLine();
    	}
    	String disease2=sc.nextLine();
    	med=getPriceByDisease(medicine,disease2);
    	for(int l=0;l<4;l++)
    	{
    		if(med[l]!=null)
    		{
    			System.out.println(med[l].getPrice());
    		}
    	}
       
    }
    public static Medicine[] getPriceByDisease(Medicine[] medicines,String disease) {
        Medicine[] med2=new Medicine[4];
        int k=0;
        for(int j=0;j<4;j++)
        {
        	if(medicines[j].getDisease().equalsIgnoreCase(disease))
	        {
	        	med2[k]=medicines[j];
	        	k=k+1;
        	}
        }
        return med2;

    }
}
class Medicine{
 private String medicineName;
 private String batch;
 private String disease;
 private int price;
 public Medicine(String medicineName, String batch, String disease, int price){
 	this.medicineName=medicineName;
 	this.batch=batch;
 	this.disease=disease;
 	this.price=price;
 }


 public String getMedicineName()
 {
 	return medicineName;
 }
 public void setMedicineName(String medicineName)
 {
 	this.medicineName=medicineName;
 }


 public String getBatch()
 {
 	return batch;
 }
 public void setBatch(String batch)
 {
 	this.batch=batch;
 }



 public String getDisease()
 {
 	return disease;
 }
 public void setDisease(String disease)
 {
 	this.disease=disease;
 }



 public int getPrice()
 {
 	return price;
 }
 public void setPrice(int price)
 {
 	this.price=price;
 }

}