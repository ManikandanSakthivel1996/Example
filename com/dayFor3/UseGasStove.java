package com.dayFor3;

public class UseGasStove {
	public static void main(String[] args) {
		String[] a = args[0].split("@");
		String[] b = args[1].split("@");
		String[] c = args[2].split("@");
		
		GasStove gas1 = new GasStove();
		gas1.brand = a[0];
		gas1.price = Integer.parseInt(a[1]);
		gas1.color = a[2];
		gas1.disAmount =Integer.parseInt(a[3]);
		gas1.netprice = gas1.price-gas1.disAmount;
		
		GasStove gas2 = new GasStove();
		gas2.brand = b[0];
		gas2.price = Integer.parseInt(b[1]);
		gas2.color = b[2];
		gas2.disAmount =Integer.parseInt(b[3]);
		gas2.netprice = gas2.price-gas2.disAmount;
		
		GasStove gas3 = new GasStove();
		gas3.brand = c[0];
		gas3.price = Integer.parseInt(c[1]);
		gas3.color = c[2];
		gas3.disAmount =Integer.parseInt(c[3]);
		gas3.netprice = gas3.price-gas3.disAmount;
		
		GasStove[] GasStoves = {gas1,gas2,gas3};
		for(int i=0;i<GasStoves.length;i++) {
			System.out.println(GasStoves[i].brand+" "+GasStoves[i].price+" "+GasStoves[i].color+" "+GasStoves[i].disAmount+" "+GasStoves[i].netprice);
			}
		
		}
}
