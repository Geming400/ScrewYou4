package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.advancements.packs.VanillaHusbandryAdvancements.class)
public class VanillaHusbandryAdvancements1560304582Mixin {
        @Inject(at = @At("HEAD"), method = "generate(Lnet/minecraft/core/HolderLookup$Provider;Ljava/util/function/Consumer;)V", cancellable = true)
    private void generate__1630184772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1630184772L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBreedAllAnimalsAdvancement(Lnet/minecraft/advancements/AdvancementHolder;Ljava/util/function/Consumer;Lnet/minecraft/core/HolderGetter;Ljava/util/stream/Stream;Ljava/util/stream/Stream;)Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private static void createBreedAllAnimalsAdvancement_661098357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(661098357L))
            info.setReturnValue(null);
    }


}
