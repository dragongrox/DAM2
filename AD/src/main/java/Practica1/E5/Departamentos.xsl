<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:template match="/">
        <html>
            <body>
                <xsl:for-each select="Departamento/departamento">
                    <xsl:sort data-type="text" order="ascending"/>
                    <table border="1">
                        <tr>
                            <td>
                                <b>ID:</b>
                                <xsl:value-of select="ID"/>
                            </td>
                            <td>
                                <b>Tipo:</b>
                                <xsl:value-of select="tipo"/>
                            </td>
                            <td>
                                <b>Nombre:</b>
                                <xsl:value-of select="nombre"/>
                            </td>
                            <td>
                                <b>Domicilio:</b>
                                <xsl:value-of select="domicilio"/>
                            </td>
                            <td>
                                <b>Ciudad:</b>
                                <xsl:value-of select="ciudad"/>
                            </td>
                            <td>
                                <b>CP:</b>
                                <xsl:value-of select="cp"/>
                            </td>
                            <td>
                                <b>Provincia:</b>
                                <xsl:value-of select="provincia"/>
                            </td>
                            <td>
                                <b>Pais:</b>
                                <xsl:value-of select="pais"/>
                            </td>
                        </tr>
                    </table>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>