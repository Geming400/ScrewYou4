package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.dolphin.Dolphin.class)
public class Dolphin_48195568Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick__81488091(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-81488091L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1423297557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1423297557L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_1043406859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1043406859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAgeScale()F", cancellable = true)
    private void getAgeScale__588020175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-588020175L))
            info.setReturnValue(6.696787E8F);
    }

    @Inject(at = @At("HEAD"), method = "playAttackSound()V", cancellable = true)
    private void playAttackSound_54685359(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(54685359L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed__1899876547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1899876547L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_801943683(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(801943683L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxAirSupply()I", cancellable = true)
    private void getMaxAirSupply_1035855978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1035855978L))
            info.setReturnValue(-1817372419);
    }

    @Inject(at = @At("HEAD"), method = "canAttack(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void canAttack__1413364594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1413364594L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadXRot()I", cancellable = true)
    private void getMaxHeadXRot__1930870424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1930870424L))
            info.setReturnValue(-766129282);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_188079667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(188079667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/dolphin/Dolphin;", cancellable = true)
    private void getBreedOffspring_2128289696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2128289696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot_556642409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(556642409L))
            info.setReturnValue(-1415480115);
    }

    @Inject(at = @At("HEAD"), method = "getMoistnessLevel()I", cancellable = true)
    private void getMoistnessLevel_1208172794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1208172794L))
            info.setReturnValue(1756969325);
    }

    @Inject(at = @At("HEAD"), method = "setMoisntessLevel(I)V", cancellable = true)
    private void setMoisntessLevel__1343542802(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1343542802L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_798293876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(798293876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setGotFish(Z)V", cancellable = true)
    private void setGotFish_613745518(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(613745518L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "gotFish()Z", cancellable = true)
    private void gotFish__116905182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-116905182L))
            info.setReturnValue(true);
    }


}
