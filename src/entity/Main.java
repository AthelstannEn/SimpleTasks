package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static final List<Player> list = new ArrayList<Player>();
 	
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//                 Ім'я Ставка  Лотерея   Код
		list.add(new Player("A", 120, 	Jwin.One, 		45567));
		list.add(new Player("B", 300, 	Jwin.Two, 		00002));
		list.add(new Player("C", 730, 	Jwin.Two, 		10101));
		list.add(new Player("D", 34, 	Jwin.Three, 	94593));
		list.add(new Player("E", 12, 	Jwin.Two, 		49302));
		list.add(new Player("R", 40, 	Jwin.Three, 	23555));
		list.add(new Player("T", 2, 	Jwin.Two, 		55555));
		list.add(new Player("Y", 210, 	Jwin.One, 		00000));
		list.add(new Player("U", 90, 	Jwin.Two, 		12345));
		list.add(new Player("I", 11, 	Jwin.One, 		23403));
		list.add(new Player("O", 93, 	Jwin.Two, 		45000));
		list.add(new Player("P", 111, 	Jwin.One, 		25566));
		list.add(new Player("S", 1, 	Jwin.Two, 		35560));
		list.add(new Player("F", 2, 	Jwin.One, 		95569));
		list.add(new Player("G", 17, 	Jwin.Two, 		15566));
		list.add(new Player("H", 200, 	Jwin.One, 		05567));
		list.add(new Player("J", 200, 	Jwin.One, 		05065));
		list.add(new Player("K", 10, 	Jwin.Two, 		15064));
		list.add(new Player("L", 200, 	Jwin.One, 		49993));
		list.add(new Player("Z", 29, 	Jwin.Two, 		33332));
		list.add(new Player("X", 55, 	Jwin.Three, 	29221));
		list.add(new Player("V", 77, 	Jwin.Two, 		19206));
		list.add(new Player("N", 13, 	Jwin.Three, 	85564));
		list.add(new Player("M", 1200, 	Jwin.Three, 	05020));
		list.add(new Player("Q", 9000, 	Jwin.Three, 	18427));
		list.add(new Player("W", 1110, 	Jwin.One, 		79121));
		Collections.sort(list);
		
		while(true){
			System.out.println("Enter 1 Вибрати Методи Групи 1: Пошук за ім'ям, пошук за ставкою на виграш, пошук за квитком, пошук за кодом ивграшу  ");
			System.out.println("Enter 2 Вибрати Методи Групи 2: Сортування за квитком, сорутвання за ім'ям, сортування за ставкою");
			System.out.println("Enter 3 Вибрати Методи Групи 3: Видалення  гравця, змінна його данних");
			System.out.println("Enter 4 Зіграти в гру");
			System.out.println("Enter 0 EXIT");
			switch (sc.next()) {
			case "1":
				System.out.println("Enter 1 find by Name");
				System.out.println("Enter 2 find by Rate in diapazon");
				System.out.println("Enter 3 find by Win ");
				System.out.println("Enter 4 find by Code in diapazon");
				System.out.println("Enter 0 to Return in Main MENU ");
				switch (sc.next()) {
				case "1":
					findByname();
					break;
				case "2":
					findByRate();			
					break;
				case "3":
					findByWin();
					break;
				case "4":
					findByCode();
					break;
				case "0":	
					break;
				}
				
				break;//ENd of Cae 1 Main MENU
			case "2":
				System.out.println("Enter 1 to sort by Name");
				System.out.println("Enter 2 to sort by Rate ");
				System.out.println("Enter 3 to sort by Code");
				System.out.println("Enter 4 to sort by Win");
				System.out.println("Enter 0 to return in Main MENU");
				switch (sc.next()) {
				case "1":
					list.sort(NameComparator);
					list.forEach(System.out :: println);
					break;
				case "2":
					list.sort(RateComparator);
					list.forEach(System.out :: println);
					break;
				case "3":
					list.sort(CodeComparator);
					list.forEach(System.out :: println);
					break;
				case "4":
					list.sort(WinComparator);
					list.forEach(System.out :: println);
					break;
				case "0":
					break;
				}
				
				
							
				break;//ENd of Case 2 Main Menu
			case "3":
				System.out.println("Enter 1 to delte by Name");
				System.out.println("Enter 2");
				System.out.println("Enter 3 to return in Main MENU");
				switch (sc.next()) {
				case "1":
					delteByName();
					break;
				case "2":
									
					break;
				case "0":
					break;
				}
				
				
				break;//EDn of Case 3 Main Menu
			case "4":
				Game g = new Game();
				g.game();
				break;
			case "0"://Exit of Main Menu STOP Program
				System.out.println("The Program is completed");
			default: sc.close();
				break;
			}//END OF SWITCH
		}//EDN OF WHILE
	}//END OF Main METHOD
	
	//Методи Пошуку ГРУПА 1
	static void findByname(){
		System.out.println("Enter  letter of name: ");
		String name = sc.next();
		for(Player player : list)
			if(player.getName().startsWith(name)){
				System.out.println(player);
			}
		}
		
	
	
	static void findByRate(){
		System.out.println("Enter min Rate: ");
		int min = sc.nextInt();
		System.out.println("Enter max Rate: ");
		int max = sc.nextInt();
		if(min<00000){
			System.out.println("WRONG  MIN DIAPAZON");
		}else if (min >=00000 && max<=99999){
			for(Player player : list){
				if(player.getRate()>min&&player.getRate()<max){
					System.out.println(player);
				}
			}	
			
		}else System.out.println("WRONG MAX DIAPAZON");
	}
	
	static void findByWin(){
		System.out.println("Введіть параметри по яким потрібно знайти гравця: ");
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter Rate - Ставку на виграш");
		int rate= sc.nextInt();
		System.out.println("Enter kode - код вийграшу");
		long kode = sc.nextLong();
		System.out.println("Enter 1 to choise JWIn One");
		System.out.println("Enter 2 to choise Jwin Two");
		System.out.println("Enter 3 to choise Jwin Three");
		if(sc.next()=="1"){
			
			Jwin  win = Jwin.One;
			
			int pos = Collections.binarySearch(list, new Player(name, rate, win,kode));
			if (pos >= 0) {
				System.out.println("finded: "+pos);
			} else {
				System.out.println("no such element");
			}
			
		}else if(sc.next()=="2"){
			
			Jwin win = Jwin.Two;
			
			int pos = Collections.binarySearch(list, new Player(name, rate, win,kode));
			if (pos >= 0) {
				System.out.println("finded: "+pos);
			} else {
				System.out.println("no such element");
			}
		}else if(sc.next()=="3"){
			
			Jwin win = Jwin.Three;
			
			int pos = Collections.binarySearch(list, new Player(name, rate, win,kode));
			if (pos >= 0) {
				System.out.println("finded: "+pos);
			} else {
				System.out.println("no such element");
			}	
			
			
		}else System.out.println("No shus element");
		
	}

	
	
	static void findByCode(){
		System.err.println("  КОД ВИГРАШУ МОЖЕ БУТИ В ДІАПАЗОНІ: ");
		System.err.println("ВІД 00000 до 99999  ");
		System.out.println("Enter of min:  ");
		int min = sc.nextInt();
		System.out.println("Enter of max: ");
		int max = sc.nextInt();
		for(Player player : list){
			if(player.getKode()>min&&player.getKode()<max){
				System.out.println(player);
			}
		}
	}
	//Методи Сортування ГРУПА 2
	public static Comparator<Player> RateComparator = new Comparator<Player>() {
		
		@Override
		public int compare(Player o1, Player o2) {
			return (int) (o1.getRate() -  o2.getRate());
		}
	};
	
	
	public static Comparator<Player> CodeComparator = new Comparator<Player>() {
		
		@Override
		public int compare(Player o1, Player o2) {
			return (int) (o1.getKode() -  o2.getKode());
		}
	};
	
	public static Comparator<Player> NameComparator = new Comparator<Player>() {
		
		@Override
		public int compare(Player o1, Player o2) {
			  return o1.getName().compareTo(o2.getName());
		}
	};
	
	public static Comparator<Player> WinComparator = new Comparator<Player>() {
		
		@Override
		public int compare(Player o1, Player o2) {
			  return o1.getWin().compareTo(o2.getWin());
		}
	};
	
	
	//Операційні Методи ГРУПА 3 
	static void delteByName(){
		
		System.out.println("Enter the First letter of name: ");
		String letter = sc.next();
		Iterator<Player> iter = list.iterator();
		while(iter.hasNext()){
			Player player = iter.next();
			if(player.getName().startsWith(letter)){
				iter.remove();
			}
		}
		list.forEach(System.out::println);
		
	}
	
	
}//END OF Class Main
