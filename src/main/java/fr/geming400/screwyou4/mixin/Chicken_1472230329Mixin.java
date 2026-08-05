package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.chicken.Chicken.class)
public class Chicken_1472230329Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__1156029735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1156029735L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getVariant__993897083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-993897083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setVariant(Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void setVariant_301570045(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(301570045L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1447634978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1447634978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1827525676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1827525676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__1191439401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1191439401L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/chicken/Chicken;", cancellable = true)
    private void getBreedOffspring__1398692869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1398692869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1612114428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1612114428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway_813700618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813700618L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1448103916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448103916L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setChickenJockey(Z)V", cancellable = true)
    private void setChickenJockey_1517024809(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1517024809L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isChickenJockey()Z", cancellable = true)
    private void isChickenJockey_1868817923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868817923L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__2072638659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2072638659L))
            info.setReturnValue(null);
    }


}
