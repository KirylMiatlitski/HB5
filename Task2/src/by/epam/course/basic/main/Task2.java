package by.epam.course.basic.main;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Kiryl_Miatlitski
 * 
 * data: 25 February 2017
 * 
 *  Task: —оздать класс У«аписна€ книжкаФ. ѕредусмотреть возможность работы с произвольным числом записей, пойска 
 *  записи по какому-било признаку (например, по фамилии, дате рождени€ или номеру телефона), добавлени€ и удалени€ 
 *  записей, ортировки по разным пол€м.
 */
public class Task2 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		AddressBook book = new AddressBook();
		Random random = new Random();
		String temp = ""; // temp input 
		
		do {
			
			System.out.println("1. Add random card");
			System.out.println("2. Add card manually");
			System.out.println("3. Find the card by name");
			System.out.println("4. Find the card by phone number");
			System.out.println("5. Find the card by bithday");
			System.out.println("6. Delete a card");
			System.out.println("7. Show all cards from the address book");
			System.out.println("8. Exit from the application");
			
			if (sc.hasNextInt()){
				userInput = sc.nextInt();
			} else {
				
				sc.nextInt();
				userInput = 0;
			}
			
			
			switch (userInput){
			case 1: 
				book.addPersonalCard("Name"+random.nextInt(30), 
									 random.nextInt(100000000)+"", 
									 random.nextInt(30)+" "+random.nextInt(12)+" 198"+random.nextInt(9));
				break;
			case 2:
				System.out.print("Input Name: ");
				String name = sc.next();
				System.out.print("Input phone number: ");
				String number = sc.next();
				System.out.print("Input bitrh day: ");
				String birthDay = sc.next();
				
				book.addPersonalCard(name, number, birthDay);
				break;
			case 3:
				System.out.print("Input name for the search: ");
				temp = sc.next();
				book.findPersonalCardByName(temp);
				break;
			case 4:
				System.out.print("Input phone number for the search: ");
				temp = sc.next();
				book.findPersonalCardByPhoneNumber(temp);
				break;
			case 5:
				System.out.print("Input day for the search: ");
				temp = sc.next();
				book.findPersonalCardByBirthDay(temp);
				break;
			case 6:
				int choise = 0;
				if (book.getCountCards() < 1){
					System.out.println("There is no cards in the address book ");
					break;
				}
				System.out.println("Which card would you like to delete? Specify the # from the list below.");
				for (int i = 1; i < book.getCountCards()+1;i++){
					
					System.out.print(i+". ");
					book.getCard(i-1).showCardInfo();			
				}
				if (sc.hasNextInt()){
					choise = sc.nextInt();
				} else {
					System.out.println("You selected wrong wrong id. Please try again. Sorry");
					sc.hasNext();
					break;
				}		
				if ((choise > book.getCountCards()) | (book.getCountCards() < 0)){
					System.out.println("There is no cards in the address book ");
					break;
				}
				book.deletePersonalCard(choise);
				break;
			case 7: 
				book.showAllCards();
				break;
			case 8: 
				return;
			default:
				System.out.println("Specify the number from the list above");					
			}
				
		} while (userInput != 8);
		
	}

}
