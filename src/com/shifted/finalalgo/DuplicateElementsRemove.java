package com.shifted.finalalgo;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsRemove {

    public static void main(String[] args) {

        int num[] = {1,2,3,4,4,5,6,7,7};

        String names[] = {"alam","ahonaf","prioty","prioty"};

      //  duplicatNum(num);

       // duplicateString(names);

        duplicatteString(names);
    }

    public static void duplicatNum(int num[]){

        for(int i = 0; i <= num.length - 1; i++){

            for(int j = i + 1; j <= num.length - 1; j++){

                if(num[i] == num[j]){

                    System.out.println(num[i]);
                }
            }
        }

        return ;
    }



    public static void duplicateString(String names[]){

        for(int i = 0; i <= names.length - 1; i++){

            for(int j = i + 1; j <= names.length - 1; j++ ){

                if(names[i].equals(names[j])){

                    System.out.println(names[i]);
                }
            }
        }

        return;
    }

    public static void duplicatteString(String names[]){

        Set<String> store = new HashSet<>();

        for(String name: names){

            if(store.add(name) == false){

                System.out.println(name);
            }
        }

        return;
    }


}
