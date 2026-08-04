package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.panda.Panda.class)
public class Panda_527782068Mixin {
        @Inject(at = @At("HEAD"), method = "isWeak()Z", cancellable = true)
    private void isWeak_566060650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566060650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAttributes()V", cancellable = true)
    private void setAttributes_566056806(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(566056806L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_566056806(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(566056806L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/world/entity/animal/panda/Panda$Gene;", cancellable = true)
    private void getVariant__1957321739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1957321739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "roll(Z)V", cancellable = true)
    private void roll_1757398896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1757398896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playAttackSound()V", cancellable = true)
    private void playAttackSound_566056806(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(566056806L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget__2123145518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123145518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed_566060650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566060650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__714863977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-714863977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_78351736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(78351736L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEating()Z", cancellable = true)
    private void isEating_566060650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566060650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSneezing()Z", cancellable = true)
    private void isSneezing_566060650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566060650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isScared()Z", cancellable = true)
    private void isScared_566060650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566060650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sit(Z)V", cancellable = true)
    private void sit_1757398896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1757398896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSitting()Z", cancellable = true)
    private void isSitting_566060650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566060650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1918453291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1918453291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAggressive()Z", cancellable = true)
    private void isAggressive_566060650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566060650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__172436378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-172436378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSneezeCounter()I", cancellable = true)
    private void getSneezeCounter_566044313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566044313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSitAmount(F)F", cancellable = true)
    private void getSitAmount_1738913100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1738913100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUnhappyCounter()I", cancellable = true)
    private void getUnhappyCounter_566044313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566044313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLieOnBackAmount(F)F", cancellable = true)
    private void getLieOnBackAmount_1738913100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1738913100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRollAmount(F)F", cancellable = true)
    private void getRollAmount_1738913100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1738913100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sneeze(Z)V", cancellable = true)
    private void sneeze_1757398896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1757398896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__2032650097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2032650097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRolling()Z", cancellable = true)
    private void isRolling_566060650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566060650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "eat(Z)V", cancellable = true)
    private void eat_1757398896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1757398896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isWorried()Z", cancellable = true)
    private void isWorried_566060650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566060650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOnBack()Z", cancellable = true)
    private void isOnBack_566060650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566060650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isLazy()Z", cancellable = true)
    private void isLazy_566060650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566060650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPlayful()Z", cancellable = true)
    private void isPlayful_566060650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566060650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOnBack(Z)V", cancellable = true)
    private void setOnBack_1757398896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1757398896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBrown()Z", cancellable = true)
    private void isBrown_566060650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566060650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSneezeCounter(I)V", cancellable = true)
    private void setSneezeCounter_1741699039(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1741699039L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMainGene()Lnet/minecraft/world/entity/animal/panda/Panda$Gene;", cancellable = true)
    private void getMainGene__1957321739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1957321739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHiddenGene()Lnet/minecraft/world/entity/animal/panda/Panda$Gene;", cancellable = true)
    private void getHiddenGene__1957321739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1957321739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setHiddenGene(Lnet/minecraft/world/entity/animal/panda/Panda$Gene;)V", cancellable = true)
    private void setHiddenGene__397589719(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-397589719L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setUnhappyCounter(I)V", cancellable = true)
    private void setUnhappyCounter_1741699039(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1741699039L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMainGene(Lnet/minecraft/world/entity/animal/panda/Panda$Gene;)V", cancellable = true)
    private void setMainGene__397589719(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-397589719L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setGeneFromParents(Lnet/minecraft/world/entity/animal/panda/Panda;Lnet/minecraft/world/entity/animal/panda/Panda;)V", cancellable = true)
    private void setGeneFromParents_1232398886(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1232398886L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canPerformAction()Z", cancellable = true)
    private void canPerformAction_566060650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566060650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_2125441689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125441689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract_2144607909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2144607909L))
            info.setReturnValue(null);
    }


}
