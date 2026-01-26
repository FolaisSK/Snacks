import java.util.Arrays;
import java.util.Scanner;

public class MBTI{


	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		int counterForA = 0;
		int counterForB = 0;
		String userAnswer = "";
		String[][] selectedAnswers = new String[4][5];
		int[][] selectedOptions = new int[4][2];



		System.out.println("What is your name:");
		String name = input.nextLine();

		for(int counter = 0; counter < 4; counter++){

			for(int count = 0; count < 5; count++){

		

				while(userAnswer.equalsIgnoreCase("A") == false || userAnswer.equalsIgnoreCase("B") == false){

					System.out.printf("A.%s		B.", getAllQuestions()[counter][count][0]);
					System.out.println(getAllQuestions()[counter][count][1]);

			
					System.out.print("Enter A or B: ");
					userAnswer = input.nextLine().toUpperCase();

					if(userAnswer.equals("A")){

						selectedAnswers[counter][count] = userAnswer + ". " + getAllQuestions()[counter][count][0];
						selectedOptions[counter][0] =  ++counterForA;
						break;

					}else if(userAnswer.equals("B")){

						selectedAnswers[counter][count] = userAnswer + ". " + getAllQuestions()[counter][count][0];
						selectedOptions[counter][1] =  ++counterForB;
						break;

					}else{

						System.out.printf("Expected A or B as Response\nI know this is an error, please try again\n");

					}

				}
			

			}
		
				counterForA = 0;
				counterForB = 0;

		}


		getSelectedAnswers(name, selectedAnswers, selectedOptions);

		String personalityType = getPersonalityType(selectedOptions);
		System.out.printf("PERSONALITY TYPE: %s%n%n", personalityType);

