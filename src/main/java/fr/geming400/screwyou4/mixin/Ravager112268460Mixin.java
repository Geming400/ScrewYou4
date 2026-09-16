package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Ravager.class)
public class Ravager112268460Mixin {
        @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1743566027(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1743566027L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasLineOfSight(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void hasLineOfSight__1696756044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1696756044L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_866016576(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(866016576L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1487370450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487370450L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget_1027927606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1027927606L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot_620715302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(620715302L))
            info.setReturnValue(-379504636);
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnObstruction(Lnet/minecraft/world/level/LevelReader;)Z", cancellable = true)
    private void checkSpawnObstruction_943750940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943750940L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getStunnedTick()I", cancellable = true)
    private void getStunnedTick_1511858488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511858488L))
            info.setReturnValue(1330158744);
    }

    @Inject(at = @At("HEAD"), method = "getAttackTick()I", cancellable = true)
    private void getAttackTick_1816045431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816045431L))
            info.setReturnValue(-839521745);
    }

    @Inject(at = @At("HEAD"), method = "getRoarTick()I", cancellable = true)
    private void getRoarTick__209476655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-209476655L))
            info.setReturnValue(-1188695413);
    }

    @Inject(at = @At("HEAD"), method = "applyRaidBuffs(Lnet/minecraft/server/level/ServerLevel;IZ)V", cancellable = true)
    private void applyRaidBuffs__860203687(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-860203687L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCelebrateSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getCelebrateSound_1725675792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1725675792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeLeader()Z", cancellable = true)
    private void canBeLeader__590354233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590354233L))
            info.setReturnValue(false);
    }


}
