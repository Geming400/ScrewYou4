package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.SpawnData.CustomSpawnRules.class)
public class CustomSpawnRules_957009594Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1952445444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1952445444L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__178450382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-178450382L))
            info.setReturnValue("@\u62D4iO9\u5D09\u760FHeZ;\u2242EAC\u6793dl\uBA68\uA594#&f /to7\u648C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_995272335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(995272335L))
            info.setReturnValue(-1933901244);
    }

    @Inject(at = @At("HEAD"), method = "blockLightLimit()Lnet/minecraft/util/InclusiveRange;", cancellable = true)
    private void blockLightLimit_340018739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340018739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidPosition(Lnet/minecraft/core/BlockPos;Lnet/minecraft/server/level/ServerLevel;)Z", cancellable = true)
    private void isValidPosition_240863253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(240863253L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "skyLightLimit()Lnet/minecraft/util/InclusiveRange;", cancellable = true)
    private void skyLightLimit_340018739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340018739L))
            info.setReturnValue(null);
    }


}
