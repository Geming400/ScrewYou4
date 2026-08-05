package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.CommonPlayerSpawnInfo.class)
public class CommonPlayerSpawnInfo_741118625Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2126630883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126630883L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__394341351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-394341351L))
            info.setReturnValue("@j荇b#/fjH#+IaL.U}덗V;1kyd;#&NcyW.6A4NJQ,0M0X딂搐");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_779381366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779381366L))
            info.setReturnValue(1184371791);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/RegistryFriendlyByteBuf;)V", cancellable = true)
    private void write__1541788420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1541788420L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDebug()Z", cancellable = true)
    private void isDebug_779397207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779397207L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "seed()J", cancellable = true)
    private void seed_779381831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779381831L))
            info.setReturnValue(2301981300081267324L);
    }

    @Inject(at = @At("HEAD"), method = "dimension()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void dimension_1549609937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1549609937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dimensionType()Lnet/minecraft/core/Holder;", cancellable = true)
    private void dimensionType__2004972900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2004972900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "portalCooldown()I", cancellable = true)
    private void portalCooldown_779380870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779380870L))
            info.setReturnValue(1461390999);
    }

    @Inject(at = @At("HEAD"), method = "lastDeathLocation()Ljava/util/Optional;", cancellable = true)
    private void lastDeathLocation_986580046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(986580046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameType()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void gameType__654327674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-654327674L))
            info.setReturnValue(net.minecraft.world.level.GameType.ADVENTURE);
    }

    @Inject(at = @At("HEAD"), method = "isFlat()Z", cancellable = true)
    private void isFlat_779397207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779397207L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "seaLevel()I", cancellable = true)
    private void seaLevel_779380870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779380870L))
            info.setReturnValue(1461390999);
    }

    @Inject(at = @At("HEAD"), method = "previousGameType()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void previousGameType__654327674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-654327674L))
            info.setReturnValue(net.minecraft.world.level.GameType.ADVENTURE);
    }


}
