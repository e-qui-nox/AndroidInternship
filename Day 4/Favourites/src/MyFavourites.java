
public class MyFavourites extends ParentFavourites implements Favourites{

	public void favouriteFruit() {

		System.out.println("WaterMelon");
		
	}


	public void favouriteIceCream() {
		super.parentFavouriteIceCream();//it is possible
		System.out.println("Black Current");
	}

	
	public void favouriteMovie() {
		System.out.println("Harry Potter");
		
	}

	
	public void favouriteSubject() {
		System.out.println("All Subjects");
		
	}
	
	public static void main(String[] args) {
		MyFavourites favourites = new MyFavourites();
		favourites.parentFavouriteFruit();
		favourites.favouriteFruit();
		favourites.favouriteIceCream();
		favourites.favouriteMovie();
		favourites.favouriteSubject();
	}
	
}
