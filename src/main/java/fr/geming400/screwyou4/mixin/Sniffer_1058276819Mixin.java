package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.sniffer.Sniffer.class)
public class Sniffer_1058276819Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_928593160(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(928593160L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "die(Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void die__1112581410(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1112581410L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1861588488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1861588488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jumpFromGround()V", cancellable = true)
    private void jumpFromGround_1580806982(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1580806982L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_2053488110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2053488110L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1765011166(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1765011166L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_872374892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872374892L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "transitionTo(Lnet/minecraft/world/entity/animal/sniffer/Sniffer$State;)Lnet/minecraft/world/entity/animal/sniffer/Sniffer;", cancellable = true)
    private void transitionTo_2033567954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2033567954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnChildFromBreeding(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/animal/Animal;)V", cancellable = true)
    private void spawnChildFromBreeding__1868638440(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1868638440L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDiggingComplete(Z)Lnet/minecraft/world/entity/animal/sniffer/Sniffer;", cancellable = true)
    private void onDiggingComplete_1795176168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1795176168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSearching()Z", cancellable = true)
    private void isSearching_1791092313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1791092313L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canPlayDiggingSound()Z", cancellable = true)
    private void canPlayDiggingSound_2136117907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2136117907L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1198031958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1198031958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1227534950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1227534950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBabyStartAge()I", cancellable = true)
    private void getBabyStartAge__1641050449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1641050449L))
            info.setReturnValue(635269237);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot_1566723660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1566723660L))
            info.setReturnValue(1507412355);
    }

    @Inject(at = @At("HEAD"), method = "onPathfindingDone()V", cancellable = true)
    private void onPathfindingDone_1504530270(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1504530270L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPathfindingStart()V", cancellable = true)
    private void onPathfindingStart__1744120920(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1744120920L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "supportQuadLeash()Z", cancellable = true)
    private void supportQuadLeash_1210549666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1210549666L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getQuadLeashOffsets()[Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getQuadLeashOffsets_903501810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(903501810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1034150406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1034150406L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canMate(Lnet/minecraft/world/entity/animal/Animal;)Z", cancellable = true)
    private void canMate_686917327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(686917327L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isTempted()Z", cancellable = true)
    private void isTempted__882077324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882077324L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canSniff()Z", cancellable = true)
    private void canSniff__1460090485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1460090485L))
            info.setReturnValue(false);
    }


}
