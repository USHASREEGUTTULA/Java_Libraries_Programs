package validation_program_with_exception_handling;

import java.util.ArrayList;
import java.util.Scanner;

public class RunnerMain 
{
	  public static void main(String[] args) 
			{
				ArrayList<Runner> allRunners=new ArrayList<Runner>();
				Scanner s=new Scanner(System.in);
				
				int continueOrStopStatus=1;
				
				while(continueOrStopStatus==1)
				{
					System.out.println("enter the name");
					String name=s.nextLine();
					
					System.out.println("enter the jersy number");
					int number=s.nextInt();
					s.nextLine();
					
					System.out.println("enter the speed");
					double speed=s.nextDouble();
					s.nextLine();
					
					do
					{
						try
						{
							allRunners.add(new Runner(name,number,speed));
							break;
						}
						catch(AverageSpeedException orv6)
						{
							System.out.println("re-enter the average speed");
							speed=s.nextDouble();
							s.nextLine();
						}
						catch(RuntimeException orv1)
						{
							System.out.println(orv1);
							System.out.println("Re-enter the name");
							name=s.nextLine();
						}
						catch(JerseyException orv2)
						{
							System.out.println(orv2);
							System.out.println("Re-enter the jersey number");
							number=s.nextInt();
							s.nextLine();
						}
					}while(true);
					System.out.println("runner details are successfully entered");
					
					System.out.println("press 1 to continue to enter another runner details");
					System.out.println("press 0 to stop");
					continueOrStopStatus=s.nextInt();
					s.nextLine();
						
				}
				System.out.println(allRunners);
			}
}