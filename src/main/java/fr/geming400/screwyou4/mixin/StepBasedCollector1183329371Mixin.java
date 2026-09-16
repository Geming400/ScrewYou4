package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.InsideBlockEffectApplier.StepBasedCollector.class)
public class StepBasedCollector1183329371Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/entity/InsideBlockEffectType;)V", cancellable = true)
    private void apply__865107890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-865107890L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyAndClear(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void applyAndClear_855918379(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(855918379L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "advanceStep(I)V", cancellable = true)
    private void advanceStep__201057419(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-201057419L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runBefore(Lnet/minecraft/world/entity/InsideBlockEffectType;Ljava/util/function/Consumer;)V", cancellable = true)
    private void runBefore__1789887500(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1789887500L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runAfter(Lnet/minecraft/world/entity/InsideBlockEffectType;Ljava/util/function/Consumer;)V", cancellable = true)
    private void runAfter__1954950501(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1954950501L))
            info.cancel();
    }


}
