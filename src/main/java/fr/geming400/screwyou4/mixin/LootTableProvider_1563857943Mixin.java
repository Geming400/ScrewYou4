package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.LootTableProvider.class)
public class LootTableProvider_1563857943Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__324988960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-324988960L))
            info.setReturnValue("KN8teC\u2D95ZKi^m9|3[%\u5193)>NDseGt/D%i@J,8o`D]\uB326z7+\u15E0E6*7|V=\u567CG:\u90E53q!pm!rm)q\uD3037ao`ENSt3\uCBECV}L^");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1663583685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1663583685L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
