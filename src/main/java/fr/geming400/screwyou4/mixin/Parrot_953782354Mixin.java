package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.parrot.Parrot.class)
public class Parrot_953782354Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__1674477710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1674477710L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/world/entity/animal/parrot/Parrot$Variant;", cancellable = true)
    private void getVariant__217132434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-217132434L))
            info.setReturnValue(net.minecraft.world.entity.animal.parrot.Parrot.Variant.GRAY);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1966082953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1966082953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVoicePitch()F", cancellable = true)
    private void getVoicePitch_1695144016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1695144016L))
            info.setReturnValue(8.450638E8F);
    }

    @Inject(at = @At("HEAD"), method = "setRecordPlayingNearby(Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void setRecordPlayingNearby__1416300096(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1416300096L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_138494500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(138494500L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPitch(Lnet/minecraft/util/RandomSource;)F", cancellable = true)
    private static void getPitch__2059252842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2059252842L))
            info.setReturnValue(8.450638E8F);
    }

    @Inject(at = @At("HEAD"), method = "isPushable()Z", cancellable = true)
    private void isPushable__1441636854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1441636854L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__1826927744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1826927744L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.AMBIENT);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__1801002000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1801002000L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__1709887376(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1709887376L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1332029415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1332029415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1093537493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1093537493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAmbientSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getAmbientSound__771139386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-771139386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "imitateNearbyMobs(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private static void imitateNearbyMobs__2108981675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2108981675L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_929655941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(929655941L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canMate(Lnet/minecraft/world/entity/animal/Animal;)Z", cancellable = true)
    private void canMate_582422862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(582422862L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFlying()Z", cancellable = true)
    private void isFlying_1670754639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670754639L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getAmbient(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;)Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private static void getAmbient_1954753114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1954753114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPartyParrot()Z", cancellable = true)
    private void isPartyParrot_32086198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(32086198L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkParrotSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkParrotSpawnRules__956776087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-956776087L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1703880662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703880662L))
            info.setReturnValue(null);
    }


}
