import java.util.Scanner;
public class volume {

  public static void main(String[] args) throws Exception {

     String text[]={"P","R","O","G","R","A","M","\t","J","A","V","A"};
  int a=0;
  System.out.print("\t");
  while(a<text.length){
    Thread.sleep(300);
    System.out.print(text[a]);
    a++;
  }
  System.out.println();

  System.out.println();
  System.out.println("================================");
  System.out.println("PERHITUNGAN VOLUME BANGUN RUANG");
  System.out.println("================================");

  int jumlah,i,j, swap,pilih,lagi;
  Scanner scan = new Scanner(System.in);
  Scanner rumus = new Scanner(System.in);
  Scanner volume = new Scanner(System.in);
 
 
  int array[] = {4,1,7,3,5,8,6,2};
  String list[]={"Volume Bangun Ruang1","Volume Bangun Ruang2","Volume Bangun Ruang3","Volume Bangun Ruang4","Volume Bangun Ruang5","Volume Bangun Ruang6","Volume Bangun Ruang7","Volume Bangun Ruang8"};

  for(i=0; i<(array.length-1);i++)
  {
   for(j=0;j<array.length-i-1;j++)
   {
    if (array[j] > array[j+1])
    {
     swap = array[j];
     array[j] = array[j+1];
     array[j+1]=swap;{}
    }
   }
  }

  
  for(i=0;i<array.length; i++){
   System.out.println(array[i]+". "+list[i]);
  }
  pil:
  for(;;){
  //System.out.println("PERHITUNGAN VOLUME BANGUN RUANG");
  
  System.out.print("\nPilih Volume Bangun Ruang yang diinginkan : ");
  pilih=scan.nextInt();
  
  System.out.print("Pilihan Rumus anda no :"+pilih);
  System.out.println();
  switch (pilih){
    case 1:
    System.out.println("Volume Bangun Ruang1");

    System.out.println("====================");
    System.out.println("Volume Kubus");
    System.out.println("====================");

  
    System.out.print("Sisi 1 : ");
    int Sisi1 = rumus.nextInt();
    System.out.print("Sisi 2 : ");
    int Sisi2 = rumus.nextInt();
    System.out.print("Sisi 3 : ");
    int Sisi3= rumus.nextInt();
    int volumekubus = Sisi1*Sisi2*Sisi3;
    System.out.println("Volumenya adalah "+volumekubus);

    break;

    case 2:
    System.out.println("Volume Bangun Ruang2");

    System.out.println("====================");
    System.out.println("Volume Balok");
    System.out.println("====================");
    
    //Scanner rumus = new Scanner(System.in);
    System.out.print("Panjang : ");
    int Panjang = rumus.nextInt();
    System.out.print("Lebar : ");
    int Lebar = rumus.nextInt();
    System.out.print("Tinggi : ");
    int Tinggi = rumus.nextInt();

    int volumebalok = Panjang*Lebar*Tinggi;
    System.out.println("Volumenya adalah "+volumebalok);
    break;

    case 3:
    System.out.println("Volume Bangun Ruang3");

    System.out.println("====================");
    System.out.println("Volume Tabung");
    System.out.println("====================");

    System.out.print("jari-jari : ");
    int jarijari = rumus.nextInt();
    System.out.print("tinggi : ");
    int tinggi = rumus.nextInt();

    double volumetabung = 3.14*jarijari*jarijari*tinggi;
    System.out.println("Volumenya adalah "+volumetabung);
    break;

    case 4:
    System.out.println("Volume Bangun Ruang4");

    System.out.println("====================");
    System.out.println("Volume Kerucut");
    System.out.println("====================");

    System.out.print("jari-jari : ");
    jarijari = rumus.nextInt();
    System.out.print("tinggi : ");
    tinggi = rumus.nextInt();

    double volumekerucut = 0.3*3.14*jarijari*jarijari*tinggi;
    System.out.println("Volumenya adalah "+volumekerucut);
    break;

    case 5:
    System.out.println("Volume Bangun Ruang5");

    System.out.println("====================");
    System.out.println("Volume Limas Segitiga");
    System.out.println("====================");

    
    System.out.print("Luas alas : ");
    int luasalas = rumus.nextInt();
    System.out.print("tinggi : ");
    tinggi = rumus.nextInt();

    double volumelimassegitiga = 0.3*luasalas*tinggi;
    System.out.println("Volumenya adalah "+volumelimassegitiga);

    break;
    case 6:
    System.out.println("Volume Bangun Ruang6");

    System.out.println("====================");
    System.out.println("Volume Limas Segiempat");
    System.out.println("====================");

    System.out.print("Luas alas : ");
    luasalas = rumus.nextInt();
    System.out.print("tinggi : ");
    tinggi = rumus.nextInt();

    double volumelimassegiempat = 0.3*luasalas*tinggi;
    System.out.println("Volumenya adalah "+volumelimassegiempat);


    break;
    case 7:
    System.out.println("Volume Bangun Ruang7");

    System.out.println("====================");
    System.out.println("Volume Bola");
    System.out.println("====================");

    System.out.print("jari-jari : ");
    jarijari = rumus.nextInt();
    System.out.print("tinggi : ");
    tinggi = rumus.nextInt();

    double volumebola = 1.33*3.14*jarijari*jarijari*jarijari;
    System.out.println("Volumenya adalah "+volumebola);
    break;

    case 8:
    System.out.println("Volume Bangun Ruang8");

    System.out.println("====================");
    System.out.println("Volume Prisma");
    System.out.println("====================");

    System.out.print("Luas alas : ");
    luasalas = rumus.nextInt();
    System.out.print("tinggi : ");
    tinggi = rumus.nextInt();

    int volumeprisma = luasalas*tinggi;
    System.out.println("Volumenya adalah "+volumeprisma);
    

    break;
    

    default :
   continue pil;
   
  }
  System.out.print("Apakah Anda Ingin Coba lagi? (1:0)");
  lagi=scan.nextInt();
  System.out.println();
  if(lagi==1){
    continue pil;
  }else{
    System.out.print("Terima kasih");
    System.exit(0); 
  }
  break;
  }
  }
}
