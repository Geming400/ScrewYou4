package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.clock.ClockState.class)
public class ClockState_50017439Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1435529697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1435529697L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1085442537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1085442537L))
            info.setReturnValue("#tiOlꃯ:jDQb)W_3506'Y?G/i1,ZX䦶r*Jf`5놲ER4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_88280180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(88280180L))
            info.setReturnValue(-243235971);
    }

    @Inject(at = @At("HEAD"), method = "rate()F", cancellable = true)
    private void rate_88276801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(88276801L))
            info.setReturnValue(1.001022E8F);
    }

    @Inject(at = @At("HEAD"), method = "partialTick()F", cancellable = true)
    private void partialTick_88276801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(88276801L))
            info.setReturnValue(1.001022E8F);
    }

    @Inject(at = @At("HEAD"), method = "paused()Z", cancellable = true)
    private void paused_88296021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(88296021L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "totalTicks()J", cancellable = true)
    private void totalTicks_88280645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(88280645L))
            info.setReturnValue(-2295910740283413091L);
    }


}
