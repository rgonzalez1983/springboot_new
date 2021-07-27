package com.example.demo.enumerators;

public enum ConstantesStr {

    ORDER_VALOR("VALOR"),
    ORDER_FECHA("FECHA"),
    FORMAT_FECHA("yyyy-MM-dd"),
    URL_FILE("valores.json"),
    SERVER_URL("http://127.0.0.1:5050"),
    INIT_URL("/swagger-ui.html"),
    VALUES_URL("/valoresJson"),
    DOWNLOAD_URL("/downloadJson"),
    COMMAND_OPEN_CHROME("cmd /c start chrome.exe " + SERVER_URL.text + INIT_URL.text);

    /**
     * Valor ENUM.
     */
    private final String text;

    /**
     * Constructor.
     *
     * @param text
     */
    private ConstantesStr(final String text) {
        this.text = text;
    }

    /**
     * @see Enum#toString()
     */
    @Override
    public String toString() {
        return this.text;
    }

}
