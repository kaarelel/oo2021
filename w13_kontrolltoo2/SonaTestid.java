public class SonaTestid {

    String a = "pere";
    Sona uusSona= new Sona(a);
    String a2 = "Suvaline testitav lause";
    Lause uusLause= new Lause(a2);
    

    @Test
	public void kontroll1(){
		assertEquals("T2hte r leidub: 1", uusSona.T2heEsinemiseArv('r'));
	}
    @Test
	public void kontroll2(){
		assertEquals("T2hte e leidub: 2", uusSona.T2heEsinemiseArv('e'));
	}
    @Test
	public void kontroll3(){
		assertEquals("T2hte p leidub: 1", uusSona.T2heEsinemiseArv('p'));
	}
    @Test
	public void kontroll4(){
		assertEquals("T2hte a leidub lauses: 2", uusLause.T2heEsinemiseArv('a'));
	}

}