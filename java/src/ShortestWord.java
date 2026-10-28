public class ShortestWord {

    public static String shortestWord(String sentence) {
        String[] words = sentence.split(" ");
        String shortestWord = words[0];

        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        return shortestWord;
    }


}

























//public static void main(String[] args){
//    List<String> list = new ArrayList<>(List.of("a", "b", "c", "d"));
//
//    Iterator<String> it = list.iterator();
//    while (it.hasNext()) {
//        if (it.next().equals("b")) {
//            it.remove();
//        }
//    }
//    System.out.println(list);
//
//
//
//}




////    List<Integer> list = new ArrayList<>();
////    list.add(10);
////    int value = list.get(0);
////    Integer boxed = 7;
////  System.out.println(value + boxed);
////  System.out.println(Integer.parseInt("123") + 1);
//
//    String[] names = {"Ada", "Tunde"};
//    String thirdName = new String[3];
//    for(int i = 0; i < names.lenght; i ++){
//
//    }
//    System.out.println(names.lenght);
//}

//Add a third name to an array that is already full
//write code so that names ends up holding Ada, Tunde and Zainab
//print names. lenght

//delete one item from a list while looping over it.
//        Start from the code below
//inside the loop, call list.remove(s) when s equals "b"
//
//List<String> list = new ArrayList<>(List.of("a", "b", "c", "d"));

//Iterator<String> it = list.iterator();
//while (it.hashNext()) {
//    if (it.next().equals("b")) {
//        it.remove();
//        }
//        }
//System.out.println(list);