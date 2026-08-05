package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.Target.class)
public class Target_1768880007Mixin {
        @Inject(at = @At("HEAD"), method = "getBestNode()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getBestNode_275662496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(275662496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFromStream(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/world/level/pathfinder/Target;", cancellable = true)
    private static void createFromStream_1408217013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1408217013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateBest(FLnet/minecraft/world/level/pathfinder/Node;)V", cancellable = true)
    private void updateBest__668316688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-668316688L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isReached()Z", cancellable = true)
    private void isReached_1807158589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1807158589L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setReached()V", cancellable = true)
    private void setReached_1807154745(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1807154745L))
            info.cancel();
    }


}
