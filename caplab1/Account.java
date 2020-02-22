package caplab1;  

	 abstract class Account extends Person
	{
		long accNum;
		public long getAccNum() {
			return accNum;
		}
		public void setAccNum(long accNum) {
			this.accNum = accNum;
		}
		public double getBalance1() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
	      double balance;
		//static double balancetot;
		//double amt = 0;
		//double minbal=500;
	
	
	/*public void accdet(String accNum)
	{
		System.out.println("Enter acc num :");
		accNum=sc.next();
	}*/
	
	public void deposit(double amt)
	{
		//minbal=500;
		balance=balance+amt;
		
	/*	System.out.println("Enter amount to deposit :");
		balancetot=sc.nextLong();
		balancetot=minbal+balance;
		amt=balancetot+amt;
		System.out.println("deposited amount :"+amt);*/
		
	}
	
	abstract void withdraw(double amt);
	
	void display()
	{

		System.out.println("Person details");
		//System.out.println("-------------------");
		System.out.println("Acc no :"+accNum);
		//System.out.println("Last Name :");
		//System.out.println("Gender :"+g);
		//System.out.println("Phone number :"+Phno);
		System.out.println("balance :"+balance);
		
	
	}
	
	
	 public static void main(String[] args)
	    {
			// TODO Auto-generated method stub
			//AccountDet ad=new AccountDet();
		// long balance;
			Person accHolder=new Person();
			//p.display();
		    Savings sa=new Savings();
		// System.out.println("enter name");
			accHolder.setName("Smith");
			accHolder.setAge((float)20.0);
			sa.getAccNum();
			sa.setBalance(2000);
			sa.deposit(2000);
			accHolder.dis();
			sa.display();
			accHolder.setName("Kathy");
			accHolder.setAge((float)10.0);
			sa.getAccNum();
			sa.setBalance(3000);
			sa.withdraw(2000);
			sa.getBalance1();
			sa.withdraw(1000);
			accHolder.dis();
			Current c=new Current();
			c.withdraw(500);
		   /* Account a=new Account();
			//a.display();
		    Account a2=new Account();
		  //  Account a1=new Account("kath",21,559,3000);
	        Scanner sc=new Scanner(System.in);
	    //  System.out.println("enter name");
	        sc.nextLine();
	       a.deposit(500);
	       a.withdraw(balance);
	       a.getBalance(); */
			
			try{
				if(accHolder.age>15)
				{
					System.out.println("yes");
				}
				else
				{
					throw new Exception();
				}
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
	
	}
	 
	 class Person
		{
			//public final int getAge = 0;
			String name;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public float getAge() {
				return age;
			}
			public void setAge(float age) {
				this.age = age;
			}
			float age;
			
			void dis()
			{
				System.out.println("Account Holder Details:");
				System.out.println("Name:"+name);
				System.out.println("Age:"+age);
			
			}
			
		}	
	   
	 
	 class Savings extends Account
     {
     	final int minbal=500;
     	public void withdraw(double amt)
     	{
     		if(balance>minbal){
     		if(amt>balance)
     			System.out.println("*********insufficient bal*****in Savings******");
     		else{
     			balance-=amt;
     		}
     		}
     		else
     			System.out.println("************minimum balance*in savings**********");
     	}
     	
     }

     class Current extends Account
     {
     	int overdraftLimit=1000;
     	public void withdraw(double amt)
     	{
     		if(amt>overdraftLimit)
     			System.out.println("false");
     		else 
     				System.out.println("true");;
     	}
     }


