package Collect3;

import java.util.*;
import java.util.stream.*;
public class UsePencil {
	public static void main(String[] args) {
	ArrayList<Pencil> pencils = new ArrayList<>();
	pencils.add(new Pencil(true,15,"red",1.5f));
	pencils.add(new Pencil(false,10,"black",2.5f));
	pencils.add(new Pencil(true,15,"green",2.5f));
	pencils.add(new Pencil(false,10,"yellow",3.5f));
	pencils.add(new Pencil(true,20,"brown",3.5f));
	pencils.add(new Pencil(false,15,"white",2.5f));
	pencils.add(new Pencil(true,25,"grey",1.5f));
	pencils.add(new Pencil(false,15,"violet",2.5f));
	
	//List<Pencil>leads = pencils.stream().filter(x->x.getIsLeadType()==true).collect(Collectors.toList());
	//leads.forEach(x->System.out.println(x));
	
	//List<Character>colors = pencils.stream().map(x->x.getColor().charAt(1)).collect(Collectors.toList());
	//colors.forEach(x->System.out.println(x));
	
	Map<String,Pencil>maps = pencils.stream().collect(Collectors.toMap(i->i.getColor(),j->j));
	//maps.keySet().forEach(x->System.out.println(x));
	//maps.values().forEach(x->System.out.println(x));
	System.out.println(maps);
	
	//Set<String>colors=pencils.stream().map(i->i.getColor()).collect(Collectors.toSet());
	//colors.forEach(x->System.out.println(x));
	}

}
