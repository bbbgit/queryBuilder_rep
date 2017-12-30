package send;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class constructQuery {

	public static void main(String root, String choice, int DaysActive, boolean ExpireOld, boolean SaveTxt, int Min, int Max, double Percent) throws FileNotFoundException {
		
		String[] sadrzaj = new String[11];
		
		//System.out.println(choice);
		
		 if (choice.equals("Skroz oslobodjeni bez datuma trajanja")) {
			 	
			 	//Cistimo array za svaki sllucaj
			 	Arrays.fill(sadrzaj, null);
			 	
			  //if(ExpireOld==true)	{sadrzaj[0] = "update bkcond set dfin=SYSDATE-1 where dfin is null and ope in ('024','025') and nat in ('COMVER','MACVER','MAVDEP','MICVER','MIVDEP') and cli='"+root+"';";}
				if(ExpireOld==true)	{sadrzaj[0] = "update bkcond set dfin=SYSDATE-1 where ope in ('024','025') and nat in ('COMVER','MACVER','MAVDEP','MICVER','MIVDEP') and cli='"+root+"';";}
				else {sadrzaj[0] = "";};
				sadrzaj[1] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','COMVER',0,'   ',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',null,'***','      ','N',201121,' ');"; 
				sadrzaj[2] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','MACVER',0,'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',null,'***','      ','N',201121,' ');";
				sadrzaj[3] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','MAVDEP',0,'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',null,'***','      ','N',201121,' ');";
				sadrzaj[4] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','MICVER',0,'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',null,'***','      ','N',201121,' ');";
				sadrzaj[5] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','MIVDEP',0,'   ',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',null,'***','      ','N',201121,' ');";
				sadrzaj[6] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','COMVER',0,'   ',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',null,'***','      ','N',201121,' ');";
				sadrzaj[7] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','MACVER',0,'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',null,'***','      ','N',201121,' ');";
				sadrzaj[8] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','MAVDEP',0,'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',null,'***','      ','N',201121,' ');";
				sadrzaj[9] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','MICVER',0,'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',null,'***','      ','N',201121,' ');";
				sadrzaj[10] = "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','MIVDEP',0,'   ',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',null,'***','      ','N',201121,' ');";
			
				for(int x=0; x<11; x=x+1) {
	            	//if dole sprecava da null ode u fajl
	      		 if(sadrzaj[x]!=null) {gui.textResult.append(sadrzaj[x]+"\n");};
	    	   								} 
				
			 } 
		 
		 
         else if (choice.equals("Skroz oslobodjeni sa datumom trajanja")) {
        	 
        	 	//Cistimo array za svaki sllucaj
			 	Arrays.fill(sadrzaj, null);

			  //if(ExpireOld==true)	{sadrzaj[0] = "update bkcond set dfin=SYSDATE-1 where dfin is null and ope in ('024','025') and nat in ('COMVER','MACVER','MAVDEP','MICVER','MIVDEP') and cli='"+root+"';";}
				if(ExpireOld==true)	{sadrzaj[0] = "update bkcond set dfin=SYSDATE-1 where ope in ('024','025') and nat in ('COMVER','MACVER','MAVDEP','MICVER','MIVDEP') and cli='"+root+"';";}
				else {sadrzaj[0] = "";};
				sadrzaj[1] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','COMVER',0,'   ',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',SYSDATE+"+DaysActive+",'***','      ','N',201121,' ');"; 
				sadrzaj[2] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','MACVER',0,'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',SYSDATE+"+DaysActive+",'***','      ','N',201121,' ');";
				sadrzaj[3] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','MAVDEP',0,'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',SYSDATE+"+DaysActive+",'***','      ','N',201121,' ');";
				sadrzaj[4] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','MICVER',0,'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',SYSDATE+"+DaysActive+",'***','      ','N',201121,' ');";
				sadrzaj[5] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','MIVDEP',0,'   ',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',SYSDATE+"+DaysActive+",'***','      ','N',201121,' ');";
				sadrzaj[6] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','COMVER',0,'   ',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',SYSDATE+"+DaysActive+",'***','      ','N',201121,' ');";
				sadrzaj[7] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','MACVER',0,'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',SYSDATE+"+DaysActive+",'***','      ','N',201121,' ');";
				sadrzaj[8] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','MAVDEP',0,'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',SYSDATE+"+DaysActive+",'***','      ','N',201121,' ');";
				sadrzaj[9] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','MICVER',0,'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',SYSDATE+"+DaysActive+",'***','      ','N',201121,' ');";
				sadrzaj[10] = "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','MIVDEP',0,'   ',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',SYSDATE+"+DaysActive+",'***','      ','N',201121,' ');";
			
				for(int x=0; x<11; x=x+1) {
	            	//if dole sprecava da null ode u fajl
	      		 if(sadrzaj[x]!=null) {gui.textResult.append(sadrzaj[x]+"\n");};
	    	   								} 
        	 
        	 }
			 
		 
         else if (choice.equals("Nova tarifa bez datuma trajanja")) {
        
        	 	//Cistimo array za svaki sllucaj
			 	Arrays.fill(sadrzaj, null);
        		
			  //if(ExpireOld==true)	{sadrzaj[0] = "update bkcond set dfin=SYSDATE-1 where dfin is null and ope in ('024','025') and nat in ('COMVER','MACVER','MAVDEP','MICVER','MIVDEP') and cli='"+root+"';";}
        		if(ExpireOld==true)	{sadrzaj[0] = "update bkcond set dfin=SYSDATE-1 where ope in ('024','025') and nat in ('COMVER','MACVER','MAVDEP','MICVER','MIVDEP') and cli='"+root+"';";}
				else {sadrzaj[0] = "";};
				sadrzaj[1] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','COMVER',"+Percent+",'   ',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',null,'***','      ','N',301121,' ');"; 
				sadrzaj[2] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','MACVER',"+Max+",'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',null,'***','      ','N',301121,' ');";
				sadrzaj[3] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','MAVDEP',"+Max+",'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',null,'***','      ','N',301121,' ');";
				sadrzaj[4] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','MICVER',"+Min+",'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',null,'***','      ','N',301121,' ');";
				sadrzaj[5] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','MIVDEP',"+Min+",'   ',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',null,'***','      ','N',301121,' ');";
				sadrzaj[6] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','COMVER',"+Percent+",'   ',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',null,'***','      ','N',301121,' ');";
				sadrzaj[7] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','MACVER',"+Max+",'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',null,'***','      ','N',301121,' ');";
				sadrzaj[8] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','MAVDEP',"+Max+",'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',null,'***','      ','N',301121,' ');";
				sadrzaj[9] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','MICVER',"+Min+",'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',null,'***','      ','N',301121,' ');";
				sadrzaj[10] = "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','MIVDEP',"+Min+",'   ',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',null,'***','      ','N',301121,' ');";
			
				for(int x=0; x<11; x=x+1) {
	            	//if dole sprecava da null ode u fajl
	      		 if(sadrzaj[x]!=null) {gui.textResult.append(sadrzaj[x]+"\n");};
	    	   								} 
        	 
        	 }
         else if (choice.equals("Nova tarifa sa datumom trajanja")) {
        	 
        	//Cistimo array za svaki sllucaj
			 	Arrays.fill(sadrzaj, null);

			  //if(ExpireOld==true)	{sadrzaj[0] = "update bkcond set dfin=SYSDATE-1 where dfin is null and ope in ('024','025') and nat in ('COMVER','MACVER','MAVDEP','MICVER','MIVDEP') and cli='"+root+"';";}
				if(ExpireOld==true)	{sadrzaj[0] = "update bkcond set dfin=SYSDATE-1 where ope in ('024','025') and nat in ('COMVER','MACVER','MAVDEP','MICVER','MIVDEP') and cli='"+root+"';";}
				else {sadrzaj[0] = "";};
				sadrzaj[1] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','COMVER',"+Percent+",'   ',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',SYSDATE+"+DaysActive+",'***','      ','N',301121,' ');"; 
				sadrzaj[2] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','MACVER',"+Max+",'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',SYSDATE+"+DaysActive+",'***','      ','N',301121,' ');";
				sadrzaj[3] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','MAVDEP',"+Max+",'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',SYSDATE+"+DaysActive+",'***','      ','N',301121,' ');";
				sadrzaj[4] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','MICVER',"+Min+",'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',SYSDATE+"+DaysActive+",'***','      ','N',301121,' ');";
				sadrzaj[5] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','024','***','N','   ','"+root+"       ','           ','  ','MIVDEP',"+Min+",'   ',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***024***N',SYSDATE+"+DaysActive+",'***','      ','N',301121,' ');";
				sadrzaj[6] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','COMVER',"+Percent+",'   ',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',SYSDATE+"+DaysActive+",'***','      ','N',301121,' ');";
				sadrzaj[7] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','MACVER',"+Max+",'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',SYSDATE+"+DaysActive+",'***','      ','N',301121,' ');";
				sadrzaj[8] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','MAVDEP',"+Max+",'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',SYSDATE+"+DaysActive+",'***','      ','N',301121,' ');";
				sadrzaj[9] =  "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','MICVER',"+Min+",'941',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',SYSDATE+"+DaysActive+",'***','      ','N',301121,' ');";
				sadrzaj[10] = "Insert into bkcond (AGE,OPE,DEV,BAN,PRO,CLI,CPT,SUF,NAT,VAL,DEVR,FOR1,VARP1,VARM1,FOR2,VARP2,VARM2,FOR3,VARP3,VARM3,FOR4,VARP4,VARM4,FOR5,VARP5,VARM5,DOU,DMO,CUTI,DREF,CLEUNI,DFIN,CPROD,CPACK,REMISE,POIDS,TYPREMISE) values ('99000','025','***','N','   ','"+root+"       ','           ','  ','MIVDEP',"+Min+",'   ',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,SYSDATE,null,'"+(System.getProperty("user.name")).toUpperCase()+"  ',SYSDATE,'99000      ***025***N',SYSDATE+"+DaysActive+",'***','      ','N',301121,' ');";
			
				for(int x=0; x<11; x=x+1) {
	            	//if dole sprecava da null ode u fajl
	      		 if(sadrzaj[x]!=null) {gui.textResult.append(sadrzaj[x]+"\n");};
	    	   								}         	 
        	 
        	 }
  		
	
			
		 
		 
		 if (SaveTxt==true) {
		 
			 
			 
			//Pravi folder za fajl
				Boolean success = new File("c:\\derogacije_bb\\").mkdirs();
				if (!success) {
				    // Directory creation failed
							}
				
						
				  //Output to file
		        try(  PrintWriter out = new PrintWriter("c:\\derogacije_bb\\"+root+".txt" )  ){
		   	                        
		            for(int x=0; x<11; x=x+1) {
		            	//if dole sprecava da null ode u fajl
		      		 if(sadrzaj[x]!=null) {out.println(sadrzaj[x]);};
		    	   								}                
		             }
			 
			 
		 };
		 
		 
		
		
	
		
		
	}

}
