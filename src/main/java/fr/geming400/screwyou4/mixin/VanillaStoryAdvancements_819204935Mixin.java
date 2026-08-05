package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.advancements.packs.VanillaStoryAdvancements.class)
public class VanillaStoryAdvancements_819204935Mixin {
        @Inject(at = @At("HEAD"), method = "generate(Lnet/minecraft/core/HolderLookup$Provider;Ljava/util/function/Consumer;)V", cancellable = true)
    private void generate_1923682876(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1923682876L))
            info.cancel();
    }


}
