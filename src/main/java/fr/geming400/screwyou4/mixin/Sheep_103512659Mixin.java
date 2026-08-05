package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.sheep.Sheep.class)
public class Sheep_103512659Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__59579747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-59579747L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "setColor(Lnet/minecraft/world/item/DyeColor;)V", cancellable = true)
    private void setColor__621685218(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-621685218L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSheared(Z)V", cancellable = true)
    private void setSheared_1333129487(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1333129487L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSheared()Z", cancellable = true)
    private void isSheared_141791241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141791241L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor_1538820888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1538820888L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.LIGHT_BLUE);
    }

    @Inject(at = @At("HEAD"), method = "shear(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/sounds/SoundSource;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void shear_581135767(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(581135767L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readyForShearing()Z", cancellable = true)
    private void readyForShearing_141791241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141791241L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1310964983(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1310964983L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__596705787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-596705787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1139133386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1139133386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ate()V", cancellable = true)
    private void ate_141787397(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(141787397L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract_1720338500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1720338500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/sheep/Sheep;", cancellable = true)
    private void getBreedOffspring_484464299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484464299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1701301240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701301240L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_141787397(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(141787397L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRandomSheepColor(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void getRandomSheepColor__1618662663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1618662663L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.RED);
    }

    @Inject(at = @At("HEAD"), method = "getHeadEatPositionScale(F)F", cancellable = true)
    private void getHeadEatPositionScale_1314643691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1314643691L))
            info.setReturnValue(2.279397E8F);
    }

    @Inject(at = @At("HEAD"), method = "getHeadEatAngleScale(F)F", cancellable = true)
    private void getHeadEatAngleScale_1314643691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1314643691L))
            info.setReturnValue(2.279397E8F);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1838047790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1838047790L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1952244596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952244596L))
            info.setReturnValue(null);
    }


}
