package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.BrightnessCombiner.class)
public class BrightnessCombiner635239366Mixin {
        @Inject(at = @At("HEAD"), method = "acceptDouble(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void acceptDouble__172674654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-172674654L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "acceptDouble(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/level/block/entity/BlockEntity;)Lit/unimi/dsi/fastutil/ints/Int2IntFunction;", cancellable = true)
    private void acceptDouble__1759505083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759505083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acceptSingle(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void acceptSingle__1797632395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1797632395L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "acceptSingle(Lnet/minecraft/world/level/block/entity/BlockEntity;)Lit/unimi/dsi/fastutil/ints/Int2IntFunction;", cancellable = true)
    private void acceptSingle__1365533399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1365533399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acceptNone()Ljava/lang/Object;", cancellable = true)
    private void acceptNone__1747090047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747090047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acceptNone()Lit/unimi/dsi/fastutil/ints/Int2IntFunction;", cancellable = true)
    private void acceptNone__308108538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-308108538L))
            info.setReturnValue(null);
    }


}
