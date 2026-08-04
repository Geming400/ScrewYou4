package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.feline.Ocelot.class)
public class Ocelot_345224898Mixin {
        @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1552677222(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1552677222L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSteppingCarefully()Z", cancellable = true)
    private void isSteppingCarefully_383503480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(383503480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__897421147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-897421147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__2101010461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2101010461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__354993548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-354993548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset_1442954426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442954426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnObstruction(Lnet/minecraft/world/level/LevelReader;)Z", cancellable = true)
    private void checkSpawnObstruction_1382379108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1382379108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_2079760029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2079760029L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1943013479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1943013479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/feline/Ocelot;", cancellable = true)
    private void getBreedOffspring_1698983845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698983845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract_1962050739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1962050739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customServerAiStep(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void customServerAiStep__633184443(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-633184443L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAmbientSoundInterval()I", cancellable = true)
    private void getAmbientSoundInterval_383487143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(383487143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway_1554528108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1554528108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkOcelotSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkOcelotSpawnRules__497038797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-497038797L))
            info.setReturnValue(null);
    }


}
