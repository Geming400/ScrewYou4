package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.advancements.AdvancementProvider.class)
public class AdvancementProvider2145991267Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_1010530796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1010530796L))
            info.setReturnValue("A? (\"hﺩ=卲'AyI潹Vh잨J3&lz$yd\"r;滿H?B*%LzgE%<3Bui");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run__1422453571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1422453571L))
            info.setReturnValue(null);
    }


}
