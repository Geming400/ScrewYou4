package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.Criterion.class)
public class Criterion1627358275Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1282096762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1282096762L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_491898300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(491898300L))
            info.setReturnValue("1JWX鑶D幏\"!萺:KaJq>-MWKMi<RBTeH)}.C?9%?tpQEt0LH2^4⤣OX85+ﰥ7mM틤䟍Zﯡ⠹CL呧OTqᛀJ資%,EX{^kD`F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1665621017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1665621017L))
            info.setReturnValue(-1692991582);
    }

    @Inject(at = @At("HEAD"), method = "trigger()Lnet/minecraft/advancements/triggers/CriterionTrigger;", cancellable = true)
    private void trigger__1851229074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1851229074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerInstance()Lnet/minecraft/advancements/CriterionTriggerInstance;", cancellable = true)
    private void triggerInstance_2081292691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2081292691L))
            info.setReturnValue(null);
    }


}
