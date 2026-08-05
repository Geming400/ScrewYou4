package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.MoveToSkySeeingSpot.class)
public class MoveToSkySeeingSpot618776056Mixin {
        @Inject(at = @At("HEAD"), method = "create(F)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create_1610837721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1610837721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasNoBlocksAbove(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void hasNoBlocksAbove__1531293988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1531293988L))
            info.setReturnValue(false);
    }


}
