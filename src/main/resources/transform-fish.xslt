<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<xsl:element name="SchoolOfApplicants">
			<xsl:element name="Header">
				<xsl:element name="CurrentDate">
					<xsl:value-of select="SchoolOfApplicants/Header/CurrentDate" />
				</xsl:element>
				<xsl:element name="Records">
					<xsl:value-of select="SchoolOfApplicants/Header/Records" />
				</xsl:element>
			</xsl:element>
			<xsl:for-each select="SchoolOfApplicants/Fish">
				<xsl:element name="Fish">
					<xsl:element name="Name">
						<xsl:value-of select="./Name" />
					</xsl:element>
					<xsl:element name="DOB">
						<xsl:value-of select="./DOB" />
					</xsl:element>
					<xsl:element name="Type">
						<xsl:value-of select="./Type" />
					</xsl:element>
					<xsl:for-each select="./Address">
						<xsl:element name="Address">
							<xsl:attribute name="home">
								<xsl:value-of select="./@home" />
							</xsl:attribute>
							<xsl:element name="Ocean">
								<xsl:value-of select="./Ocean" />
							</xsl:element>
							<xsl:element name="Reef">
								<xsl:value-of select="./Reef" />
							</xsl:element>
							<xsl:element name="Depth">
								<xsl:value-of select="./Depth" />
							</xsl:element>
						</xsl:element>
					</xsl:for-each>
				</xsl:element>
			</xsl:for-each>
		</xsl:element>
	</xsl:template>
</xsl:stylesheet>
