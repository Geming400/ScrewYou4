package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.CriteriaTriggers.class)
public class CriteriaTriggers914457376Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/advancements/triggers/CriterionTrigger;", cancellable = true)
    private static void bootstrap_1538442533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1538442533L))
            info.setReturnValue(null);
    }


}
