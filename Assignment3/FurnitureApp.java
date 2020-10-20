import in.dhanasekar.data.*; //check this package for unqualified class names.
import com.javapeople.data.Tree;
import in.dhanasekar.furnitures.bedroom.Bed;

class FurnitureApp{
    public static void main(String []args){

            List list=new List();
            System.out.println(list);
            list.add();
			
			com.javapeople.data.List lst = new com.javapeople.data.List();
			System.out.println(lst);
			
            Tree tree=new Tree();
            System.out.println(tree); 
			
			in.dhanasekar.data.Table dttable = new in.dhanasekar.data.Table();
			System.out.println(dttable); 
			
			Bed bed = new Bed();
			System.out.println(bed);
			
			in.dhanasekar.furnitures.livingroom.Chair lvchair = new in.dhanasekar.furnitures.livingroom.Chair();
			System.out.println(lvchair);
			
			in.dhanasekar.furnitures.livingroom.Table lvtable = new in.dhanasekar.furnitures.livingroom.Table();
			System.out.println(lvtable);
			
			in.dhanasekar.furnitures.office.Chair ofchair = new in.dhanasekar.furnitures.office.Chair();
			System.out.println(ofchair);
			
			in.dhanasekar.furnitures.office.Table oftable = new in.dhanasekar.furnitures.office.Table();
			System.out.println(oftable);
		
      
    }
} 