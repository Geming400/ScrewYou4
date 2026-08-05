package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.VisibilitySet.class)
public class VisibilitySet1135951522Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1906374551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1906374551L))
            info.setReturnValue("E");
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/util/Set;)V", cancellable = true)
    private void add__1206970005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1206970005L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;Z)V", cancellable = true)
    private void set_1552436521(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1552436521L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAll(Z)V", cancellable = true)
    private void setAll_986637310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(986637310L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visibilityBetween(Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void visibilityBetween__330033765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-330033765L))
            info.setReturnValue(true);
    }


}
