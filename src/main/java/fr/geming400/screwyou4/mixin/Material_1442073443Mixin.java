package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.Material.class)
public class Material_1442073443Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1467381595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1467381595L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_306613467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(306613467L))
            info.setReturnValue("kCmKLwSd l_27(HD룚-8Dwm燪I}v0tU%vD@(8v->/B,hN7*0nq-⢌P綔I5j(6*m>M.Rsh8hnB5j0Dn4⛞`38m햎屬uTm");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1480336184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1480336184L))
            info.setReturnValue(808697898);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void sprite__1000993111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1000993111L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withForceTranslucent(Z)Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private void withForceTranslucent__65446507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-65446507L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forceTranslucent()Z", cancellable = true)
    private void forceTranslucent_1480352025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1480352025L))
            info.setReturnValue(true);
    }


}
