package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.api.MethodInfo.class)
public class MethodInfo_444374259Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__464252010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-464252010L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1214797783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1214797783L))
            info.setReturnValue("ARagkc \uA30D44vD4Q\uAD337YG\u8077zH(M3n`\uFEDFp@FUEs\u9B62t:EUUXGHUZAp\u66BC_MI");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1001726349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1001726349L))
            info.setReturnValue(-1298016031);
    }

    @Inject(at = @At("HEAD"), method = "result()Ljava/util/Optional;", cancellable = true)
    private void result__804483139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-804483139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "params()Ljava/util/Optional;", cancellable = true)
    private void params_1005999654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1005999654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description__729613449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-729613449L))
            info.setReturnValue("duP:8[($`>;<&i\u6E4BDir!-/2#r9RI( 9h@\uBA4Bfr{Ybr-C#A\uC0A8t\u7DB0{@W4J}q3(\u31CB3^ wlXd}T;\"\u9D69\"ZGkx");
    }

    @Inject(at = @At("HEAD"), method = "named(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/server/jsonrpc/api/MethodInfo$Named;", cancellable = true)
    private void named__1667296510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1667296510L))
            info.setReturnValue(null);
    }


}
