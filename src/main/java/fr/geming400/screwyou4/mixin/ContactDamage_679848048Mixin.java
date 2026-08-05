package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.SulfurCubeArchetype.ContactDamage.class)
public class ContactDamage_679848048Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2065360306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2065360306L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__455611928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-455611928L))
            info.setReturnValue("$ 31qq=槬9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_718110789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(718110789L))
            info.setReturnValue(1920984260);
    }

    @Inject(at = @At("HEAD"), method = "amount()Lnet/minecraft/util/valueproviders/FloatProvider;", cancellable = true)
    private void amount_1613067627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1613067627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributeToSource()Z", cancellable = true)
    private void attributeToSource_718126630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(718126630L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "damageType()Lnet/minecraft/core/Holder;", cancellable = true)
    private void damageType__2066243477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2066243477L))
            info.setReturnValue(null);
    }


}
