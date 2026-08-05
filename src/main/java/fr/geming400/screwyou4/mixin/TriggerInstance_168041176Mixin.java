package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.StartRidingTrigger.TriggerInstance.class)
public class TriggerInstance_168041176Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1553553434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1553553434L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__967418800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-967418800L))
            info.setReturnValue("JM'ti;+to<j?Tg9\"stS");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_206303917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(206303917L))
            info.setReturnValue(-917971864);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_413502597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(413502597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerStartsRiding(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerStartsRiding__1534943261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1534943261L))
            info.setReturnValue(null);
    }


}
