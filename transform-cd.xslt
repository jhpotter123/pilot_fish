<?xml version="1.0" ?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<xsl:element name="catalog">
			<xsl:for-each select="catalog/cd">
				<xsl:element name="cd">
					<xsl:element name="artist">
		                <xsl:value-of select="artist" />
		            </xsl:element>
					<xsl:element name="title">
		                <xsl:value-of select="title" />
		            </xsl:element>
				</xsl:element>
			</xsl:for-each>
		</xsl:element>
	</xsl:template>
</xsl:stylesheet>
