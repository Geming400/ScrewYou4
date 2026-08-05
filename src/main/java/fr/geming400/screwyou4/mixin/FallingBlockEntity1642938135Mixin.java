package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.item.FallingBlockEntity.class)
public class FallingBlockEntity1642938135Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1681212874(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1681212874L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState__652820731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-652820731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_1193508300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1193508300L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "teleport(Lnet/minecraft/world/level/portal/TeleportTransition;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void teleport_1209057741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1209057741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "causeFallDamage(DFLnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void causeFallDamage_1164797157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164797157L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fillCrashReportCategory(Lnet/minecraft/CrashReportCategory;)V", cancellable = true)
    private void fillCrashReportCategory__334683076(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-334683076L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "displayFireAnimation()Z", cancellable = true)
    private void displayFireAnimation_1681216718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681216718L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isAttackable()Z", cancellable = true)
    private void isAttackable_1681216718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681216718L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getAddEntityPacket(Lnet/minecraft/server/level/ServerEntity;)Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getAddEntityPacket_2022965119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022965119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket_454149445(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(454149445L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fall(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/entity/item/FallingBlockEntity;", cancellable = true)
    private static void fall__956070817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-956070817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPickable()Z", cancellable = true)
    private void isPickable_1681216718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681216718L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setStartPos(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setStartPos_1811704734(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1811704734L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "callOnBrokenAfterFall(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void callOnBrokenAfterFall__933166250(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-933166250L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStartPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getStartPos__250448744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-250448744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disableDrop()V", cancellable = true)
    private void disableDrop_1681212874(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1681212874L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setHurtsEntities(FI)V", cancellable = true)
    private void setHurtsEntities_561171213(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(561171213L))
            info.cancel();
    }


}
