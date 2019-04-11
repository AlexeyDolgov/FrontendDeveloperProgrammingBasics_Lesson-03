package task3;

public class Calendar {
	
	public static void main(String[] args) {
		
		 String day="пт";
		 
		 switch(day) {
		 case "пн":{
			 System.out.println(day);
			 System.out.println("Создать план на неделю");
			 break;
		 }
		 case "вт":{
			 System.out.println(day);
			 System.out.println("Сделать наконец то, что было в планах на понедельник");
			 break;
		 }
		 case "ср":{
			 System.out.println(day);
			 System.out.println("Осознать, что уже два дня не прошли зря");
			 break;
		 }
		 case "чт":{
			 System.out.println(day);
			 System.out.println("Отдохнуть от проделанной работы");
			 break;
		 }
		 case "пт":{
			 System.out.println(day);
			 System.out.println("Выполнить 4 урок Logos Programming Basics");
			 break;
		 } 
		 case "сб":{
			 System.out.println(day);
			 System.out.println("Найти приличную работу, но чтоб не связяна с трудом");
			 break;
		 }
		 
		 case "вс":{
			 System.out.println(day);
			 System.out.println("Секс :)");
			 break;
		 }
		 
		 default:
			 System.out.println("Вспомнить бы для начала какой сегодня день...");
			 break;
		 }

	}

}
