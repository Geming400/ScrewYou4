package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.RandomSequences.class)
public class RandomSequences_523604639Mixin {
        @Inject(at = @At("HEAD"), method = "reset(Lnet/minecraft/resources/Identifier;J)V", cancellable = true)
    private void reset_1468892611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1468892611L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reset(Lnet/minecraft/resources/Identifier;JIZZ)V", cancellable = true)
    private void reset_1437902616(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1437902616L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;J)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void get__897815587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-897815587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()I", cancellable = true)
    private void clear_561866884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561866884L))
            info.setReturnValue(168796075);
    }

    @Inject(at = @At("HEAD"), method = "forAllSequences(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forAllSequences__1214546252(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1214546252L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSeedDefaults(IZZ)V", cancellable = true)
    private void setSeedDefaults_245907658(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(245907658L))
            info.cancel();
    }


}
