package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.LinearPalette.class)
public class LinearPalette435190024Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/chunk/Palette;", cancellable = true)
    private void copy__286497425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-286497425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/core/IdMap;)V", cancellable = true)
    private void write_1757899281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1757899281L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSize()I", cancellable = true)
    private void getSize_473452270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(473452270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(ILjava/util/List;)Lnet/minecraft/world/level/chunk/Palette;", cancellable = true)
    private static void create_797527441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(797527441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/core/IdMap;)V", cancellable = true)
    private void read_1757899281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1757899281L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "valueFor(I)Ljava/lang/Object;", cancellable = true)
    private void valueFor_2008973130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2008973130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedSize(Lnet/minecraft/core/IdMap;)I", cancellable = true)
    private void getSerializedSize_1567999864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1567999864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "idFor(Ljava/lang/Object;Lnet/minecraft/world/level/chunk/PaletteResize;)I", cancellable = true)
    private void idFor_79740408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(79740408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maybeHas(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void maybeHas_505550414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(505550414L))
            info.setReturnValue(null);
    }


}
