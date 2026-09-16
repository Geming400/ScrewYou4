package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Creeper.class)
public class Creeper_1062546144Mixin {
        @Inject(at = @At("HEAD"), method = "setTarget(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setTarget_1204951957(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1204951957L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_932862485(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(932862485L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxFallDistance()I", cancellable = true)
    private void getMaxFallDistance_1658554791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658554791L))
            info.setReturnValue(-98015426);
    }

    @Inject(at = @At("HEAD"), method = "causeFallDamage(DFLnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void causeFallDamage__1924313984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1924313984L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1857319163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857319163L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "killedEntity(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void killedEntity_1556296144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1556296144L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget_1978205289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1978205289L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "thunderHit(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LightningBolt;)V", cancellable = true)
    private void thunderHit_161473343(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(161473343L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ignite()V", cancellable = true)
    private void ignite__1838780344(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1838780344L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isIgnited()Z", cancellable = true)
    private void isIgnited__2025887482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2025887482L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPowered()Z", cancellable = true)
    private void isPowered__637441796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-637441796L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setSwellDir(I)V", cancellable = true)
    private void setSwellDir_140805913(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(140805913L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSwellDir()I", cancellable = true)
    private void getSwellDir_508054403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508054403L))
            info.setReturnValue(91287749);
    }

    @Inject(at = @At("HEAD"), method = "getSwelling(F)F", cancellable = true)
    private void getSwelling_1873345583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1873345583L))
            info.setReturnValue(1.949847E8F);
    }


}
