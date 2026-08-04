package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.registries.RegistryPatchGenerator.class)
public class RegistryPatchGenerator_2101544484Mixin {
        @Inject(at = @At("HEAD"), method = "createLookup(Ljava/util/concurrent/CompletableFuture;Lnet/minecraft/core/RegistrySetBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void createLookup_1040954545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1040954545L))
            info.setReturnValue(null);
    }


}
