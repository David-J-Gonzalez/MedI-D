 String aller = "";
        System.out.printf("Do you have unlisted allergy?, 'Allergy-Severity-Reaction': ");
        if (sc.next().toLowerCase().equals("yes")) {
            aller = sc.nextLine();
            while (true) {
                System.out.printf("Do you have unlisted allergy?, 'Allergy-Severity-Reaction': ");
                if (sc.next().toLowerCase().equals("yes")) {
                    aller += sc.nextLine();
                } else {
                    break;
                }
            }
            return aller;
        } else return "none";
        
