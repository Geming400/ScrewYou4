package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ServerLinks.UntrustedEntry.class)
public class UntrustedEntry1747586942Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void type__1724105067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1724105067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1161868095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1161868095L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_612126967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(612126967L))
            info.setReturnValue("ZPu<57'醽n;쌺y=>=Hh]曭]%5M3WS忟IpYᴧP5翦1慺[7j^$摳t9큅");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1785849684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1785849684L))
            info.setReturnValue(-432674134);
    }

    @Inject(at = @At("HEAD"), method = "link()Ljava/lang/String;", cancellable = true)
    private void link_612126471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(612126471L))
            info.setReturnValue("#");
    }


}
