package me.rotzloch.Classes;

import org.bukkit.ChatColor;

public class Text {
	//Allgemein
	public static String NoPermission = ChatColor.RED + "Keine Berechtigung f�r diesen Befehl!";
	public static String Error = "Fehler";
	
	//Reward
	public static String RewardLock = "Diese Belohnung ist f�r dich noch gesperrt";
	public static String RewardCreated = "Reward erstellt";	
	public static String RewardHelp(){
		String help = "�4Korrekte Anwendung:\n";
		help +="�d[Reward]\n";
		help +="�dItemId-Amount\n";
		help +="�dZeit in Sekunden\n";
		help += "�dx y z\n";
		
		return help;
	}
	
	//Land Texte
	public static String LandCanNotBuyYourLand = "Du kannst deine eigenen Grundst�cke nicht kaufen.";
	public static String LandMobsSpawn = "Mobs k�nnen nun spawnen";
	public static String LandMobsNotSpawn = "Mobs k�nnen nun nicht spawnen";
	public static String LandMembers = "Mitglieder: ";
	public static String LandOwners = "Besitzer: ";
	public static String LandGS = "Grundst�ck ";
	
	public static String LandNotEnoughMoney(double buyPrice){
		String text = "Dieses Grundst�ck ist zu teuer f�r dich\n";
		text += "Es kostet: " + buyPrice + "\n";
		
		return text;
	}
	public static String LandBuyed(String regionName, double buyPrice){
		String text = "'" + regionName+ "' erfolgreich gekauft.\n";
		text += String.format(" %s %s wurden deinem Konto abgezogen!", buyPrice, Helper.GetCurrency());
		
		return text;
	}
	public static String LandSelled(String regionName, double sellPrice){
		String text = "'" + regionName+ "' erfolgreich verkauft.\n";
		text += String.format(" %s %s wurden deinem Konto gutgeschrieben!", sellPrice, Helper.GetCurrency());
		
		return text;
	}
	public static String LandBuyWithSign(String regionName, String buyername){
		return "Grundst�ck '" + regionName + "' wurde von '"+buyername+"' gekauft.";
	}
	public static String LandAddMember(String regionName, String playerName){
		return "Spieler '" + playerName + "' dem Grundst�ck '" + regionName + "' hinzugef�gt.";
	}
	public static String LandRemoveMember(String regionName, String playerName){
		return "Spieler '" + playerName + "' vom Grundst�ck '" + regionName + "' entfernt.";
	}
	public static String LandLock(String regionName){
		return "Grundst�ck '" + regionName + "' wurde gesperrt.";
	}
	public static String LandUnlock(String regionName){
		return "Grundst�ck '" + regionName + "' wurde entsperrt.";
	}
	public static String LandGSList(String playerName){
		String text = "Folgende GS besitzt "+playerName+":\n";
		text += "-----------------------";
		
		return text;
	}
	public static String LandSellBySign(String regionName, String playerName){
		return "Grundst�ck '" + regionName + "' wird von '"+playerName+"' zum Verkauf angeboten.";
	}
	public static String LandCanSell(double sellPrice){
		return String.format("Du kannst es verkaufen f�r %s %s", sellPrice, Helper.GetCurrency());
	}
	public static String LandCanBuy(String regionName, double buyPrice){
		String text = "Grundst�ck '"+ regionName + "' geh�rt niemandem.\n";
		text += String.format("Du kannst es kaufen f�r %s %s!", buyPrice, Helper.GetCurrency());
		
		return text;
	}
	public static String LandTax(double price){
		return String.format("Grundst�cksteuer von %s %s abgezogen.", price, Helper.GetCurrency());
	}
	public static String LandHelp(){
		String help = ChatColor.GOLD + "MaRo-Craft Land Help (/land help): \n";
		help += ChatColor.YELLOW + "-------------\n";
		help += ChatColor.GREEN + "/land buy -> GS kaufen.\n";
		help += "/land sell -> GS verkaufen.\n";
		help += "/land add <Playername> -> Spieler als Member hinzuf�gen.\n";
		help += "/land remove <Playername> -> Spieler als Member entfernen.\n";
		help += "/land lock -> GS Sperren (T�ren, Kn�pfe, Schalter).\n";
		help += "/land unlock -> GS Entsperren.\n";
		help += "/land mobs <true/false> -> Mob-Spawning On/Off\n";
		help += "/land list -> Zeigt eine Liste deiner Grundst�cke an.\n";
		help += "/land list <playername> -> Zeigt eine Liste der Grundst�cke von <playername> an.\n";
		help += "/land info -> GS Information.\n";
		
		return help;
	}

	//Farmonator Texte
	public static String FarmNameAllreadyExist = ChatColor.GREEN+ "[Farmonator] Dieser Name existiert bereits!";
	public static String FarmOverrideExistingFarm = ChatColor.GREEN + "[Farmonator] Deine Farm �berschneidet eine bestehende Farm!";
	public static String FarmFailedToSave = ChatColor.RED + "[Farmonator] Beim Speichern ist ein Fehler aufgetreten!";
	public static String FarmNotYours = ChatColor.GREEN + "[Farmonator] Diese Farm geh�rt nicht dir.";
	public static String FarmNotExist = ChatColor.GREEN + "[Farmonator] Diese Farm existiert nicht.";
	public static String FarmList = ChatColor.GREEN + "[Farmonator] FarmArea List: \n####################";
	
	public static String FarmChestNotFound(String x, String y, String z){
		return ChatColor.RED + "[Farmonator] An der Position " + x + "," + y + "," + z + " (x,y,z) wurde keine Kiste gefunden!";
	}
	public static String FarmSaved(String id){
		return ChatColor.GREEN + "[Farmonator] Farm '"+id+"' wurde gespeichert!";
	}
	public static String FarmRemoved(String id){
		return ChatColor.GREEN + "[Farmonator] Farm '"+id+"' wurde entfernt!";
	}
	public static String FarmHelp(){
		String help = ChatColor.GOLD + "MaRo-Craft Farmonator Help: (/farm help): \n";
		help += ChatColor.YELLOW + "-------------\n";
		help += ChatColor.GREEN + "Neue Farmarea hinzuf�gen. WorldEdit Selection ist notwendig: \n";
		help += "/farm add <FarmAreaID> <chestX> <chestY> <chestZ>\n";
		help += ChatColor.GOLD + "Farmarea �ndern. WorldEdit Selection ist notwendig: \n";
		help += "/farm changeArea <areaID>\n";
		help += ChatColor.GREEN + "Zugewiesene Truhe �ndern: \n";
		help += "/farm changeChest <areaID> <chestX> <chestY> <chestZ>\n";
		help += ChatColor.GOLD + "Item Typ f�r FarmArea setzen:\n";
		help += "/farm changeItem <areaID> <ItemID>\n";
		help += ChatColor.GREEN + "FarmArea entfernen: \n";
		help += "/farm remove <areaID>\n";
		help += ChatColor.GOLD + "Eigene FarmAreas auflisten: \n";
		help += "/farm list\n";
		
		return help;
	}
}
