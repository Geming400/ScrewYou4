package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.HashMapPalette.class)
public class HashMapPalette_1222491855Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/chunk/Palette;", cancellable = true)
    private void copy_232723936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(232723936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/core/IdMap;)V", cancellable = true)
    private void write__1309479818(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1309479818L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSize()I", cancellable = true)
    private void getSize_1656618653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1656618653L))
            info.setReturnValue(-1497763925);
    }

    @Inject(at = @At("HEAD"), method = "create(ILjava/util/List;)Lnet/minecraft/world/level/chunk/Palette;", cancellable = true)
    private static void create_1862951763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1862951763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/core/IdMap;)V", cancellable = true)
    private void read_18239725(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(18239725L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntries()Ljava/util/List;", cancellable = true)
    private void getEntries__517751720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-517751720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedSize(Lnet/minecraft/core/IdMap;)I", cancellable = true)
    private void getSerializedSize_2104952131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2104952131L))
            info.setReturnValue(-1744383649);
    }

    @Inject(at = @At("HEAD"), method = "maybeHas(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void maybeHas__536199742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-536199742L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "valueFor(I)Ljava/lang/Object;", cancellable = true)
    private void valueFor__1330825096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1330825096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "idFor(Ljava/lang/Object;Lnet/minecraft/world/level/chunk/PaletteResize;)I", cancellable = true)
    private void idFor__816167188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-816167188L))
            info.setReturnValue(-1854325922);
    }


}
