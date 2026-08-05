package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.VisibilitySet.class)
public class VisibilitySet1135951522Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_491051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(491051L))
            info.setReturnValue("-?៘7z&9e꞊@㶟mX-c");
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/util/Set;)V", cancellable = true)
    private void add_591870794(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(591870794L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;Z)V", cancellable = true)
    private void set__1445711545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1445711545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAll(Z)V", cancellable = true)
    private void setAll__1929398945(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1929398945L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visibilityBetween(Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void visibilityBetween_1882569585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1882569585L))
            info.setReturnValue(true);
    }


}
