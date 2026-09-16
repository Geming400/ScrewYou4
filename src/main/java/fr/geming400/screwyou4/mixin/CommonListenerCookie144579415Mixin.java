package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.CommonListenerCookie.class)
public class CommonListenerCookie144579415Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__764046853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764046853L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_915002940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(915002940L))
            info.setReturnValue("`= F \uA88E\u0D8FU(WC\u6BB2RVa)V4g?u-8^q7\u7B0DRZ\u85BC}FQ;\u2263RBBv\u29F0|7&O\u18A6%\u3F625Ja=7nv^\uBD02\u533F4LE,V_9T\u7399'764+&#bF");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_701931506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701931506L))
            info.setReturnValue(-2046259862);
    }

    @Inject(at = @At("HEAD"), method = "transferred()Z", cancellable = true)
    private void transferred_1361692680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1361692680L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "latency()I", cancellable = true)
    private void latency__888466689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-888466689L))
            info.setReturnValue(-204174398);
    }

    @Inject(at = @At("HEAD"), method = "gameProfile()Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private void gameProfile_1341569478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1341569478L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clientInformation()Lnet/minecraft/server/level/ClientInformation;", cancellable = true)
    private void clientInformation_1113279336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1113279336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createInitial(Lcom/mojang/authlib/GameProfile;Z)Lnet/minecraft/server/network/CommonListenerCookie;", cancellable = true)
    private static void createInitial__1899650096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1899650096L))
            info.setReturnValue(null);
    }


}
