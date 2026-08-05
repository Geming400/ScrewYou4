package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.golem.SnowGolem.class)
public class SnowGolem_668910117Mixin {
        @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_707184855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(707184855L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSensitiveToWater()Z", cancellable = true)
    private void isSensitiveToWater_707188699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(707188699L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__31308329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-31308329L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "shear(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/sounds/SoundSource;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void shear_1146533225(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1146533225L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset_1766639645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1766639645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "performRangedAttack(Lnet/minecraft/world/entity/LivingEntity;F)V", cancellable = true)
    private void performRangedAttack_2075168285(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2075168285L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readyForShearing()Z", cancellable = true)
    private void readyForShearing_707188699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(707188699L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setPumpkin(Z)V", cancellable = true)
    private void setPumpkin_1898526945(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1898526945L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasPumpkin()Z", cancellable = true)
    private void hasPumpkin_707188699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(707188699L))
            info.setReturnValue(false);
    }


}
