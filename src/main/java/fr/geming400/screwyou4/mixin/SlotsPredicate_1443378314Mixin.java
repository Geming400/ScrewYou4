package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.SlotsPredicate.class)
public class SlotsPredicate_1443378314Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_534752045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(534752045L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2081165458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2081165458L))
            info.setReturnValue("([\uB330F*ew\u152C\uCC37\u1E7ETD>63.\u777BA\"3p");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2000730404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2000730404L))
            info.setReturnValue(-162202904);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/SlotProvider;)Z", cancellable = true)
    private void matches_1523938464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1523938464L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "slots()Ljava/util/Map;", cancellable = true)
    private void slots_1999265564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1999265564L))
            info.setReturnValue(null);
    }


}
