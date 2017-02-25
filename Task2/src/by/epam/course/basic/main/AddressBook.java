package by.epam.course.basic.main;



public class AddressBook {

	private PersonalCard[] cards;
	private int countCards;

	public AddressBook() {
		
	}
	
	public int getCountCards() {
		return countCards;
	}

	private void setCountCards(int countCards) {
		this.countCards = countCards;
	}
	
	// добавление записи
	public void addPersonalCard(String name, String phoneNumber, String birthDay){
		this.setCountCards(this.getCountCards()+1);
		PersonalCard[] tempCards = new PersonalCard[this.getCountCards()];
		if (this.getCountCards() >= 1){
			for (int i = 0; i < this.getCountCards()-1;i++){
				tempCards[i]=cards[i];
			}
			tempCards[this.getCountCards()-1]= new PersonalCard(name, phoneNumber, birthDay);
			cards = tempCards;
		} else {
			cards = tempCards;
		}
	}
	
	// пойска записи по какому-било признаку (например, по фамилии, дате рождения или номеру телефона)
	public void findPersonalCardByName(String Name){
		if (this.getCountCards() < 1){
			System.out.println("There is no cards in the address book");
		} else {
			for (PersonalCard card : this.cards){
				if (card.getName().equals(Name)){
					card.showCardInfo();
				}
			}	
		}
	}
	
	public void findPersonalCardByPhoneNumber(String number){
		if (this.getCountCards() < 1){
			System.out.println("There is no cards in the address book");
		} else {
			for (PersonalCard card : this.cards){
				if (card.getNumber().equals(number)){
					card.showCardInfo();
				}
			}	
		}
	}
	
	public void findPersonalCardByBirthDay(String bitrhDay){
		if (this.getCountCards() < 1){
			System.out.println("There is no cards in the address book");
		} else {
			for (PersonalCard card : this.cards){
				if (card.getBirthday().equals(bitrhDay)){
					card.showCardInfo();
				}
			}
		}
	}
	
	public void showAllCards(){
		if (this.getCountCards() < 1){
			System.out.println("There is no cards in the address book");
		} else {
			for (PersonalCard card : this.cards){
				card.showCardInfo();
				System.out.println();
			}
		}
		
	}
	
	// удаление записи
	
	public void deletePersonalCard(int userInput){
		this.cards[userInput-1]=null;
		if (this.getCountCards() <= 1){
			this.cards=null;
			this.setCountCards(0);
		} else {
			PersonalCard[] tempCards = new PersonalCard[this.getCountCards()-1];
			if (this.getCountCards() > 1){
				int index = 0;
				for (int i = 0; i < this.getCountCards();i++){
					if (cards[i] != null){
						tempCards[index]=cards[i];
						index++;
					}
				}
				cards = tempCards;
			} else {
				cards = null;
			}
			this.setCountCards(this.getCountCards()-1);
		}
		
	}
	
	public PersonalCard getCard(int i){
		if (this.getCountCards() < 1){
			System.out.println("There is no cards in the address book");
			return null;
		} else {			
			return this.cards[i];
		}
	}
}
