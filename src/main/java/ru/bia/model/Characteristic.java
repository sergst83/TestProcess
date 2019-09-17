package ru.bia.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Characteristic implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Адрес отправителя")
	private java.lang.String addressFrom;
	@org.kie.api.definition.type.Label(value = "Адрес получателя")
	private java.lang.String addressTo;
	@org.kie.api.definition.type.Label(value = "Груз")
	private ru.bia.model.Cargo cargo;

	public Characteristic() {
	}

	public java.lang.String getAddressFrom() {
		return this.addressFrom;
	}

	public void setAddressFrom(java.lang.String addressFrom) {
		this.addressFrom = addressFrom;
	}

	public java.lang.String getAddressTo() {
		return this.addressTo;
	}

	public void setAddressTo(java.lang.String addressTo) {
		this.addressTo = addressTo;
	}

	public ru.bia.model.Cargo getCargo() {
		return this.cargo;
	}

	public void setCargo(ru.bia.model.Cargo cargo) {
		this.cargo = cargo;
	}

	public Characteristic(java.lang.String addressFrom,
			java.lang.String addressTo, ru.bia.model.Cargo cargo) {
		this.addressFrom = addressFrom;
		this.addressTo = addressTo;
		this.cargo = cargo;
	}

    @Override
    public String toString() {
        return "Characteristic{" +
                "addressFrom='" + addressFrom + '\'' +
                ", addressTo='" + addressTo + '\'' +
                ", cargo=" + cargo +
                '}';
    }
}