package br.inatel.ads.solid.di;

public class PasswordRecovery {
	//sem inversao de independencia
	//private MySQLConnection dbConn;
    //
	//public PasswordRecovery() {
	//	this.dbConn = new MySQLConnection();
	
	//com inversão de independencia
	private Connection dbConn;

	public PasswordRecovery(Connection conn) {
		this.dbConn = conn;
	}

}
