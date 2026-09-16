package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.api.SchemaComponent.class)
public class SchemaComponent1179040062Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_1988307218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1988307218L))
            info.setReturnValue("k'(!qT%{kbxL> 6AkD, MO}HXD9H}3!b>/<*");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_270413794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(270413794L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1949463587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1949463587L))
            info.setReturnValue(";AQE2aet\uFF86se\u89B6M;y4xAN\u4223K(<j+8qQ#2uPS^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1736392153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1736392153L))
            info.setReturnValue(-512232968);
    }

    @Inject(at = @At("HEAD"), method = "ref()Ljava/net/URI;", cancellable = true)
    private void ref__1617902542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1617902542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asArray()Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private void asArray__1781533349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781533349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "schema()Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private void schema__2095067327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2095067327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asRef()Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private void asRef__323857951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-323857951L))
            info.setReturnValue(null);
    }


}
