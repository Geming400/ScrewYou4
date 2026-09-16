package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.feline.Ocelot.class)
public class Ocelot_345224898Mixin {
        @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1720326887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1720326887L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_1340436189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1340436189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1098973013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1098973013L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSteppingCarefully()Z", cancellable = true)
    private void isSteppingCarefully_1417014375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1417014375L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnObstruction(Lnet/minecraft/world/level/LevelReader;)Z", cancellable = true)
    private void checkSpawnObstruction_1176707377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1176707377L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset_1885407840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1885407840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1940586871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1940586871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/feline/Ocelot;", cancellable = true)
    private void getBreedOffspring_69723843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(69723843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_485108997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(485108997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAmbientSoundInterval()I", cancellable = true)
    private void getAmbientSoundInterval_166103093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(166103093L))
            info.setReturnValue(-380764220);
    }

    @Inject(at = @At("HEAD"), method = "customServerAiStep(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void customServerAiStep__1883560451(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1883560451L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway__313304813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-313304813L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_321098485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(321098485L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkOcelotSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkOcelotSpawnRules__974940529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-974940529L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1095323206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1095323206L))
            info.setReturnValue(null);
    }


}
