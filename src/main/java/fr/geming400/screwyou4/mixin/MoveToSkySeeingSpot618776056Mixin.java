package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.MoveToSkySeeingSpot.class)
public class MoveToSkySeeingSpot618776056Mixin {
        @Inject(at = @At("HEAD"), method = "create(F)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create__403541155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-403541155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasNoBlocksAbove(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void hasNoBlocksAbove_1121604768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121604768L))
            info.setReturnValue(true);
    }


}
