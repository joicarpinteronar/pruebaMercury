package pruebaPortalMercury.userinterfaces;

public enum Opcion {
  SeleccionaTuViaje("http://demo.guru99.com/test/newtours");

  private final String url;

  Opcion(String url) {
    this.url = url;
  }

  public String url() {
    return url;
  }
}
