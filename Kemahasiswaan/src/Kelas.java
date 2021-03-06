public abstract class Kelas 
{
	/*
	 * Class parent untuk semua class Kelas
	 */
	private String namaKelas;
	private String jurusan;
	private int indexKelas;
	private int jumlahOrang;
	private Mahasiswa mhs = new Mahasiswa();
	
	public Kelas() 
	{
		//TODO auto constructor
	}
	
	//getAllMahasiswa berbeda untuk tiap Kelas
	//TODO buat getAllMahasiswa() generic untuk tiap Kelas
	public abstract void getAllMahasiswa(); 
	
	public Mahasiswa getMhs()
	{
		return mhs;
	}

	@Override
	public String toString()
	{
		return this.namaKelas;
	}

	public void setMhs(Mahasiswa mhs)
	{
		this.mhs = mhs;
	}



	public String getNamaKelas() 
	{
		return namaKelas;
	}

	public void setNamaKelas(String namaKelas) 
	{
		this.namaKelas = namaKelas;
	}

	public String getJurusan() 
	{
		return jurusan;
	}

	public void setJurusan(String jurusan) 
	{
		this.jurusan = jurusan;
	}

	public int getIndexKelas() 
	{
		return indexKelas;
	}

	public void setIndexKelas(int indexKelas) 
	{
		this.indexKelas = indexKelas;
	}

	public int getJumlahOrang() 
	{
		return jumlahOrang;
	}

	public void setJumlahOrang(int jumlahOrang) 
	{
		this.jumlahOrang = jumlahOrang;
	}
	
}
