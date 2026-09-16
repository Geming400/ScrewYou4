package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.sheep.Sheep.class)
public class Sheep_103512659Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1770219891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1770219891L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "setColor(Lnet/minecraft/world/item/DyeColor;)V", cancellable = true)
    private void setColor__1128640193(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1128640193L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1734810225(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1734810225L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_857260774(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(857260774L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1478614648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1478614648L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_1098723950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1098723950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor_731503819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(731503819L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.GRAY);
    }

    @Inject(at = @At("HEAD"), method = "shear(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/sounds/SoundSource;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void shear__171129066(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-171129066L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/sheep/Sheep;", cancellable = true)
    private void getBreedOffspring_768802121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(768802121L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_243396758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243396758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract_2112668186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2112668186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ate()V", cancellable = true)
    private void ate_158454195(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(158454195L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readyForShearing()Z", cancellable = true)
    private void readyForShearing__431789374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-431789374L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isSheared()Z", cancellable = true)
    private void isSheared_661656851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(661656851L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setSheared(Z)V", cancellable = true)
    private void setSheared__553592563(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-553592563L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeadEatPositionScale(F)F", cancellable = true)
    private void getHeadEatPositionScale__22502582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-22502582L))
            info.setReturnValue(6.834067E8F);
    }

    @Inject(at = @At("HEAD"), method = "getHeadEatAngleScale(F)F", cancellable = true)
    private void getHeadEatAngleScale_383170340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(383170340L))
            info.setReturnValue(6.834067E8F);
    }

    @Inject(at = @At("HEAD"), method = "getRandomSheepColor(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void getRandomSheepColor_1781464568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781464568L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.PURPLE);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_79386246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(79386246L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_853610967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(853610967L))
            info.setReturnValue(null);
    }


}
