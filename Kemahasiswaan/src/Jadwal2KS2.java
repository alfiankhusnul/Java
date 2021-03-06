
public class Jadwal2KS2 
{
	//private int total;
	private JadwalParent jadwal[] =new JadwalParent[7]; 
	
	public Jadwal2KS2() 
  {
		PegawaiDosen dosen = new PegawaiDosen();
		MataKuliahList matkul = new MataKuliahList();
		
		//this.total=7;
		this.jadwal[0]= new JadwalParent("Senin ","2","323",matkul.getMatakuliah(3),dosen.getDosen(1));
		this.jadwal[1]= new JadwalParent("Senin ","3","265",matkul.getMatakuliah(2),dosen.getDosen(2));
		this.jadwal[2]= new JadwalParent("Selasa","1","341",matkul.getMatakuliah(4),dosen.getDosen(3));
		this.jadwal[3]= new JadwalParent("Selasa","2","325",matkul.getMatakuliah(6),dosen.getDosen(4));
		this.jadwal[4]= new JadwalParent("Rabu  ","1","342",matkul.getMatakuliah(1),dosen.getDosen(5));
		this.jadwal[5]= new JadwalParent("Rabu  ","2","323",matkul.getMatakuliah(5),dosen.getDosen(6));
		this.jadwal[6]= new JadwalParent("Kamis ","2","242",matkul.getMatakuliah(0),dosen.getDosen(0));

	}
	
	public void getJadwalReguler()
	{
		Utils.clrscr();
		System.out.println("\nJadwal Reguler Kelas 2 KS 1 \n");
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("| NO |\tMata Kuliah\t\t\t| Hari   | Sesi | Ruang\t| \tDosen\t\t\t\t|");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		for (int index = 0; index < jadwal.length; index++)
		{	
			int a=index+1;
			
			if(index<9) 
      {
				System.out.print("|  " + a + " | ");
			} else 
      {
				System.out.print("| " + a + " | ");
			}
			
			if(jadwal[index] != null)
			{
				if(jadwal[index].getMatkul().getNamaMataKuliah().length()>=25) 
        {
					System.out.print(jadwal[index].getMatkul().getNamaMataKuliah()+ "\t");
				}
        else if (jadwal[index].getMatkul().getNamaMataKuliah().length()>=17) 
        {
					System.out.print(jadwal[index].getMatkul().getNamaMataKuliah()+ "\t\t");
				}
        else if (jadwal[index].getMatkul().getNamaMataKuliah().length()>=9) 
        {
					System.out.print(jadwal[index].getMatkul().getNamaMataKuliah()+ "\t\t\t");
				}
        else if (jadwal[index].getMatkul().getNamaMataKuliah().length()>=4) 
        {
					System.out.print(jadwal[index].getMatkul().getNamaMataKuliah()+ "\t\t\t\t");
				}
				
				System.out.print("| "+ jadwal[index].getHari() + " |  "
								     +jadwal[index].getSesi()+ "   | " 
								     +jadwal[index].getRuang()+"\t| ");
				
				if(jadwal[index].getDosen().getNamaPegawai().length()>=30) 
        {
					System.out.print(jadwal[index].getDosen().getNamaPegawai()+ "\t");
				}
        else if (jadwal[index].getDosen().getNamaPegawai().length()>=22) 
        {
					System.out.print(jadwal[index].getDosen().getNamaPegawai()+ "\t\t");
				}
        else if (jadwal[index].getDosen().getNamaPegawai().length()>=14) 
        {
					System.out.print(jadwal[index].getDosen().getNamaPegawai()+ "\t\t\t");
				}
        else if (jadwal[index].getDosen().getNamaPegawai().length()>=6) 
        {
					System.out.print(jadwal[index].getDosen().getNamaPegawai()+ "\t\t\t\t");
				}
				
				System.out.println("|");
			}
			else
			{
				System.out.println("\nEnd of line.");
			}
			
		}
		System.out.println("---------------------------------------------------------------------------------------------------------");
	}
}
