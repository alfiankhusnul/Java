public class Pegawai 
{
	private String namaPegawai;
	private String nip;
	private String jabatan;
	private String posisi;
	
	public Pegawai(String namaPegawai, String nip, String jabatan, String posisi)
	{
		super();
		this.namaPegawai = namaPegawai;
		this.nip = nip;
		this.jabatan = jabatan;
		this.posisi = posisi;
	}
	public Pegawai()
	{
		this.namaPegawai = "Undefined";
		this.nip = "Undefined";
		this.jabatan = "Undefined";
		this.posisi = "Undefined";
	}
	public String getNamaPegawai()
	{
		return namaPegawai;
	}
	public void setNamaPegawai(String namaPegawai)
	{
		this.namaPegawai = namaPegawai;
	}
	public String getNip()
	{
		return nip;
	}
	public void setNip(String nip)
	{
		this.nip = nip;
	}
	public String getJabatan()
	{
		return jabatan;
	}
	public void setJabatan(String jabatan)
	{
		this.jabatan = jabatan;
	}
	public String getPosisi()
	{
		return posisi;
	}
	public void setPosisi(String posisi)
	{
		this.posisi = posisi;
	}
	
	
}
