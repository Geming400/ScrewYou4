package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.cow.MushroomCow.class)
public class MushroomCow2131169381Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__497090682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-497090682L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/world/entity/animal/cow/MushroomCow$Variant;", cancellable = true)
    private void getVariant_1915850338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915850338L))
            info.setReturnValue(net.minecraft.world.entity.animal.cow.MushroomCow.Variant.BROWN);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1168586623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1168586623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shear(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/sounds/SoundSource;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void shear_1856527657(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1856527657L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "thunderHit(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LightningBolt;)V", cancellable = true)
    private void thunderHit_1230096581(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1230096581L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue_590183199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(590183199L))
            info.setReturnValue(6.865802E8F);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__154642387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-154642387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__2023913815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023913815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/cow/MushroomCow;", cancellable = true)
    private void getBreedOffspring__8649740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-8649740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readyForShearing()Z", cancellable = true)
    private void readyForShearing_1595867349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1595867349L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkMushroomSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkMushroomSpawnRules__2103207045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2103207045L))
            info.setReturnValue(false);
    }


}
