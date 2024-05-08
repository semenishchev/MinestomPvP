package io.github.togar2.pvp.feature.block;

import io.github.togar2.pvp.feature.CombatFeature;
import net.minestom.server.entity.LivingEntity;
import net.minestom.server.entity.damage.Damage;

public interface BlockFeature extends CombatFeature {
	BlockFeature NO_OP = new BlockFeature() {
		@Override
		public boolean isDamageBlocked(LivingEntity entity, Damage damage) {
			return false;
		}
		
		@Override
		public boolean applyBlock(LivingEntity entity, Damage damage) {
			return false;
		}
	};
	
	boolean isDamageBlocked(LivingEntity entity, Damage damage);
	
	/**
	 * Applies the block to the {@link Damage} object.
	 *
	 * @param entity the entity blocking the damage
	 * @param damage the damage object
	 * @return whether the damage was FULLY blocked
	 */
	boolean applyBlock(LivingEntity entity, Damage damage);
}
