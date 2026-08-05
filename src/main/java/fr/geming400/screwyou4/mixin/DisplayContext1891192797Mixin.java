package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.model.properties.select.DisplayContext.class)
public class DisplayContext1891192797Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/renderer/block/model/BlockDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get__1926679642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1926679642L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/renderer/block/model/BlockDisplayContext;)Lnet/minecraft/client/renderer/block/model/BlockDisplayContext;", cancellable = true)
    private void get_1180094013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1180094013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1018262240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1018262240L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_755732822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(755732822L))
            info.setReturnValue(" \uA18D&gYT\uBAFD9\u920C8j\u55A4S6\u256186#!`8\u58D1fX.2_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1929455539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1929455539L))
            info.setReturnValue(-2049227416);
    }


}
