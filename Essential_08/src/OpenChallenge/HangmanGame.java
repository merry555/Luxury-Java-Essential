package OpenChallenge;

import java.util.*;
import java.io.*;
import java.nio.CharBuffer;

public class HangmanGame {
   StringBuffer hiddenWord; // 숨긴 글자를 가진 단어
   String newWord; // 게임을 위해 선정된 단어
   Scanner scanner; // 키 입력
   int failCount; // 틀린 횟수
   
   public HangmanGame() { 
      scanner = new Scanner(System.in);
   }
   
   public void GameStart() throws IOException {
      System.out.println("지금부터 행맨게임을 시작하겠습니다.");
      Words words = new Words("words.txt");
      //words.p();
      while(true) {
         newWord = words.RandomWord();//랜덤단어를 newWord에 저장
         if(newWord == null) break;
      
         makeHiddenWord();//-들어간 단어 만들기
         Count();//글자 맞추기 및 횟수 세기
         System.out.println("Nest(y/n)");
         String answer = scanner.next();
         if(answer.equals("n")) break;
      }
   }
   
   public void makeHiddenWord() {
      hiddenWord = new StringBuffer(newWord); //hideenWord에 선택된 단어 받기
      Random r = new Random();
      
      for(int i=0; i<2; i++) {
         int index = r.nextInt(newWord.length());
         char c = newWord.charAt(index);
         for(int m=0; m<newWord.length(); m++) {
            if(hiddenWord.charAt(m)==c)
               hiddenWord.setCharAt(m, '_');
         }
      }      
    }
   
   void Count() {//틀린횟수
      failCount = 0;
      char key;
      do {
         if(failCount == 5) break;
         System.out.println(hiddenWord);
         System.out.print(">>");
         String letter = scanner.next();
          key = letter.charAt(0);// letter에 입력된 글자 저장
      }while(!Complete(key));//정답일때 구문중단
      System.out.println(newWord);//정답출력
   }
   
   boolean Complete(char key) {
      boolean correct = false;
      for(int i=0; i<newWord.length(); i++) {
         if(newWord.charAt(i)==key && hiddenWord.charAt(i) == '_') {
            hiddenWord.setCharAt(i, key);//- 를 정답으로 교체
            correct = true;
         }      
      }
      if(!correct) failCount++;
      for(int k=0; k<newWord.length(); k++) {
         if(hiddenWord.charAt(k)=='_') {return false;}
      }
      return true;
   }
      
   public static void main(String [] args) throws IOException {
      new HangmanGame().GameStart();
   }
}

class Words {
   Vector<String> lines = new Vector <String>();
   final int WORDMAX = 25143;
   private Random r = new Random();
   FileReader fin;
   BufferedReader in = null;
   
   Words(String fileName) {      
      try{
          in = new BufferedReader(new FileReader(fileName));     
          for(int i=0; i<WORDMAX;i++) {
               String li = in.readLine();
               lines.add(i, li);  
            }
      }catch(IOException e) {
         System.out.println("파일을 찾을 수 없습니다.");
         System.exit(0);//v프로그램 종료
      }
   }
   // 이 메소드는 벡터에 들어있는 인자를 출력해보는 벡터, 메소드 호출은 메인 클래스에서 한다.
   public void p() {
      for(int i=0; i<lines.size(); i++) {
         System.out.println(i+lines.get(i));
      }
   }
   
   
   public String RandomWord() throws IOException {
	  int n = r.nextInt(WORDMAX);
      System.out.println(n);
      return lines.get(n);
   }
}