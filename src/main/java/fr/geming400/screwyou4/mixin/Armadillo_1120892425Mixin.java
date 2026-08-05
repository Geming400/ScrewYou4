package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.armadillo.Armadillo.class)
public class Armadillo_1120892425Mixin {
        @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/world/entity/animal/armadillo/Armadillo$ArmadilloState;", cancellable = true)
    private void getState__2094657495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2094657495L))
            info.setReturnValue(net.minecraft.world.entity.animal.armadillo.Armadillo.ArmadilloState.IDLE);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1159167163(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1159167163L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__1439539740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1439539740L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_671462093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(671462093L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__1581098014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1581098014L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__1966622547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1966622547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1528325428(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1528325428L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_420673979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(420673979L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__121753620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-121753620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAgeScale()F", cancellable = true)
    private void getAgeScale_1159151787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1159151787L))
            info.setReturnValue(8.50195E7F);
    }

    @Inject(at = @At("HEAD"), method = "rollUp()V", cancellable = true)
    private void rollUp_1159167163(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1159167163L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isScaredBy(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void isScaredBy_1442559599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442559599L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "rollOut()V", cancellable = true)
    private void rollOut_1159167163(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1159167163L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isScared()Z", cancellable = true)
    private void isScared_1159171007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1159171007L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__1576415250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1576415250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1557249030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1557249030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot_1159154670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1159154670L))
            info.setReturnValue(-2119998916);
    }

    @Inject(at = @At("HEAD"), method = "canFallInLove()Z", cancellable = true)
    private void canFallInLove_1159171007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1159171007L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldHideInShell()Z", cancellable = true)
    private void shouldHideInShell_1159171007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1159171007L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldSwitchToScaredState()Z", cancellable = true)
    private void shouldSwitchToScaredState_1159171007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1159171007L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "switchToState(Lnet/minecraft/world/entity/animal/armadillo/Armadillo$ArmadilloState;)V", cancellable = true)
    private void switchToState_1056561117(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1056561117L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "brushOffScute(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void brushOffScute_1541560637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1541560637L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkArmadilloSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkArmadilloSpawnRules_278628730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(278628730L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canStayRolledUp()Z", cancellable = true)
    private void canStayRolledUp_1159171007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1159171007L))
            info.setReturnValue(false);
    }


}
