package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Vex.class)
public class Vex_2092693477Mixin {
        @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getOwner__1756691571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1756691571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getOwner__150780700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-150780700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOwner(Lnet/minecraft/world/entity/Mob;)V", cancellable = true)
    private void setOwner__1818407248(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1818407248L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1963009818(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1963009818L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFlapping()Z", cancellable = true)
    private void isFlapping_1982828170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1982828170L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__827171830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-827171830L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getOwnerReference()Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private void getOwnerReference_452277939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(452277939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "restoreFrom(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void restoreFrom__909155896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-909155896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBoundOrigin()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getBoundOrigin__1324744169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1324744169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIsCharging(Z)V", cancellable = true)
    private void setIsCharging_867105950(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(867105950L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1452175511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1452175511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLimitedLife(I)V", cancellable = true)
    private void setLimitedLife_1157262852(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1157262852L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBoundOrigin(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setBoundOrigin_1010596973(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1010596973L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isCharging()Z", cancellable = true)
    private void isCharging_1040900288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1040900288L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLightLevelDependentMagicValue()F", cancellable = true)
    private void getLightLevelDependentMagicValue__129190808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-129190808L))
            info.setReturnValue(8.352303E8F);
    }


}
