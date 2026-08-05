package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.feline.Cat.class)
public class Cat_1422725592Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1259633186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1259633186L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1461000330(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1461000330L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getVariant__1323365933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1323365933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isLyingOnTopOfSleepingPlayer()Z", cancellable = true)
    private void isLyingOnTopOfSleepingPlayer_1461004174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1461004174L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isLying()Z", cancellable = true)
    private void isLying_1461004174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1461004174L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setLying(Z)V", cancellable = true)
    private void setLying__1642624876(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1642624876L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hiss()V", cancellable = true)
    private void hiss_1461000330(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1461000330L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCollarColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getCollarColor__1436933475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1436933475L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.BLACK);
    }

    @Inject(at = @At("HEAD"), method = "getRelaxStateOneAmount(F)F", cancellable = true)
    private void getRelaxStateOneAmount__1661110672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1661110672L))
            info.setReturnValue(1.692218E8F);
    }

    @Inject(at = @At("HEAD"), method = "getLieDownAmount(F)F", cancellable = true)
    private void getLieDownAmount__1661110672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1661110672L))
            info.setReturnValue(1.692218E8F);
    }

    @Inject(at = @At("HEAD"), method = "getLieDownAmountTail(F)F", cancellable = true)
    private void getLieDownAmountTail__1661110672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1661110672L))
            info.setReturnValue(1.692218E8F);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1023509767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1023509767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSteppingCarefully()Z", cancellable = true)
    private void isSteppingCarefully_1461004174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1461004174L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_722507146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(722507146L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_180079547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(180079547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAmbientSoundInterval()I", cancellable = true)
    private void getAmbientSoundInterval_1460987837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1460987837L))
            info.setReturnValue(1370143393);
    }

    @Inject(at = @At("HEAD"), method = "customServerAiStep(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void customServerAiStep_444316251(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(444316251L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway__1662938494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1662938494L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1255415863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1255415863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/feline/Cat;", cancellable = true)
    private void getBreedOffspring_792343695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792343695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__1274453123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274453123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canMate(Lnet/minecraft/world/entity/animal/Animal;)Z", cancellable = true)
    private void canMate_1984789097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1984789097L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__1137706573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1137706573L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setTame(ZZ)V", cancellable = true)
    private void setTame_929241546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(929241546L))
            info.cancel();
    }


}
