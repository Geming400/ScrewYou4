package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.Configuration.Simple.class)
public class Simple_1624153636Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1285301402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1285301402L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_488693660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(488693660L))
            info.setReturnValue("HPBil蔵2ݣn8EJ2yAo)D]t/觇춑hN");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1662416377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1662416377L))
            info.setReturnValue(-1250657841);
    }

    @Inject(at = @At("HEAD"), method = "factory()Lnet/minecraft/world/level/chunk/Palette$Factory;", cancellable = true)
    private void factory_1316157060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1316157060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bits()I", cancellable = true)
    private void bits_1662415881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1662415881L))
            info.setReturnValue(-1367621506);
    }

    @Inject(at = @At("HEAD"), method = "alwaysRepack()Z", cancellable = true)
    private void alwaysRepack_1662432218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1662432218L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "bitsInMemory()I", cancellable = true)
    private void bitsInMemory_1662415881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1662415881L))
            info.setReturnValue(-1367621506);
    }

    @Inject(at = @At("HEAD"), method = "bitsInStorage()I", cancellable = true)
    private void bitsInStorage_1662415881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1662415881L))
            info.setReturnValue(-1367621506);
    }

    @Inject(at = @At("HEAD"), method = "createPalette(Lnet/minecraft/world/level/chunk/Strategy;Ljava/util/List;)Lnet/minecraft/world/level/chunk/Palette;", cancellable = true)
    private void createPalette_37761209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(37761209L))
            info.setReturnValue(null);
    }


}
