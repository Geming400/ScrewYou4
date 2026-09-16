package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.Criterion.class)
public class Criterion1627358275Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_718732007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(718732007L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1897185496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1897185496L))
            info.setReturnValue("\uD6492\u58DF(\uC306m\u5B07rm,D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2110256930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110256930L))
            info.setReturnValue(44749558);
    }

    @Inject(at = @At("HEAD"), method = "trigger()Lnet/minecraft/advancements/triggers/CriterionTrigger;", cancellable = true)
    private void trigger_1952627750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952627750L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerInstance()Lnet/minecraft/advancements/CriterionTriggerInstance;", cancellable = true)
    private void triggerInstance_1661895622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1661895622L))
            info.setReturnValue(null);
    }


}
