package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.Target.class)
public class Target_1768880007Mixin {
        @Inject(at = @At("HEAD"), method = "createFromStream(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/world/level/pathfinder/Target;", cancellable = true)
    private static void createFromStream__1100248165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1100248165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBestNode()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getBestNode_1268149156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1268149156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateBest(FLnet/minecraft/world/level/pathfinder/Node;)V", cancellable = true)
    private void updateBest__1519923901(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1519923901L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setReached()V", cancellable = true)
    private void setReached__779634263(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-779634263L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isReached()Z", cancellable = true)
    private void isReached_216739189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216739189L))
            info.setReturnValue(true);
    }


}
