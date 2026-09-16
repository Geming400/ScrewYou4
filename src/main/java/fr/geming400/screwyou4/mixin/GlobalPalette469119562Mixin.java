package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.GlobalPalette.class)
public class GlobalPalette469119562Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/chunk/Palette;", cancellable = true)
    private void copy__520648356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-520648356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/core/IdMap;)V", cancellable = true)
    private void write__2062852110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2062852110L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSize()I", cancellable = true)
    private void getSize_903246361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(903246361L))
            info.setReturnValue(-193981131);
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/core/IdMap;)V", cancellable = true)
    private void read__735132567(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-735132567L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSerializedSize(Lnet/minecraft/core/IdMap;)I", cancellable = true)
    private void getSerializedSize_1351579839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1351579839L))
            info.setReturnValue(-711475413);
    }

    @Inject(at = @At("HEAD"), method = "idFor(Ljava/lang/Object;Lnet/minecraft/world/level/chunk/PaletteResize;)I", cancellable = true)
    private void idFor__1569539480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569539480L))
            info.setReturnValue(522295597);
    }

    @Inject(at = @At("HEAD"), method = "valueFor(I)Ljava/lang/Object;", cancellable = true)
    private void valueFor__2084197388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2084197388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maybeHas(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void maybeHas__1289572034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1289572034L))
            info.setReturnValue(true);
    }


}