		getPersonalityDescription(personalityType);


	}



	public static String getPersonalityType(int[][] selectedOptions){

		String personality = "";
		String[] personalityA = {"E", "S", "T", "J"};
		String[] personalityB = {"I", "N", "F", "P"};

		for(int count = 0; count < selectedOptions.length; count++){

			if(selectedOptions[count][0] > selectedOptions[count][1]){

				personality += personalityA[count];

			}else{

				personality += personalityB[count];
			}

		}
			
		return personality;

	}



	public static void getSelectedAnswers(String name, String[][] selectedAnswers, int[][] selectedOptions){

		System.out.printf("%nHello %s you selected%n", name);
		for(int count = 0; count < selectedAnswers.length; count++){

			for(int index = 0; index < selectedAnswers[0].length; index++){

				System.out.println(selectedAnswers[count][index]);

			}

			System.out.println("Number of A selected: " + selectedOptions[count][0]);
			System.out.println("Number of B selected: " + selectedOptions[count][1]);
			System.out.println();

		}

	}



	public static String[][] questionsForExtrovertedVsIntroverted(){

		String[][] questions = {
			{"expend energy, enjoy groups", "conserve energy, enjoy one-on-one"},
			{"more outgoing, think out loud", "more reserved, think to yourself"},
			{"seek many tasks, public activities, interaction with others", "seek private, solitary activities with quiet to concentrate"},
			{"external, communicative, express yourself", "internal, reticent, keep to yourself"},
			{"active, initiate", "reflective, deliberate"}
		};


		return questions;

	}


	public static String[][] questionsForSensingVsIntuitive(){

		String[][] questions = {
			{"Interpret literally", "look for meaning and possibilities"},
			{"practical, realistic, experiential", "imaginative, innovative, theoretical"},
			{"standard, usual, conventional", "different, novel, unique"},
			{"focus on here-and-now", "look to the future, global perspective, big picture"},
			{"facts, things, what is", "ides, dreams, what could be, philosophical"}
		};

		return questions;

	}


	public static String[][] questionsForThinkingVsFeeling(){

		String[][] questions = {
			{"logical, thinking, questioning", "empathetic, feeling, accommodating"},
			{"candid, straightforward, frank", "tactful, kind, encouraging"},
			{"firm, tend to criticize, hold the line", "gentle, tend to appreciate, conciliate"},
			{"tough-minded, just", "tender-hearted, merciful"},
			{"matter of fact, issue-oriented", "sensitive, people-oriented, compassionate"}
		};

		return questions;

	}


	public static String[][] questionsForJudgingVsPerspective(){

		String[][] questions = {	
			{"organized, orderly", "flexible, adaptable"},
			{"plan, schedule", "unplanned, spontaneous"},
			{"regulated, structured", "easy-going, live and let live"},
			{"preparation, plan ahead", "go with the flow, adapt as you go"},
			{"control, govern", "latitude, freedom"}
		};

		return questions;

	}


	public static String[][][] getAllQuestions(){

		String[][][] completeQuestions = new String[4][5][2];

		completeQuestions[0] = questionsForExtrovertedVsIntroverted();
		completeQuestions[1] = questionsForSensingVsIntuitive();
		completeQuestions[2] = questionsForThinkingVsFeeling();
		completeQuestions[3] = questionsForJudgingVsPerspective();

		return completeQuestions;

	}


	public static void getPersonalityDescription(String personalityType){

		if(personalityType.equals("INTJ")){

			System.out.println("ARCHITECT");
			System.out.println("People with the INTJ personality type (Architects) are intellectually curious individuals with a deep-seated thirst for knowledge. INTJs tend to value creative ingenuity, straightforward rationality, and self-improvement. They consistently work toward enhancing intellectual abilities and are often driven by an intense desire to master any and every topic that piques their interest.");

		}else if(personalityType.equals("INTP")){

			System.out.println("LOGICIAN");
			System.out.println("People with the INTP personality type (Logicians) pride themselves on their unique perspective and vigorous intellect. They can’t help but puzzle over the mysteries of the universe – which may explain why some of the most influential philosophers and scientists of all time have been INTPs. People with this personality type tend to prefer solitude, as they can easily become immersed in their thoughts when they are left to their own devices. They are also incredibly creative and inventive, and they are not afraid to express their novel ways of thinking or to stand out from the crowd.");

		}else if(personalityType.equals("ENTJ")){

			System.out.println("COMMANDER");
			System.out.println("People with the ENTJ personality type (Commanders) are natural-born leaders. Embodying the gifts of charisma and confidence, ENTJs project authority in a way that draws crowds together behind a common goal. However, these personalities are also characterized by an often ruthless level of rationality, using their drive, determination, and sharp mind to achieve whatever objectives they’ve set for themselves. Their intensity might sometimes rub people the wrong way, but ultimately, ENTJs take pride in both their work ethic and their impressive level of self-discipline.");

		}else if(personalityType.equals("ENTP")){

			System.out.println("DEBATER");
			System.out.println("Quick-witted and audacious, people with the ENTP personality type (Debaters) aren’t afraid to disagree with the status quo. In fact, they’re not afraid to disagree with pretty much anything or anyone. Few things light up these personalities more than a bit of verbal sparring – and if the conversation veers into controversial terrain, so much the better.");

		}else if(personalityType.equals("INFJ")){

			System.out.println("ADVOCATE");
			System.out.println("Idealistic and principled, people with the INFJ personality type (Advocates) aren’t content to coast through life – they want to stand up and make a difference. For these compassionate personalities, success doesn’t come from money or status but from seeking fulfillment, helping others, and being a force for good in the world.");

		}else if(personalityType.equals("INFP")){

			System.out.println("MEDIATOR");
			System.out.println("Although they may seem quiet or unassuming, people with the INFP personality type (Mediators) have vibrant, passionate inner lives. Creative and imaginative, they happily lose themselves in daydreams, inventing all sorts of stories and conversations in their mind. INFPs are known for their sensitivity – these personalities can have profound emotional responses to music, art, nature, and the people around them. They are known to be extremely sentimental and nostalgic, often holding onto special keepsakes and memorabilia that brighten their days and fill their heart with joy.");

		}else if(personalityType.equals("ENFJ")){

			System.out.println("PROTAGONIST");
			System.out.println("People with the ENFJ personality type (Protagonists) feel called to serve a greater purpose in life. Thoughtful and idealistic, ENFJs strive to have a positive impact on other people and the world around them. These personalities rarely shy away from an opportunity to do the right thing, even when doing so is far from easy.");

		}else if(personalityType.equals("ENFP")){

			System.out.println("CAMPAIGNER");
			System.out.println("People with the ENFP personality type (Campaigners) are true free spirits – outgoing, openhearted, and open-minded. With their lively, upbeat approach to life, ENFPs stand out in any crowd. But even though they can be the life of the party, they don’t just care about having a good time. These personalities have profound depths that are fueled by their intense desire for meaningful, emotional connections with others.");

		}else if(personalityType.equals("ISTJ")){

			System.out.println("LOGISTICIAN");
			System.out.println("People with the ISTJ personality type (Logisticians) mean what they say and say what they mean, and when they commit to doing something, they make sure to follow through. With their responsible and dependable nature, it might not be so surprising that ISTJ personalities also tend to have a deep respect for structure and tradition. They are often drawn to organizations, workplaces, and educational settings that offer clear hierarchies and expectations.");

		}else if(personalityType.equals("ISFJ")){

			System.out.println("DEFENDER");
			System.out.println("In their unassuming, understated way, people with the ISFJ personality type (Defenders) help make the world go round. Hardworking and devoted, these personalities feel a deep sense of responsibility to those around them. ISFJs can be counted on to meet deadlines, remember birthdays and special occasions, uphold traditions, and shower their loved ones with gestures of care and support. But they rarely demand recognition for all that they do, preferring instead to operate behind the scenes.");

		}else if(personalityType.equals("ESTJ")){

			System.out.println("EXECUTIVE");
			System.out.println("People with the ESTJ personality type (Executives) are representatives of tradition and order, utilizing their understanding of what is right, wrong, and socially acceptable to bring families and communities together. Embracing the values of honesty and dedication, ESTJs are valued for their mentorship mindset and their ability to create and follow through on plans in a diligent and efficient manner. They will happily lead the way on difficult paths, and they won’t give up when things become stressful.");

		}else if(personalityType.equals("ESFJ")){

			System.out.println("CONSUL");
			System.out.println("For people with the ESFJ personality type (Consuls), life is sweetest when it’s shared with others. These social individuals form the bedrock of many communities, opening their homes – and their hearts – to friends, loved ones, and neighbours.");

		}else if(personalityType.equals("ISTP")){

			System.out.println("VIRTUOSO");
			System.out.println("People with the ISTP personality type (Virtuosos) love to explore with their hands and their eyes, touching and examining the world around them with an impressive diligence, a casual curiosity, and a healthy dose of skepticism. They are natural makers, moving from project to project, building the useful and the superfluous for the fun of it and learning from their environment as they go. They find no greater joy than in getting their hands dirty pulling things apart and putting them back together, leaving them just a little bit better than they were before.");

		}else if(personalityType.equals("ISFP")){

			System.out.println("ADVENTURER");
			System.out.println("People with the ISFP personality type (Adventurers) are true artists – although not necessarily in the conventional sense. For these types, life itself is a canvas for self-expression. From what they wear to how they spend their free time, they act in ways that vividly reflect who they are as unique individuals. With their exploratory spirit and their ability to find joy in everyday life, ISFPs can be among the most interesting people you’ll ever meet.");

		}else if(personalityType.equals("ESTP")){

			System.out.println("ENTREPRENEUR");
			System.out.println("People with the ESTP personality type (Entrepreneurs) are vibrant individuals brimming with an enthusiastic and spontaneous energy. They tend to be on the competitive side, often assuming that a competitive mindset is a necessity in order to achieve success in life. With their driven, action-oriented attitudes, they rarely waste time thinking about the past. In fact, they excel at keeping their attention rooted in their present – so much so that they rarely find themselves fixated on the time throughout the day.");

		}else if(personalityType.equals("ESFP")){

			System.out.println("ENTERTAINER");
			System.out.println("If anyone is to be found spontaneously breaking into song and dance, it is people with the ESFP personality type (Entertainers). They get caught up in the excitement of the moment and want everyone else to feel that way too. No other type is as generous with their time and energy when it comes to encouraging others, and no other type does it with such irresistible style.");

		}else{

			System.out.println("Personality Type not in data.");
		}

	}


}