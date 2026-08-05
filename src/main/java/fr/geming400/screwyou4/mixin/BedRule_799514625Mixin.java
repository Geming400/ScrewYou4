package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.BedRule.class)
public class BedRule_799514625Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2109940413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2109940413L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__335945351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-335945351L))
            info.setReturnValue("빎o(%%-,]F삣{9i2W|y[찢!曻p$}'l괊g7Rz%[.7X;P|}zu");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_837777366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(837777366L))
            info.setReturnValue(-930590285);
    }

    @Inject(at = @At("HEAD"), method = "canSleep()Lnet/minecraft/world/attribute/BedRule$Rule;", cancellable = true)
    private void canSleep_1336074535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1336074535L))
            info.setReturnValue(net.minecraft.world.attribute.BedRule.Rule.NEVER);
    }

    @Inject(at = @At("HEAD"), method = "canSleep(Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void canSleep__205456474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-205456474L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "errorMessage()Ljava/util/Optional;", cancellable = true)
    private void errorMessage_1044976046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1044976046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSetSpawn(Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void canSetSpawn__205456474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-205456474L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canSetSpawn()Lnet/minecraft/world/attribute/BedRule$Rule;", cancellable = true)
    private void canSetSpawn_1336074535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1336074535L))
            info.setReturnValue(net.minecraft.world.attribute.BedRule.Rule.NEVER);
    }

    @Inject(at = @At("HEAD"), method = "asProblem()Lnet/minecraft/world/entity/player/Player$BedSleepingProblem;", cancellable = true)
    private void asProblem_521014465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(521014465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "explodes()Z", cancellable = true)
    private void explodes_837793207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(837793207L))
            info.setReturnValue(false);
    }


}
