package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.TryLaySpawnOnFluidNearLand.class)
public class TryLaySpawnOnFluidNearLand_408816252Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_1154135999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1154135999L))
            info.setReturnValue(null);
    }


}
