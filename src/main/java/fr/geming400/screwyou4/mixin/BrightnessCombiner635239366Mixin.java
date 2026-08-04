package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.BrightnessCombiner.class)
public class BrightnessCombiner635239366Mixin {
        @Inject(at = @At("HEAD"), method = "acceptNone()Ljava/lang/Object;", cancellable = true)
    private void acceptNone__1800406751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1800406751L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acceptNone()Lit/unimi/dsi/fastutil/ints/Int2IntFunction;", cancellable = true)
    private void acceptNone__450507098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-450507098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acceptDouble(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/level/block/entity/BlockEntity;)Lit/unimi/dsi/fastutil/ints/Int2IntFunction;", cancellable = true)
    private void acceptDouble__293238452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-293238452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acceptDouble(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void acceptDouble__992586775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-992586775L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acceptSingle(Lnet/minecraft/world/level/block/entity/BlockEntity;)Lit/unimi/dsi/fastutil/ints/Int2IntFunction;", cancellable = true)
    private void acceptSingle__956639815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-956639815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acceptSingle(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void acceptSingle_647446277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(647446277L))
            info.setReturnValue(null);
    }


}
