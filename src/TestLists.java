public class TestLists {

    public static void main(String[] args) {

        Song song1 = new Song("Coral Crown", "Darren Korb", 4.07);
        Song song2 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        Song song3 = new Song("CASANOVE POSSE", "ALI", 4.00);


        System.out.println("===== AList Testing =====");
        AList songList1 = new AList();
        System.out.println(songList1.toString());

        songList1.addy(song1);
        songList1.addy(song3);
        songList1.addy(song2);
        songList1.addy(song1);

        System.out.println(songList1.toString());

        songList1.removy(1);
        System.out.println(songList1.toString());
        System.out.println();


        System.out.println("===== SLList Testing =====");
        SLList songSL1 = new SLList();
        System.out.println(songSL1.toString());

        songSL1.addy(song1);
        songSL1.addy(song3);
        songSL1.addy(song2);
        songSL1.addy(song1);

        System.out.println(songSL1.toString());

        songSL1.removy(1);
        System.out.println(songSL1.toString());
        System.out.println();


        System.out.println("===== DLList Testing =====");
        DLList songDL1 = new DLList();
        System.out.println(songDL1.toString());

        songDL1.addy(song1);
        songDL1.addy(song3);
        songDL1.addy(song2);
        songDL1.addy(song1);

        System.out.println(songDL1.toString());

        songDL1.removy(1);
        System.out.println(songDL1.toString());
        System.out.println();

        System.out.println("===== Generic AList Testing =====");
        GenericAList<Song> genericAL = new GenericAList<>();
        System.out.println(genericAL.toString());

        genericAL.addy(song1);
        genericAL.addy(song3);
        genericAL.addy(song2);
        genericAL.addy(song1);

        System.out.println(genericAL.toString());

        genericAL.removy(1);
        System.out.println(genericAL.toString());
        System.out.println();


        System.out.println("===== Generic SLList Testing =====");
        GenericSLList<Song> genericSLL = new GenericSLList<>();
        System.out.println(genericSLL.toString());

        genericSLL.addy(song1);
        genericSLL.addy(song3);
        genericSLL.addy(song2);
        genericSLL.addy(song1);

        System.out.println(genericSLL.toString());

        genericSLL.removy(1);
        System.out.println(genericSLL.toString());
        System.out.println();


        System.out.println("===== Generic DLList Testing =====");
        GenericDLList<Song> genericDLL = new GenericDLList<>();
        System.out.println(genericDLL.toString());

        genericDLL.addy(song1);
        genericDLL.addy(song3);
        genericDLL.addy(song2);
        genericDLL.addy(song1);

        System.out.println(genericDLL.toString());

        genericDLL.removy(1);
        System.out.println(genericDLL.toString());

    }


}
