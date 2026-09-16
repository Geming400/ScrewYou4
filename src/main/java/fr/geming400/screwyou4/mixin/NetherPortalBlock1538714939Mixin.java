package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.NetherPortalBlock.class)
public class NetherPortalBlock1538714939Mixin {
        @Inject(at = @At("HEAD"), method = "getPortalDestination(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/portal/TeleportTransition;", cancellable = true)
    private void getPortalDestination__277323592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-277323592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1689807103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1689807103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLocalTransition()Lnet/minecraft/world/level/block/Portal$Transition;", cancellable = true)
    private void getLocalTransition__1621238618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1621238618L))
            info.setReturnValue(net.minecraft.world.level.block.Portal.Transition.CONFUSION);
    }

    @Inject(at = @At("HEAD"), method = "getPortalTransitionTime(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)I", cancellable = true)
    private void getPortalTransitionTime_2124478797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124478797L))
            info.setReturnValue(-1465340952);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1943396472(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1943396472L))
            info.cancel();
    }


}
