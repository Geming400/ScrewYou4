package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.parrot.Parrot.class)
public class Parrot_953782354Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_790689948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(790689948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/world/entity/animal/parrot/Parrot$Variant;", cancellable = true)
    private void getVariant_240200797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(240200797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPartyParrot()Z", cancellable = true)
    private void isPartyParrot_992060936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(992060936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__1339265620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1339265620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVoicePitch()F", cancellable = true)
    private void getVoicePitch_992041716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(992041716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRecordPlayingNearby(Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void setRecordPlayingNearby_1933679546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1933679546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFlying()Z", cancellable = true)
    private void isFlying_992060936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(992060936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_992057092(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(992057092L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_504352022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504352022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPitch(Lnet/minecraft/util/RandomSource;)F", cancellable = true)
    private static void getPitch__753247860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-753247860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPushable()Z", cancellable = true)
    private void isPushable_992060936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(992060936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1492453005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1492453005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_253563908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253563908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset_2051511882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2051511882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "imitateNearbyMobs(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private static void imitateNearbyMobs_1404245642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1404245642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAmbient(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;)Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private static void getAmbient_2144260860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2144260860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__1606649811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1606649811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canMate(Lnet/minecraft/world/entity/animal/Animal;)Z", cancellable = true)
    private void canMate_1515845859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1515845859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAmbientSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getAmbientSound_2043995251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2043995251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__1743525321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1743525321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1724359101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1724359101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkParrotSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkParrotSpawnRules_111518659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(111518659L))
            info.setReturnValue(null);
    }


}
