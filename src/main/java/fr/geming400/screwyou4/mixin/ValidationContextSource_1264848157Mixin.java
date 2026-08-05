package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.ValidationContextSource.class)
public class ValidationContextSource_1264848157Mixin {
        @Inject(at = @At("HEAD"), method = "context(Lnet/minecraft/util/context/ContextKeySet;)Lnet/minecraft/world/level/storage/loot/ValidationContext;", cancellable = true)
    private void context_41177092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(41177092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityContext()Lnet/minecraft/world/level/storage/loot/ValidationContext;", cancellable = true)
    private void entityContext__606785705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-606785705L))
            info.setReturnValue(null);
    }


}
