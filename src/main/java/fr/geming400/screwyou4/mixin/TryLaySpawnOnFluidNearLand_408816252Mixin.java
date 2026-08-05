package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.TryLaySpawnOnFluidNearLand.class)
public class TryLaySpawnOnFluidNearLand_408816252Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__1106348733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1106348733L))
            info.setReturnValue(null);
    }


}
