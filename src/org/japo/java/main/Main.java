/* 
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    //public static final Random RND = new Random();

    public static void main(String[] args) {

         Date d = new Date();
         
         //d.getTime();
         
         System.out.println("Tiempo UNIX.........: " + d.getTime());
         
         
         //long tiempo = System.currentTimeMillis(); es igual que el getTime
         
        // utilizamos con long BD, Array, coleeción, porque hay que guardarlo. 
         
      // long tiempo = new Date().getTime();   // Printf("Tiempo UNIX.....:%d%n", timepo);
     // Date d;    
     //    long tiempo2;
     //tiempo2 = d.getTIme();
         
         
         
         
        
    }
    
    
    

}
