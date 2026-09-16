package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.UseEffects.class)
public class UseEffects465884889Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__442741379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-442741379L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1236308414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236308414L))
            info.setReturnValue("a");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1023236980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1023236980L))
            info.setReturnValue(-127460155);
    }

    @Inject(at = @At("HEAD"), method = "speedMultiplier()F", cancellable = true)
    private void speedMultiplier__1132407532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1132407532L))
            info.setReturnValue(8.214882E8F);
    }

    @Inject(at = @At("HEAD"), method = "interactVibrations()Z", cancellable = true)
    private void interactVibrations__273504263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-273504263L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canSprint()Z", cancellable = true)
    private void canSprint_1841844422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1841844422L))
            info.setReturnValue(true);
    }


}
