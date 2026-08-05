package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.IdentifierPattern.class)
public class IdentifierPattern_1074832711Mixin {
        @Inject(at = @At("HEAD"), method = "locationPredicate()Ljava/util/function/Predicate;", cancellable = true)
    private void locationPredicate_424947732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(424947732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pathPredicate()Ljava/util/function/Predicate;", cancellable = true)
    private void pathPredicate_424947732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(424947732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "namespacePredicate()Ljava/util/function/Predicate;", cancellable = true)
    private void namespacePredicate_424947732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(424947732L))
            info.setReturnValue(null);
    }


}
