class FurnitureApp{
    public static void main(String []args){

        furnitures.bedroom.Bed bed=new furnitures.bedroom.Bed(); 
		furnitures.livingroom.Chair chair = new furnitures.livingroom.Chair();
		furnitures.livingroom.Table table = new furnitures.livingroom.Table();
		furnitures.office.Chair officechair = new furnitures.office.Chair();
		furnitures.office.Table officetable = new furnitures.office.Table();
		
		
        System.out.println("The price bed : " + bed.price());
		System.out.println("The price living room chair : " + chair.price());
		System.out.println("The price living room table : " + table.price());
		System.out.println("The price office chair : " + officechair.price());
		System.out.println("The price office table : " + officetable.price());
    }
} 