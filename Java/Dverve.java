// AnshumanSarma_WAP to create a menu-driven event management system


import java.util.*;
class Dverve
{
 	String[] eventname = new String[10];
    String[] venue = new String[10];
 	String[] date  = new String[10];
 	String[] starttime =  new String[10];
 	int[] noofparticipants = new int[10];
 
 	void addEvent(int i)
 	{
     	Scanner s = new Scanner(System.in);
    	System.out.print("Enter the event name: ");
  		eventname[i]= s.nextLine();
        System.out.print("Enter the event venue: ");
  		venue[i]= s.nextLine();
        System.out.print("Enter the date of event: ");
  		date[i]= s.nextLine();
        System.out.print("Enter the time of event: ");
  		starttime[i]= s.nextLine();
        System.out.print("Enter the number of participants: ");
  		noofparticipants[i]= s.nextInt();
    }

    void editEvent(int eventnm)
    {
        Scanner s = new Scanner(System.in);
        eventnm--;
    	System.out.print("Enter the new event name: ");
  		eventname[eventnm]= s.nextLine();
        System.out.print("Enter the new event venue: ");
  		venue[eventnm]= s.nextLine();
        System.out.print("Enter the new date of event: ");
  		date[eventnm]= s.nextLine();
        System.out.print("Enter the new time of event: ");
  		starttime[eventnm]= s.nextLine();
        System.out.print("Enter the new number of participants: ");
  		noofparticipants[eventnm]= s.nextInt();
    }
    void display(int i)
    {   
        System.out.print("\n\n\n\n");
        System.out.print("The event details are as follows:\n\n");
        for(int j=0 ; j<i ;j++)
        {
            int c=j+1;
            System.out.println("Event Number : " + c );
     	 	System.out.println("Event Name : " + eventname[j]);
     	 	System.out.println("Venue : " + venue[j]);
     	 	System.out.println("Date  : " + date[j]);
         	System.out.println("Time  : " + starttime[j]);
         	System.out.println("Number of participants  : " + noofparticipants[j]);
         	System.out.print("\n");
         }
    } 

    public static void main(String args[])
    {
        int choice,evnt,noofevents=0;
      	Dverve event = new Dverve();
      	do
      	{
       		Scanner sc = new Scanner(System.in);
       		System.out.println("****MENU****");
       		System.out.println("1.Add Event");
       		System.out.println("2.Display Event details");
            System.out.println("3.Edit");
            System.out.println("4.Exit");
       		System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            if(choice == 1)
            {
             	event.addEvent(noofevents);
                noofevents++;
            }
            else if(choice == 2)
             {
             	event.display(noofevents);
            }
            else if(choice == 3)
             {
                Scanner sn = new Scanner(System.in);
             	System.out.println("Enter the event number to update (eventname): ");
                evnt = sn.nextInt();
                event.editEvent(evnt);
             }
             else if(choice == 4)
             {
             	System.out.println("Exiting!!\n");
             }
            else
              System.out.println("Invalid Input!!\n");
         }while(choice < 4);
    }
}