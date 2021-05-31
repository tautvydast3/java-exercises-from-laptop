package house;

import java.util.ArrayList;

public class Main {

	public static final double expensivePrice = 200000.00;

	public static void main(String[] args) {
		ArrayList<House> allHouses = new ArrayList<>();
		ArrayList<House> expensiveHouses = new ArrayList<>();
		ArrayList<House> normalHouses = new ArrayList<>();
		
		ArrayList<House> filteredHouses = new ArrayList<>();
		ArrayList<House> flatHouses = new ArrayList<>();
		ArrayList<House> cottageHouses = new ArrayList<>();
		ArrayList<House> otherHouses = new ArrayList<>();

		House h1 = new House(1, "Naujoji Klevinė", "Naujoji klevinė", "LT - 45628", "Vilnius", HouseEnum.HOUSE.COTTAGE,
				1700.85, true);
		House h2 = new House(2, "Vilnelės skverai", "Užupis", "LT - 45468", "Vilnius", HouseEnum.HOUSE.FLAT, 2468.82,
				false);
		House h3 = new House(3, "Belmonto akacijos", "Belmonto dvaras", "LT - 86628", "Vilnius", HouseEnum.HOUSE.HOUSE,
				1350.85, false);
		House h4 = new House(4, "Raudonieji stogai", "Gerosios vilties žiedas", "LT - 45418", "Vilnius",
				HouseEnum.HOUSE.FLAT, 1700.85, true);
		House h5 = new House(5, "Gedimino pilis", "Senamiestis", "LT - 45621", "Vilnius", HouseEnum.HOUSE.OTHER,
				200000.00, false);

		House h6 = new House(1, "Naujoji Freda", "Žemoji freda", "LT - 44528", "Kaunas", HouseEnum.HOUSE.HOUSE, 2700.85,
				false);
		House h7 = new House(2, "Marvelės skverai", "Linksmadvaris", "LT - 45468", "Kaunas", HouseEnum.HOUSE.COTTAGE,
				2468.82, false);
		House h8 = new House(3, "Šančių beržai", "Šančiai", "LT - 98562", "Kaunas", HouseEnum.HOUSE.HOUSE, 1350.85,
				false);
		House h9 = new House(4, "Žalias kalnas", "Žaliakalnis", "LT - 57418", "Kaunas", HouseEnum.HOUSE.FLAT, 1700.85,
				true);
		House h10 = new House(5, "Kauno pilis", "Senamiestis", "LT - 45621", "Kaunas", HouseEnum.HOUSE.OTHER, 200000.00,
				false);

		House h11 = new House(1, "Senoji šachmatinė", "Basanavičiaus g.", "LT - 45638", "Palanga",
				HouseEnum.HOUSE.COTTAGE, 1700.85, true);
		House h12 = new House(2, "Šventosios kiemai", "Šventoji", "LT - 45958", "Šventoji", HouseEnum.HOUSE.FLAT,
				2468.82, false);
		House h13 = new House(3, "Mogiliovo palmės", "Mogiliovas", "LT - 66628", "Klaipėda", HouseEnum.HOUSE.HOUSE,
				1350.85, false);
		House h14 = new House(4, "Melnragės molai", "Melnragė", "LT - 45788", "Klaipėda", HouseEnum.HOUSE.FLAT, 1700.85,
				true);
		House h15 = new House(5, "Klaipėdos pilis", "Senamiestis", "LT - 45361", "Klaipėda", HouseEnum.HOUSE.OTHER,
				200000.00, false);

		House h16 = new House(1, "Kulai 1", "Kulai", "LT - 45628", "Skuodas", HouseEnum.HOUSE.COTTAGE, 1700.85, true);
		House h17 = new House(2, "Skuodo šešėliai", "Skuodo priemiestis", "LT - 45468", "Skuodas", HouseEnum.HOUSE.FLAT,
				2468.82, false);
		House h18 = new House(3, "Kulai 2", "Bartuvos tvenkinys", "LT - 86628", "Skuodas", HouseEnum.HOUSE.HOUSE,
				1350.85, false);
		House h19 = new House(4, "Samanų kilimai", "Gurstiškė", "LT - 45418", "Skuodas", HouseEnum.HOUSE.FLAT, 1700.85,
				true);
		House h20 = new House(5, "Kartonkiemis", "Kanyzėlis", "LT - 45621", "Skuodas", HouseEnum.HOUSE.OTHER, 200000.00,
				false);

		allHouses.add(h1);
		allHouses.add(h2);
		allHouses.add(h3);
		allHouses.add(h4);
		allHouses.add(h5);
		allHouses.add(h6);
		allHouses.add(h7);
		allHouses.add(h8);
		allHouses.add(h9);
		allHouses.add(h10);
		allHouses.add(h11);
		allHouses.add(h12);
		allHouses.add(h13);
		allHouses.add(h14);
		allHouses.add(h15);
		allHouses.add(h16);
		allHouses.add(h17);
		allHouses.add(h18);
		allHouses.add(h19);
		allHouses.add(h20);

		// House.display(allHouses);
		// House.displaySort(allHouses);
		// House.displayExpensive(allHouses);
		// House.displayNormal(normalHouses);

		// Ciklas namu rusiavimui i brangesnius ir pigesnius
		
		for (House i : allHouses) {
			if (i.price >= expensivePrice) {
				expensiveHouses.add(i);
			} else {
				normalHouses.add(i);
			}
		}
		
//		for (House i: normalHouses) {
//			System.out.println(i.title);
//		}
		
		// Ciklas namu rusiavimui pagal tipa
		
		
			for(House i: allHouses) {
			switch(i.type) {
			case HouseEnum.HOUSE.HOUSE:
				filteredHouses.add(i);
				break;
				
			case HouseEnum.HOUSE.FLAT:
				flatHouses.add(i);
				break;
				
			case HouseEnum.HOUSE.COTTAGE:
				cottageHouses.add(i);
				break;
				
			case HouseEnum.HOUSE.OTHER:
				otherHouses.add(i);
				break;
			
			}
			
			}
		}
		
	

}
