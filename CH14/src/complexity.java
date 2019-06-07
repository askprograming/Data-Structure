/*public static int[] mystring (int[] list){
    int[] result =new int [2 * list.length];
    for (int i = 0; i < list.length; i++){
        result[2 * i] = list [i] / 2 + list[i] % 2;
        result[2 * i + 1] = list [i] / 2;
    }
    return result;
}


public static void mystery2(int[] list){
    for(int i = 0; i < list.length/2; i++){
        int j = list.length - 1 -i;
        int temp = list[i];            
        int [i] = list[j];
        list[j] = temp;
    }
}

public static void mystery3(List<String> list){
    for(int i = 0; i< list.size() - 1; i += 2){
        String first = list.remove(i);
        list.add(i + 1, first);
    }
}

public static void mystery4(List<String> list){
    for (int i = 0; i < list.size() - 1; i += 2){
        String first = list.get(i);
        list.set(i, list.get(i + 1));
        list.set(i + 1, first);
    }
}
*/