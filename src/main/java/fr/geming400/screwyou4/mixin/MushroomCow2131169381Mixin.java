package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.cow.MushroomCow.class)
public class MushroomCow2131169381Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1968076976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1968076976L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/world/entity/animal/cow/MushroomCow$Variant;", cancellable = true)
    private void getVariant__968546159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968546159L))
            info.setReturnValue(net.minecraft.world.entity.animal.cow.MushroomCow.Variant.BROWN);
    }

    @Inject(at = @At("HEAD"), method = "thunderHit(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LightningBolt;)V", cancellable = true)
    private void thunderHit_1201149364(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1201149364L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_888523337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(888523337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shear(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/sounds/SoundSource;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void shear__1686174806(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1686174806L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/cow/MushroomCow;", cancellable = true)
    private void getBreedOffspring__1952850858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1952850858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__566009333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-566009333L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue__1949486944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1949486944L))
            info.setReturnValue(4.415302E8F);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__546972073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-546972073L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readyForShearing()Z", cancellable = true)
    private void readyForShearing__2125519332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2125519332L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkMushroomSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkMushroomSpawnRules_1288905687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1288905687L))
            info.setReturnValue(false);
    }


}
