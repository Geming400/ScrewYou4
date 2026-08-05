package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.api.MethodInfo.Named.class)
public class Named_281476726Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void name_2133377468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2133377468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1666988984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1666988984L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__853983250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-853983250L))
            info.setReturnValue("\u31C6\u0223");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_319739467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(319739467L))
            info.setReturnValue(724882192);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/server/jsonrpc/api/MethodInfo;", cancellable = true)
    private void contents__392944597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-392944597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "typedCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void typedCodec__110488653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-110488653L))
            info.setReturnValue(null);
    }


}
