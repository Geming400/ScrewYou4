package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.ValidationContextSource.class)
public class ValidationContextSource_1264848157Mixin {
        @Inject(at = @At("HEAD"), method = "context(Lnet/minecraft/util/context/ContextKeySet;)Lnet/minecraft/world/level/storage/loot/ValidationContext;", cancellable = true)
    private void context__968512171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968512171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityContext()Lnet/minecraft/world/level/storage/loot/ValidationContext;", cancellable = true)
    private void entityContext__638740469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-638740469L))
            info.setReturnValue(null);
    }


}
