package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.panda.Panda.class)
public class Panda_527782068Mixin {
        @Inject(at = @At("HEAD"), method = "isWeak()Z", cancellable = true)
    private void isWeak_292811752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(292811752L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setAttributes()V", cancellable = true)
    private void setAttributes_811554733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(811554733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_398098409(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(398098409L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/world/entity/animal/panda/Panda$Gene;", cancellable = true)
    private void getVariant__1667582140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1667582140L))
            info.setReturnValue(net.minecraft.world.entity.animal.panda.Panda.Gene.NORMAL);
    }

    @Inject(at = @At("HEAD"), method = "roll(Z)V", cancellable = true)
    private void roll__1623181779(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1623181779L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__287505786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-287505786L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1902884057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902884057L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget_1443441213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1443441213L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "playAttackSound()V", cancellable = true)
    private void playAttackSound_534271859(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(534271859L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_1522993359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1522993359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed__1420290047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1420290047L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRollAmount(F)F", cancellable = true)
    private void getRollAmount_85707831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85707831L))
            info.setReturnValue(1.714327E8F);
    }

    @Inject(at = @At("HEAD"), method = "sit(Z)V", cancellable = true)
    private void sit__1758730802(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1758730802L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isWorried()Z", cancellable = true)
    private void isWorried_186445316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186445316L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isOnBack()Z", cancellable = true)
    private void isOnBack_369111866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(369111866L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setOnBack(Z)V", cancellable = true)
    private void setOnBack__1049415720(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1049415720L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isLazy()Z", cancellable = true)
    private void isLazy_1432231276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1432231276L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPlayful()Z", cancellable = true)
    private void isPlayful_267962507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(267962507L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isSneezing()Z", cancellable = true)
    private void isSneezing__469054627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-469054627L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBrown()Z", cancellable = true)
    private void isBrown__1961086018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1961086018L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSneezeCounter()I", cancellable = true)
    private void getSneezeCounter__64555047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-64555047L))
            info.setReturnValue(1763746013);
    }

    @Inject(at = @At("HEAD"), method = "setMainGene(Lnet/minecraft/world/entity/animal/panda/Panda$Gene;)V", cancellable = true)
    private void setMainGene__1167670727(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1167670727L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setHiddenGene(Lnet/minecraft/world/entity/animal/panda/Panda$Gene;)V", cancellable = true)
    private void setHiddenGene_1290840168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1290840168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHiddenGene()Lnet/minecraft/world/entity/animal/panda/Panda$Gene;", cancellable = true)
    private void getHiddenGene_1884184778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884184778L))
            info.setReturnValue(net.minecraft.world.entity.animal.panda.Panda.Gene.BROWN);
    }

    @Inject(at = @At("HEAD"), method = "setGeneFromParents(Lnet/minecraft/world/entity/animal/panda/Panda;Lnet/minecraft/world/entity/animal/panda/Panda;)V", cancellable = true)
    private void setGeneFromParents_2027691582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2027691582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMainGene()Lnet/minecraft/world/entity/animal/panda/Panda$Gene;", cancellable = true)
    private void getMainGene__227133991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-227133991L))
            info.setReturnValue(net.minecraft.world.entity.animal.panda.Panda.Gene.WORRIED);
    }

    @Inject(at = @At("HEAD"), method = "setSneezeCounter(I)V", cancellable = true)
    private void setSneezeCounter_686116371(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(686116371L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canPerformAction()Z", cancellable = true)
    private void canPerformAction__840021053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-840021053L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSitAmount(F)F", cancellable = true)
    private void getSitAmount_77392236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(77392236L))
            info.setReturnValue(1.714327E8F);
    }

    @Inject(at = @At("HEAD"), method = "getLieOnBackAmount(F)F", cancellable = true)
    private void getLieOnBackAmount_476704028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476704028L))
            info.setReturnValue(1.714327E8F);
    }

    @Inject(at = @At("HEAD"), method = "eat(Z)V", cancellable = true)
    private void eat_1013214408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1013214408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_667537207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(667537207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1758029701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1758029701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAggressive()Z", cancellable = true)
    private void isAggressive_1618992732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1618992732L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sneeze(Z)V", cancellable = true)
    private void sneeze_401608598(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(401608598L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1277880376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1277880376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSitting()Z", cancellable = true)
    private void isSitting_1632405352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632405352L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_503655655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(503655655L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setUnhappyCounter(I)V", cancellable = true)
    private void setUnhappyCounter_2032536502(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2032536502L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUnhappyCounter()I", cancellable = true)
    private void getUnhappyCounter__1430438802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1430438802L))
            info.setReturnValue(-2064678792);
    }

    @Inject(at = @At("HEAD"), method = "isScared()Z", cancellable = true)
    private void isScared_579016704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(579016704L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isRolling()Z", cancellable = true)
    private void isRolling__1836576369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1836576369L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isEating()Z", cancellable = true)
    private void isEating_1355724694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355724694L))
            info.setReturnValue(false);
    }


}
