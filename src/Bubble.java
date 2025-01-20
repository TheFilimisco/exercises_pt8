//public class Bubble {
//
//    public static void main(String[] args) {
//
//                Scanner input = new Scanner(System.in);
//                int inputNumberLength = input.nextInt();
//                String[] teams = new String[inputNumberLength];
//                int[] enteros = new int[inputNumberLength];
//
//        for (int i = 0; i < teams.length; i++) {
//                    String name = input.next();
//                    int note = input.nextInt();
//                    teams[i] = new Team(name,note);
//                }
//                bubbleSort(teams,teams.length);
//                printArray(teams);
//
//            }
//
//            static void bubbleSort(Team[] arr, int n){
//                int i, j;
//                boolean swapped;
//
//                for (i = 0; i < n - 1; i++) {
//                    swapped = false;
//
//                    for (j = 0; j < n - i - 1; j++) {
////                        if (enteros[j] > enteros[j + 1]) {
////                            int temp = enteros[j];
////                            enteros[j] = enteros[j + 1];
////                            enteros[j + 1] = temp;
////
////                            String temp1 = teams[j];
////                            teams[j] = teams[j + 1];
////                            teams[j + 1] = temp;
//
//
//                            swapped = true;
//                        }
//                    }
//
//                    if (!swapped)
//                        break;
//                }
//            }
//
//            // Function to print an array
//            static void printArray(Team[] arr){
//                for (int i = arr.length-1; i >= 0; i--) {
//                    System.out.println(arr[i].name + " " + arr[i].playersNumber);
//                }
//            }
//
//            public static class Team{
//                private String name;
//                private int playersNumber;
//
//                public Team(String name, int playersNumber) {
//                    this.name = name;
//                    this.playersNumber = playersNumber;
//                }
//
//                public String getName() {
//                    return name;
//                }
//
//                public void setName(String name) {
//                    this.name = name;
//                }
//
//                public int getPlayersNumber() {
//                    return playersNumber;
//                }
//
//                public void setPlayersNumber(int playersNumber) {
//                    this.playersNumber = playersNumber;
//                }
//
//                @Override
//                public String toString() {
//                    return "Team{" +
//                            "name='" + name + '\'' +
//                            ", playersNumber=" + playersNumber +
//                            '}';
//                }
//            }
//        }
//
//    }
//}
