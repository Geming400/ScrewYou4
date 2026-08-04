package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.advancements.packs.VanillaHusbandryAdvancements.class)
public class VanillaHusbandryAdvancements1560304582Mixin {
        @Inject(at = @At("HEAD"), method = "generate(Lnet/minecraft/core/HolderLookup$Provider;Ljava/util/function/Consumer;)V", cancellable = true)
    private void generate__1070795577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1070795577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBreedAllAnimalsAdvancement(Lnet/minecraft/advancements/AdvancementHolder;Ljava/util/function/Consumer;Lnet/minecraft/core/HolderGetter;Ljava/util/stream/Stream;Ljava/util/stream/Stream;)Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private static void createBreedAllAnimalsAdvancement__651689853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-651689853L))
            info.setReturnValue(null);
    }


}
