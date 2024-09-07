package com.lgncs.mission.management;

public class ManagementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] namelist = {
				"Skye Heredia", "Lucille Waltz", "Nichol Sutphin", "Vernia Caraway",
	            "Rita Rangel", "Waldo Ontiveros", "Milton Grantham", "Loura Swilley",
	            "Lola Duropan", "Kandis Mcnary", "Milford Kirts", "Denita Taniguchi",
	            "Talia Fenderson", "Truman Daoust", "Alfonso Chaloux", "Fernanda Overby",
	            "Cristy Yearby", "Daniell Pabst", "Bradley Newson", "Renda Maffei"	
		};
		
		Department techTeam = new Department("D01", "Tim Teknis", 100);
        Department hrTeam = new Department("D02", "Tim SDM", 5);
        Department securityTeam = new Department("D03", "Tim Keamanan", 5);
        
        Employee[] employees = new Employee[namelist.length];
        for (int i = 0; i < namelist.length; i++) {
            employees[i] = new Employee("EMP" + String.format("%02d", i + 1), namelist[i]);
            employees[i].setDepartment(techTeam);
        }
        System.out.println("Status Penetapan Awal");
        techTeam.printEmployeeList();
        hrTeam.printEmployeeList();
        securityTeam.printEmployeeList();
        
        for (int i = 0; i < namelist.length; i++) {
            int idNum = i + 1;
            if (idNum % 5 == 0) {
                employees[i].setDepartment(securityTeam);
            } else if (idNum % 2 == 0) {
                employees[i].setDepartment(hrTeam);
            }
        }
        System.out.println("Status setelah terjadi transfer");
        techTeam.printEmployeeList();
        hrTeam.printEmployeeList();
        securityTeam.printEmployeeList();
	}

}
