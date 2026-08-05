package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.sniffer.Sniffer.class)
public class Sniffer_1058276819Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1096551557(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1096551557L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "jumpFromGround()V", cancellable = true)
    private void jumpFromGround_1096551557(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1096551557L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canPlayDiggingSound()Z", cancellable = true)
    private void canPlayDiggingSound_1096555401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096555401L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isSearching()Z", cancellable = true)
    private void isSearching_1096555401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096555401L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onDiggingComplete(Z)Lnet/minecraft/world/entity/animal/sniffer/Sniffer;", cancellable = true)
    private void onDiggingComplete_828608977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(828608977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1590941034(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1590941034L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_358058373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(358058373L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__184369226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-184369226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot_1096539064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096539064L))
            info.setReturnValue(2019642418);
    }

    @Inject(at = @At("HEAD"), method = "onPathfindingDone()V", cancellable = true)
    private void onPathfindingDone_1096551557(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1096551557L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPathfindingStart()V", cancellable = true)
    private void onPathfindingStart_1096551557(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1096551557L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnChildFromBreeding(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/animal/Animal;)V", cancellable = true)
    private void spawnChildFromBreeding__712168463(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-712168463L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "transitionTo(Lnet/minecraft/world/entity/animal/sniffer/Sniffer$State;)Lnet/minecraft/world/entity/animal/sniffer/Sniffer;", cancellable = true)
    private void transitionTo__1785204190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1785204190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1619864636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1619864636L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__1639030856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1639030856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBabyStartAge()I", cancellable = true)
    private void getBabyStartAge_1096539064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096539064L))
            info.setReturnValue(2019642418);
    }

    @Inject(at = @At("HEAD"), method = "die(Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void die_726603358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(726603358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__1643713620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643713620L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "supportQuadLeash()Z", cancellable = true)
    private void supportQuadLeash_1096555401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096555401L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getQuadLeashOffsets()[Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getQuadLeashOffsets_24111218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(24111218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canMate(Lnet/minecraft/world/entity/animal/Animal;)Z", cancellable = true)
    private void canMate_1620340324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620340324L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isTempted()Z", cancellable = true)
    private void isTempted_1096555401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096555401L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__1502155346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502155346L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canSniff()Z", cancellable = true)
    private void canSniff_1096555401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096555401L))
            info.setReturnValue(true);
    }


}
