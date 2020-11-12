package net.mcreator.acmodpack.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.acmodpack.AcmodpackModElements;

import java.util.Map;

@AcmodpackModElements.ModElement.Tag
public class FirechestplateHelmetTickEventProcedure extends AcmodpackModElements.ModElement {
	public FirechestplateHelmetTickEventProcedure(AcmodpackModElements instance) {
		super(instance, 1);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FirechestplateHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, (int) 20, (int) 1, (false), (false)));
	}
}
