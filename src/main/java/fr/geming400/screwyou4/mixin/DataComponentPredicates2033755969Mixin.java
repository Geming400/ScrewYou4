package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.DataComponentPredicates.class)
public class DataComponentPredicates2033755969Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/core/component/predicates/DataComponentPredicate$Type;", cancellable = true)
    private static void bootstrap_1026956852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1026956852L))
            info.setReturnValue(null);
    }


}
