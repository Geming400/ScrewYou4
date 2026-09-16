package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.feline.Cat.class)
public class Cat_1422725592Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__1205534472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1205534472L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1293041933(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1293041933L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getVariant__1043401820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1043401820L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1497139715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1497139715L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "isSteppingCarefully()Z", cancellable = true)
    private void isSteppingCarefully__1800452227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1800452227L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1877030413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1877030413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLieDownAmountTail(F)F", cancellable = true)
    private void getLieDownAmountTail_499342444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(499342444L))
            info.setReturnValue(4.627157E8F);
    }

    @Inject(at = @At("HEAD"), method = "getRelaxStateOneAmount(F)F", cancellable = true)
    private void getRelaxStateOneAmount__1127691913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127691913L))
            info.setReturnValue(4.627157E8F);
    }

    @Inject(at = @At("HEAD"), method = "getCollarColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getCollarColor__1675177843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1675177843L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.GREEN);
    }

    @Inject(at = @At("HEAD"), method = "getLieDownAmount(F)F", cancellable = true)
    private void getLieDownAmount_719220220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(719220220L))
            info.setReturnValue(4.627157E8F);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1562609691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1562609691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/feline/Cat;", cancellable = true)
    private void getBreedOffspring__1138146767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1138146767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__863086177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-863086177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAmbientSoundInterval()I", cancellable = true)
    private void getAmbientSoundInterval_1243603787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1243603787L))
            info.setReturnValue(1241837653);
    }

    @Inject(at = @At("HEAD"), method = "customServerAiStep(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void customServerAiStep__806059757(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-806059757L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway_764195881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(764195881L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setLying(Z)V", cancellable = true)
    private void setLying_284805703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(284805703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hiss()V", cancellable = true)
    private void hiss__1243118071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1243118071L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isLying()Z", cancellable = true)
    private void isLying_31480387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(31480387L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1398599179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398599179L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canMate(Lnet/minecraft/world/entity/animal/Animal;)Z", cancellable = true)
    private void canMate_1051366100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1051366100L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__2122143396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2122143396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTame(ZZ)V", cancellable = true)
    private void setTame__871520349(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-871520349L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isLyingOnTopOfSleepingPlayer()Z", cancellable = true)
    private void isLyingOnTopOfSleepingPlayer__596281728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-596281728L))
            info.setReturnValue(false);
    }


}
