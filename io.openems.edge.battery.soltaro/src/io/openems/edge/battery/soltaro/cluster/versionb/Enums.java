package io.openems.edge.battery.soltaro.cluster.versionb;

import io.openems.common.types.OptionsEnum;

public class Enums {

	public enum ClusterRunState implements OptionsEnum {
		UNDEFINED(-1, "Undefined"), //
		NORMAL(0, "Normal"), //
		STOP_CHARGING(1, "Stop charging"), //
		STOP_DISCHARGE(2, "Stop discharging"), //
		STANDBY(3, "Standby");

		private final int value;
		private final String name;

		private ClusterRunState(int value, String name) {
			this.value = value;
			this.name = name;
		}

		@Override
		public int getValue() {
			return this.value;
		}

		@Override
		public String getName() {
			return this.name;
		}

		@Override
		public OptionsEnum getUndefined() {
			return UNDEFINED;
		}
	}

}
