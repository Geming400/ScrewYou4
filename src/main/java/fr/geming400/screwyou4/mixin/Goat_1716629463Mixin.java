package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.goat.Goat.class)
public class Goat_1716629463Mixin {
        @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1754904201(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1754904201L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__985360976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-985360976L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__729605896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-729605896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setYHeadRot(F)V", cancellable = true)
    private void setYHeadRot__1367191425(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1367191425L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__1370885509(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1370885509L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1016411017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1016411017L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_473983418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(473983418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAgeScale()F", cancellable = true)
    private void getAgeScale_1754888825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754888825L))
            info.setReturnValue(1.122881E8F);
    }

    @Inject(at = @At("HEAD"), method = "dropHorn()Z", cancellable = true)
    private void dropHorn_1754908045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754908045L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createHorn()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void createHorn__2054919174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2054919174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot_1754891708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754891708L))
            info.setReturnValue(518638521);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__961511992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961511992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/goat/Goat;", cancellable = true)
    private void getBreedOffspring__1060961593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1060961593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__980549252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-980549252L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__843802702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-843802702L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasRightHorn()Z", cancellable = true)
    private void hasRightHorn_1754908045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754908045L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRammingXHeadRot()F", cancellable = true)
    private void getRammingXHeadRot_1754888825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754888825L))
            info.setReturnValue(1.122881E8F);
    }

    @Inject(at = @At("HEAD"), method = "hasLeftHorn()Z", cancellable = true)
    private void hasLeftHorn_1754908045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754908045L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setScreamingGoat(Z)V", cancellable = true)
    private void setScreamingGoat__1348721005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1348721005L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkGoatSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkGoatSpawnRules_874365768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874365768L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isScreamingGoat()Z", cancellable = true)
    private void isScreamingGoat_1754908045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754908045L))
            info.setReturnValue(true);
    }


}
