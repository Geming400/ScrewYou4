package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.goat.Goat.class)
public class Goat_1716629463Mixin {
        @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__947040267(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947040267L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1203235844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1203235844L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__1824589718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1824589718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1583126542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1583126542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAgeScale()F", cancellable = true)
    private void getAgeScale_1080413720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1080413720L))
            info.setReturnValue(2.936058E8F);
    }

    @Inject(at = @At("HEAD"), method = "setYHeadRot(F)V", cancellable = true)
    private void setYHeadRot__1660048353(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1660048353L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_1530727536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1530727536L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "dropHorn()Z", cancellable = true)
    private void dropHorn_2018252731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2018252731L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createHorn()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void createHorn_318393753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(318393753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/goat/Goat;", cancellable = true)
    private void getBreedOffspring__1261782811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1261782811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1856513562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1856513562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__569182306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-569182306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot__2069890992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2069890992L))
            info.setReturnValue(-906689218);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1828239525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828239525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1692503050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1692503050L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkGoatSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkGoatSpawnRules__1806601143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1806601143L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setScreamingGoat(Z)V", cancellable = true)
    private void setScreamingGoat_1217306527(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1217306527L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasRightHorn()Z", cancellable = true)
    private void hasRightHorn_2130743400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2130743400L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasLeftHorn()Z", cancellable = true)
    private void hasLeftHorn_1931512105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1931512105L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isScreamingGoat()Z", cancellable = true)
    private void isScreamingGoat_710191561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(710191561L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRammingXHeadRot()F", cancellable = true)
    private void getRammingXHeadRot__1853947043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1853947043L))
            info.setReturnValue(2.946045E8F);
    }


}
