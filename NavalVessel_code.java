import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		NavalVessel[] navalvessel=new NavalVessel[4];
		for(int i=0;i<4;i++)
		{
			int vesselId=sc.nextInt();sc.nextLine();
			String vesselName=sc.nextLine();
			int noOfVoyagesPlanned=sc.nextInt();
			int noOfVoyagesCompleted=sc.nextInt();sc.nextLine();
			String purpose=sc.nextLine();
			navalvessel[i]=new NavalVessel(vesselId,vesselName,noOfVoyagesPlanned,noOfVoyagesCompleted,purpose);
		}
		int percentage=sc.nextInt();sc.nextLine();
		String purpose1=sc.nextLine();
		
		int ans1=findAvgVoyagesByPct(navalvessel,percentage);
		System.out.println(ans1);
		
		NavalVessel nav=findVesselByGrade(navalvessel,purpose1);
		int pp1;
		pp1=(nav.getNoOfVoyagesCompleted()*100)/nav.getNoOfVoyagesPlanned();
		
		if(pp1==100)
		{
			System.out.print(nav.getVesselName()+"%Star");
		}
		else if(pp1>80 && pp1<=99)
		{
			System.out.print(nav.getVesselName()+"%Leader");
		}
		else if(pp1>55 && pp1<=79)
		{
			System.out.print(nav.getVesselName()+"%Inspirer");
		}
		else if(pp1>0&& pp1<55)
		{
			System.out.print(nav.getVesselName()+"%Striver");
		}
		else if(pp1==0) {
			System.out.print(nav.getVesselName()+"%No Naval Vessel");
		}
	}
	public static int findAvgVoyagesByPct(NavalVessel[] navalvessel, int percentage) {
		int avg=0;
		int count=0;
		int pp=0;
		for(int i=0;i<4;i++)
		{
			pp=(navalvessel[i].getNoOfVoyagesCompleted()*100)/navalvessel[i].getNoOfVoyagesPlanned();
			if(pp>=percentage)
			{
				avg=avg+navalvessel[i].getNoOfVoyagesCompleted();
				count=count+1;
			}
		}
		int per=avg/count;
		return per;
	}
	public static NavalVessel findVesselByGrade(NavalVessel[] navalvessel,String purpose) {
		NavalVessel nava=new NavalVessel(0,null,0,0,null);

		for(int i=0;i<4;i++)
		{
			if(navalvessel[i].getPurpose().equalsIgnoreCase(purpose)) {
				nava=navalvessel[i];
			}
		}
		return nava;
	}
}

class NavalVessel{
	private int vesselId;
	private String vesselName;
	private int noOfVoyagesPlanned;
	private int noOfVoyagesCompleted;
	private String purpose;
	private String classification;
	public int getVesselId() {
		return vesselId;
	}
	public void setVesselId(int vesselId) {
		this.vesselId = vesselId;
	}
	public String getVesselName() {
		return vesselName;
	}
	public void setVesselName(String vesselName) {
		this.vesselName = vesselName;
	}
	public int getNoOfVoyagesPlanned() {
		return noOfVoyagesPlanned;
	}
	public void setNoOfVoyagesPlanned(int noOfVoyagesPlanned) {
		this.noOfVoyagesPlanned = noOfVoyagesPlanned;
	}
	public int getNoOfVoyagesCompleted() {
		return noOfVoyagesCompleted;
	}
	public void setNoOfVoyagesCompleted(int noOfVoyagesCompleted) {
		this.noOfVoyagesCompleted = noOfVoyagesCompleted;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public NavalVessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted,
			String purpose) {
		super();
		this.vesselId = vesselId;
		this.vesselName = vesselName;
		this.noOfVoyagesPlanned = noOfVoyagesPlanned;
		this.noOfVoyagesCompleted = noOfVoyagesCompleted;
		this.purpose = purpose;
		
	}
	
}