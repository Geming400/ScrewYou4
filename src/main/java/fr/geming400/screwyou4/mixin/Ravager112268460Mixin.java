package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Ravager.class)
public class Ravager112268460Mixin {
        @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_150543199(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(150543199L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget_1756308171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1756308171L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1319720785(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1319720785L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__587949985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-587949985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasLineOfSight(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void hasLineOfSight__339452356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-339452356L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnObstruction(Lnet/minecraft/world/level/LevelReader;)Z", cancellable = true)
    private void checkSpawnObstruction_1149422671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1149422671L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot_150530706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(150530706L))
            info.setReturnValue(1751621170);
    }

    @Inject(at = @At("HEAD"), method = "getAttackTick()I", cancellable = true)
    private void getAttackTick_150530706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(150530706L))
            info.setReturnValue(1751621170);
    }

    @Inject(at = @At("HEAD"), method = "getStunnedTick()I", cancellable = true)
    private void getStunnedTick_150530706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(150530706L))
            info.setReturnValue(1751621170);
    }

    @Inject(at = @At("HEAD"), method = "getRoarTick()I", cancellable = true)
    private void getRoarTick_150530706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(150530706L))
            info.setReturnValue(1751621170);
    }

    @Inject(at = @At("HEAD"), method = "getCelebrateSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getCelebrateSound_1202481358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1202481358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyRaidBuffs(Lnet/minecraft/server/level/ServerLevel;IZ)V", cancellable = true)
    private void applyRaidBuffs_1351232417(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1351232417L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canBeLeader()Z", cancellable = true)
    private void canBeLeader_150547043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(150547043L))
            info.setReturnValue(true);
    }


}
