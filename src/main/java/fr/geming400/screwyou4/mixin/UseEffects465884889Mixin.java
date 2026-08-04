package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.UseEffects.class)
public class UseEffects465884889Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1851397148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1851397148L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__669575086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-669575086L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_504147631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504147631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "speedMultiplier()F", cancellable = true)
    private void speedMultiplier_504144252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504144252L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSprint()Z", cancellable = true)
    private void canSprint_504163472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504163472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "interactVibrations()Z", cancellable = true)
    private void interactVibrations_504163472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504163472L))
            info.setReturnValue(null);
    }


}
