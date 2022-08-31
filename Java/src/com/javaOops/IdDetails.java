package com.javaOops;



public class IdDetails {

	public static void main(String[] args) 
	{
		
		  IdProof id=new IdProof();
		  id.setNam("Aadhar Card"); 
		  id.setNum(251245654525L);
		  id.setValid("22/05/2030");
		  
		  
		  
		  Person1 p=new Person1(); 
		  p.setId(125); 
		  p.setName("Mr.Ram Jadhav");
		  p.setContact("9856456525"); 
		  p.setAdd("Pune"); p.setI(id);
		 
		/*IdProof id=new IdProof(251245654525L,"Aadhar Card","22/05/2030");
		
		Person1 p=new Person1(125,"Mr.Ram Jadhav","Pune","9856456525",id);
		
		System.out.println(p);*/

		
		
		  System.out.println("Company Id Number: "+p.getId()+
		  "\nPerson Name: "+p.getName()+ "\nContact details: "+p.getContact()+
		  "\nAddress: "+p.getAdd()+ "\n\nId Proof Details: "+
		  "\nID Proof: "+id.getNam()+ "\nId Number: "+id.getNum()+
		  "\nValid Upto: "+id.getValid());
		 
		
		
				
		

	}

}
