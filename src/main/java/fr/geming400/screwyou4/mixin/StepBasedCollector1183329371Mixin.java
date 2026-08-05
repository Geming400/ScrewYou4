package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.InsideBlockEffectApplier.StepBasedCollector.class)
public class StepBasedCollector1183329371Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/entity/InsideBlockEffectType;)V", cancellable = true)
    private void apply_547014524(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(547014524L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyAndClear(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void applyAndClear_731604711(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(731604711L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "advanceStep(I)V", cancellable = true)
    private void advanceStep__1897720953(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1897720953L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runAfter(Lnet/minecraft/world/entity/InsideBlockEffectType;Ljava/util/function/Consumer;)V", cancellable = true)
    private void runAfter__2130750710(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2130750710L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runBefore(Lnet/minecraft/world/entity/InsideBlockEffectType;Ljava/util/function/Consumer;)V", cancellable = true)
    private void runBefore__2130750710(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2130750710L))
            info.cancel();
    }


}
