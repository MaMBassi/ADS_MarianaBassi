package br.inatel.ads.solid.di;

public interface Connection {
	public List select(String sql);
    public void insert(String sql);

}
