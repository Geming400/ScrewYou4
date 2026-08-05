package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.GameEvent.class)
public class GameEvent1959993642Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__949461395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-949461395L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_824533667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(824533667L))
            info.setReturnValue("\u6ADA]4imf");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1998256384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1998256384L))
            info.setReturnValue(264309067);
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void bootstrap__911604100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-911604100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notificationRadius()I", cancellable = true)
    private void notificationRadius_1998255888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1998255888L))
            info.setReturnValue(-1108475009);
    }


}
