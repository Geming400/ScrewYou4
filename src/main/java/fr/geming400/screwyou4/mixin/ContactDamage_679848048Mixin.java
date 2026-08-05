package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.SulfurCubeArchetype.ContactDamage.class)
public class ContactDamage_679848048Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__228778221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-228778221L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1450271572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1450271572L))
            info.setReturnValue("}Xz");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1237200138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1237200138L))
            info.setReturnValue(1713987471);
    }

    @Inject(at = @At("HEAD"), method = "amount()Lnet/minecraft/util/valueproviders/FloatProvider;", cancellable = true)
    private void amount_632335379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(632335379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "damageType()Lnet/minecraft/core/Holder;", cancellable = true)
    private void damageType_494712834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(494712834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributeToSource()Z", cancellable = true)
    private void attributeToSource__1033691084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1033691084L))
            info.setReturnValue(true);
    }


}
