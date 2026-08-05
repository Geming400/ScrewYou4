package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.MinecraftServer.ServerResourcePackInfo.class)
public class ServerResourcePackInfo_97724856Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1483237114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1483237114L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1037735120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1037735120L))
            info.setReturnValue("騛!*4lGHJju)a猀꓄x");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_135987597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135987597L))
            info.setReturnValue(530552900);
    }

    @Inject(at = @At("HEAD"), method = "hash()Ljava/lang/String;", cancellable = true)
    private void hash__1037735616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1037735616L))
            info.setReturnValue("ZyP}!^^gc0x*A(Vj1B{KGr\"(W:䝴TkqIu8l4iPxG&peW)tU]fwxرX\"");
    }

    @Inject(at = @At("HEAD"), method = "url()Ljava/lang/String;", cancellable = true)
    private void url__1037735616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1037735616L))
            info.setReturnValue("ZyP}!^^gc0x*A(Vj1B{KGr\"(W:䝴TkqIu8l4iPxG&peW)tU]fwxرX\"");
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/UUID;", cancellable = true)
    private void id_508859338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508859338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prompt()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void prompt__2079184310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2079184310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRequired()Z", cancellable = true)
    private void isRequired_136003438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(136003438L))
            info.setReturnValue(true);
    }


}
