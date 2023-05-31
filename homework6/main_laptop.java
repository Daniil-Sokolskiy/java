package homework6;

import java.util.HashSet;
import java.util.Scanner;

public class main_laptop {
    public static void main(String[] args) {
        laptop ASUS_A516JP = new laptop("ASUS", "A516JP", "Windows 11", "Intel Core i7", 16, 512, 15.6);
        laptop Hiper_G16 = new laptop("HIPER", "G16", "Windows 11", "Intel Core i7", "NVIDIA RTX 3070", 16, 512, 16.1);
        laptop Huawei_MateBookD15 = new laptop("Huawei", "MateBook D15", "Windows 11", "Intel Core i5", 16, 256, 15.6);
        laptop MSI_GP66 = new laptop("MSI", "GP66", "Free DOS", "Intel Core i7", "NVIDIA RTX 3070", 16, 512, 15.6);
        laptop MSI_modern_14 = new laptop("MSI", "Modern 14", "Windows 11", "AMD Ryzen 5", 16, 512, 14d);
        laptop MSI_sword = new laptop("MSI", "Sword", "Free DOS", "Intel Core i5", "NVIDIA RTX 3050 TI", 16, 512, 17.3);

        HashSet<laptop> laptops = new HashSet<>();
        laptops.add(ASUS_A516JP);
        laptops.add(Hiper_G16);
        laptops.add(Huawei_MateBookD15);
        laptops.add(MSI_GP66);
        laptops.add(MSI_modern_14);
        laptops.add(MSI_sword);

        System.out.println(
                "Добро пожаловать в наш магазин ноутбуков.\nМы поможем вам выбрать подходящее для вас железо.\n");
        filter_laptops(laptops);

    }

    public static void check_variants(HashSet<laptop> laptops, Integer choose) {
        HashSet<String> variants = new HashSet<>();
        if (choose == 1) {
            for (laptop iterable_element : laptops) {
                variants.add(iterable_element.findBrands());
            }
        }
        if (choose == 2) {
            for (laptop iterable_element : laptops) {
                variants.add(iterable_element.findOSs());
            }
        }
        if (choose == 3) {
            for (laptop iterable_element : laptops) {
                variants.add(iterable_element.findProcessors());
            }
        }
        if (choose == 4) {
            for (laptop iterable_element : laptops) {
                variants.add(iterable_element.findRAMs());
            }
        }
        if (choose == 5) {
            for (laptop iterable_element : laptops) {
                variants.add(iterable_element.findSSDs());
            }
        }
        if (choose == 6) {
            for (laptop iterable_element : laptops) {
                variants.add(iterable_element.findDiagonals());
            }
        }
        if (choose == 7) {
            for (laptop iterable_element : laptops) {
                variants.add(iterable_element.findVideocards());
                variants.remove("Нет");
            }
        }
        System.out.println(variants);
    }

    public static void filter_laptops(HashSet<laptop> laps) {
        Scanner userInput = new Scanner(System.in);
        System.out.println(
                "Choose parametrs for search:\n1 - brand\n2 - Os\n3 - processor\n4 - RAM\n5 - SSD\n6 - diagonal\n7 - videocard");
        int choiceUserSearch = userInput.nextInt();
        check_variants(laps, choiceUserSearch);
        Scanner scannerRequestUserForSearch = new Scanner(System.in);
        System.out.print("Enter your parameter: ");
        String requestUserForSearch = scannerRequestUserForSearch.nextLine();

        if (choiceUserSearch > 7 || choiceUserSearch < 1) {
            System.out.println("Ошибка.\n");
            main(null);
        } else if (choiceUserSearch == 1) {
            for (laptop example : laps) {
                if (example.getBrand().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(example);
                }
            }
        } else if (choiceUserSearch == 2) {
            for (laptop example : laps) {
                if (example.getOS().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(example);
                }
            }
        } else if (choiceUserSearch == 3) {
            for (laptop example : laps) {
                if (example.getProcessor().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(example);
                }
            }
        } else if (choiceUserSearch == 4) {
            for (laptop example : laps) {
                if (example.getRAM().equals(Integer.parseInt(requestUserForSearch))) {
                    System.out.println(example);
                }
            }
        } else if (choiceUserSearch == 5) {
            for (laptop example : laps) {
                if (example.getSSD().equals(Integer.parseInt(requestUserForSearch))) {
                    System.out.println(example);
                }
            }
        } else if (choiceUserSearch == 6) {
            for (laptop example : laps) {
                if (example.getDiagonal().equals(Double.parseDouble(requestUserForSearch))) {
                    System.out.println(example);
                }
            }
        } else if (choiceUserSearch == 7) {
            for (laptop example : laps) {
                if (example.getVideocard().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(example);
                }
            }
        }
        scannerRequestUserForSearch.close();
        userInput.close();
    }
}
