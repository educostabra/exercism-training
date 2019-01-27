class TwoFerJava {

	String twoFer(){
		return twoFer("you");
	}

	String twoFer(String whom){
		return String.format( "One for %s, one for me.",whom);
	}

}
