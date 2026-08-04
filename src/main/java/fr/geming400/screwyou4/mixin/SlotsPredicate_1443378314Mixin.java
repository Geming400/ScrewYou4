package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.SlotsPredicate.class)
public class SlotsPredicate_1443378314Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1466076724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1466076724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_307918338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(307918338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1481641055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1481641055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/SlotProvider;)Z", cancellable = true)
    private void matches_1734937773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1734937773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slots()Ljava/util/Map;", cancellable = true)
    private void slots__561245327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-561245327L))
            info.setReturnValue(null);
    }


}
