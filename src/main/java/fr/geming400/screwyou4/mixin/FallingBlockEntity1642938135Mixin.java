package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.item.FallingBlockEntity.class)
public class FallingBlockEntity1642938135Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1513254477(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1513254477L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_827650778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(827650778L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPickable()Z", cancellable = true)
    private void isPickable_90403753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90403753L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "causeFallDamage(DFLnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void causeFallDamage__1343921992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1343921992L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState__41855105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-41855105L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAttackable()Z", cancellable = true)
    private void isAttackable__1811211294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1811211294L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "displayFireAnimation()Z", cancellable = true)
    private void displayFireAnimation_25976834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(25976834L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket__1640368444(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1640368444L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillCrashReportCategory(Lnet/minecraft/CrashReportCategory;)V", cancellable = true)
    private void fillCrashReportCategory__954581614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-954581614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAddEntityPacket(Lnet/minecraft/server/level/ServerEntity;)Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getAddEntityPacket_1489396693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1489396693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fall(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/entity/item/FallingBlockEntity;", cancellable = true)
    private static void fall__1778232102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1778232102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disableDrop()V", cancellable = true)
    private void disableDrop__1454254541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1454254541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setHurtsEntities(FI)V", cancellable = true)
    private void setHurtsEntities_540595402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(540595402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStartPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getStartPos_93443472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(93443472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setStartPos(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setStartPos_653412274(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(653412274L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "callOnBrokenAfterFall(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void callOnBrokenAfterFall__677222287(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-677222287L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teleport(Lnet/minecraft/world/level/portal/TeleportTransition;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void teleport_654688888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(654688888L))
            info.setReturnValue(null);
    }


}
