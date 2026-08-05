package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.SingleValuePalette.class)
public class SingleValuePalette548039286Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/chunk/Palette;", cancellable = true)
    private void copy__173648163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-173648163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/core/IdMap;)V", cancellable = true)
    private void write_1870748543(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1870748543L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSize()I", cancellable = true)
    private void getSize_586301532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(586301532L))
            info.setReturnValue(-1569189824);
    }

    @Inject(at = @At("HEAD"), method = "create(ILjava/util/List;)Lnet/minecraft/world/level/chunk/Palette;", cancellable = true)
    private static void create_910376703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(910376703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/core/IdMap;)V", cancellable = true)
    private void read_1870748543(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1870748543L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "valueFor(I)Ljava/lang/Object;", cancellable = true)
    private void valueFor_2121822392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2121822392L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "maybeHas(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void maybeHas_618399676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(618399676L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedSize(Lnet/minecraft/core/IdMap;)I", cancellable = true)
    private void getSerializedSize_1680849126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1680849126L))
            info.setReturnValue(-1724073580);
    }

    @Inject(at = @At("HEAD"), method = "idFor(Ljava/lang/Object;Lnet/minecraft/world/level/chunk/PaletteResize;)I", cancellable = true)
    private void idFor_192589670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(192589670L))
            info.setReturnValue(-408104432);
    }


}
