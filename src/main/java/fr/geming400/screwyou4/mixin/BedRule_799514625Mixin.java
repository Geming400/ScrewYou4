package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.BedRule.class)
public class BedRule_799514625Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__109111644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-109111644L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1569938149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1569938149L))
            info.setReturnValue("ei|H*w\u7892N4W_q\u6AD36NE+D\u9725R!c: ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1356866715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1356866715L))
            info.setReturnValue(-450499408);
    }

    @Inject(at = @At("HEAD"), method = "canSetSpawn()Lnet/minecraft/world/attribute/BedRule$Rule;", cancellable = true)
    private void canSetSpawn_1815630672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1815630672L))
            info.setReturnValue(net.minecraft.world.attribute.BedRule.Rule.WHEN_DARK);
    }

    @Inject(at = @At("HEAD"), method = "canSetSpawn(Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void canSetSpawn_1393450255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1393450255L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "errorMessage()Ljava/util/Optional;", cancellable = true)
    private void errorMessage_1041240461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1041240461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSleep()Lnet/minecraft/world/attribute/BedRule$Rule;", cancellable = true)
    private void canSleep__1814628338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1814628338L))
            info.setReturnValue(net.minecraft.world.attribute.BedRule.Rule.NEVER);
    }

    @Inject(at = @At("HEAD"), method = "canSleep(Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void canSleep_1121072973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121072973L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "explodes()Z", cancellable = true)
    private void explodes__1700458171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1700458171L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "asProblem()Lnet/minecraft/world/entity/player/Player$BedSleepingProblem;", cancellable = true)
    private void asProblem_1635755092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1635755092L))
            info.setReturnValue(null);
    }


}
