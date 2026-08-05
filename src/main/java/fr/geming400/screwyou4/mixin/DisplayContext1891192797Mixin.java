package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.model.properties.select.DisplayContext.class)
public class DisplayContext1891192797Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/renderer/block/model/BlockDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get__418039920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-418039920L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/renderer/block/model/BlockDisplayContext;)Lnet/minecraft/client/renderer/block/model/BlockDisplayContext;", cancellable = true)
    private void get_165355155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165355155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_982566529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(982566529L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1633350974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1633350974L))
            info.setReturnValue("#\u5FF4Elp");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1846422408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1846422408L))
            info.setReturnValue(1360967513);
    }


}
