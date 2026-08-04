package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.advancements.packs.VanillaTheEndAdvancements.class)
public class VanillaTheEndAdvancements824539690Mixin {
        @Inject(at = @At("HEAD"), method = "generate(Lnet/minecraft/core/HolderLookup$Provider;Ljava/util/function/Consumer;)V", cancellable = true)
    private void generate__1806560469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1806560469L))
            info.cancel();
    }


}
