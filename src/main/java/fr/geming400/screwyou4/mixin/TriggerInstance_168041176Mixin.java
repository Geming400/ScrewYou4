package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.StartRidingTrigger.TriggerInstance.class)
public class TriggerInstance_168041176Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__740585093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-740585093L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_938464700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(938464700L))
            info.setReturnValue("^H\u5220e^^d 6iZ:[-)\u9CB0[df/sYR\u14A5qY+62");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_725393266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(725393266L))
            info.setReturnValue(1439236121);
    }

    @Inject(at = @At("HEAD"), method = "playerStartsRiding(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerStartsRiding__1620708132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620708132L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__1062611866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1062611866L))
            info.setReturnValue(null);
    }


}
