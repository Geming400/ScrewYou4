package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.LinearPalette.class)
public class LinearPalette435190024Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/chunk/Palette;", cancellable = true)
    private void copy__554577894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-554577894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/core/IdMap;)V", cancellable = true)
    private void write__2096781648(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2096781648L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSize()I", cancellable = true)
    private void getSize_869316823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869316823L))
            info.setReturnValue(1082001899);
    }

    @Inject(at = @At("HEAD"), method = "create(ILjava/util/List;)Lnet/minecraft/world/level/chunk/Palette;", cancellable = true)
    private static void create_1075649933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1075649933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/core/IdMap;)V", cancellable = true)
    private void read__769062105(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-769062105L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSerializedSize(Lnet/minecraft/core/IdMap;)I", cancellable = true)
    private void getSerializedSize_1317650301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317650301L))
            info.setReturnValue(-1015501169);
    }

    @Inject(at = @At("HEAD"), method = "valueFor(I)Ljava/lang/Object;", cancellable = true)
    private void valueFor__2118126926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2118126926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "idFor(Ljava/lang/Object;Lnet/minecraft/world/level/chunk/PaletteResize;)I", cancellable = true)
    private void idFor__1603469018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1603469018L))
            info.setReturnValue(-645857052);
    }

    @Inject(at = @At("HEAD"), method = "maybeHas(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void maybeHas__1323501572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1323501572L))
            info.setReturnValue(true);
    }


}
