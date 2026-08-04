package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.NetherPortalBlock.class)
public class NetherPortalBlock1538714939Mixin {
        @Inject(at = @At("HEAD"), method = "getPortalDestination(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/portal/TeleportTransition;", cancellable = true)
    private void getPortalDestination__1919928700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1919928700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1416112858(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1416112858L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1020398633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1020398633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPortalTransitionTime(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)I", cancellable = true)
    private void getPortalTransitionTime__1112228983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1112228983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLocalTransition()Lnet/minecraft/world/level/block/Portal$Transition;", cancellable = true)
    private void getLocalTransition__307950384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-307950384L))
            info.setReturnValue(null);
    }


}
