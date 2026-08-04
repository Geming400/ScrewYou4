package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.GlobalPalette.class)
public class GlobalPalette469119562Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/chunk/Palette;", cancellable = true)
    private void copy__252567887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-252567887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/core/IdMap;)V", cancellable = true)
    private void write_1791828819(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1791828819L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSize()I", cancellable = true)
    private void getSize_507381808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507381808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/core/IdMap;)V", cancellable = true)
    private void read_1791828819(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1791828819L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "valueFor(I)Ljava/lang/Object;", cancellable = true)
    private void valueFor_2042902668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042902668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedSize(Lnet/minecraft/core/IdMap;)I", cancellable = true)
    private void getSerializedSize_1601929402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1601929402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "idFor(Ljava/lang/Object;Lnet/minecraft/world/level/chunk/PaletteResize;)I", cancellable = true)
    private void idFor_113669946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(113669946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maybeHas(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void maybeHas_539479952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(539479952L))
            info.setReturnValue(null);
    }


}
