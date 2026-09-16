package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.RandomSequences.class)
public class RandomSequences_523604639Mixin {
        @Inject(at = @At("HEAD"), method = "reset(Lnet/minecraft/resources/Identifier;J)V", cancellable = true)
    private void reset_322998354(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(322998354L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reset(Lnet/minecraft/resources/Identifier;JIZZ)V", cancellable = true)
    private void reset_502160937(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(502160937L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;J)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void get__1683908685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1683908685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()I", cancellable = true)
    private void clear__262235561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-262235561L))
            info.setReturnValue(683983623);
    }

    @Inject(at = @At("HEAD"), method = "forAllSequences(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forAllSequences_725328206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(725328206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSeedDefaults(IZZ)V", cancellable = true)
    private void setSeedDefaults__710886097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-710886097L))
            info.cancel();
    }


}
