package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.HashMapPalette.class)
public class HashMapPalette_1222491855Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/chunk/Palette;", cancellable = true)
    private void copy_500804405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(500804405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/core/IdMap;)V", cancellable = true)
    private void write__1749766185(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1749766185L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSize()I", cancellable = true)
    private void getSize_1260754100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1260754100L))
            info.setReturnValue(623379588);
    }

    @Inject(at = @At("HEAD"), method = "create(ILjava/util/List;)Lnet/minecraft/world/level/chunk/Palette;", cancellable = true)
    private static void create_1584829271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1584829271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/core/IdMap;)V", cancellable = true)
    private void read__1749766185(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1749766185L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntries()Ljava/util/List;", cancellable = true)
    private void getEntries__1446138626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1446138626L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueFor(I)Ljava/lang/Object;", cancellable = true)
    private void valueFor__1498692336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1498692336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "idFor(Ljava/lang/Object;Lnet/minecraft/world/level/chunk/PaletteResize;)I", cancellable = true)
    private void idFor_867042238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867042238L))
            info.setReturnValue(-1468978433);
    }

    @Inject(at = @At("HEAD"), method = "maybeHas(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void maybeHas_1292852244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1292852244L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedSize(Lnet/minecraft/core/IdMap;)I", cancellable = true)
    private void getSerializedSize__1939665602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939665602L))
            info.setReturnValue(2143916475);
    }


}
