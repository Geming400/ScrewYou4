package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.golem.SnowGolem.class)
public class SnowGolem_668910117Mixin {
        @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__1994759613(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1994759613L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_2044012106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2044012106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSensitiveToWater()Z", cancellable = true)
    private void isSensitiveToWater__2077333333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2077333333L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shear(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/sounds/SoundSource;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void shear_394268392(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(394268392L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readyForShearing()Z", cancellable = true)
    private void readyForShearing_133608084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(133608084L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "performRangedAttack(Lnet/minecraft/world/entity/LivingEntity;F)V", cancellable = true)
    private void performRangedAttack_2051843629(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2051843629L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__2085874237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2085874237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPumpkin(Z)V", cancellable = true)
    private void setPumpkin_860333319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(860333319L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasPumpkin()Z", cancellable = true)
    private void hasPumpkin__1817210579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1817210579L))
            info.setReturnValue(true);
    }


}
