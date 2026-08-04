package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.advancements.packs.VanillaAdvancementProvider.class)
public class VanillaAdvancementProvider_86937662Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/data/PackOutput;Ljava/util/concurrent/CompletableFuture;)Lnet/minecraft/data/advancements/AdvancementProvider;", cancellable = true)
    private static void create_1906465021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1906465021L))
            info.setReturnValue(null);
    }


}
