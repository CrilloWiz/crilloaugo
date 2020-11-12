package net.mcreator.acmodpack.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.acmodpack.AcmodpackModElements;

import java.util.Map;

@AcmodpackModElements.ModElement.Tag
public class FireswordLivingEntityIsHitWithToolProcedure extends AcmodpackModElements.ModElement {
	public FireswordLivingEntityIsHitWithToolProcedure(AcmodpackModElements instance) {
		super(instance, 7);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FireswordLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 15);
	}
}
