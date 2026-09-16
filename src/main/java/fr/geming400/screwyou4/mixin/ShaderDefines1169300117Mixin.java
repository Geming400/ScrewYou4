package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.ShaderDefines.class)
public class ShaderDefines1169300117Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_260673849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(260673849L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1939723642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939723642L))
            info.setReturnValue("q+b[vUT)ML]<,0{uDX^J\uD6820/>*\u155D5\u8769#!u_K:&?hbBA1\uCDD3k\u1DF5N 2IVn");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/Map;", cancellable = true)
    private void values_120042779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(120042779L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flags()Ljava/util/Set;", cancellable = true)
    private void flags__1507681584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1507681584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1726652208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1726652208L))
            info.setReturnValue(-658262609);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__2066550807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2066550807L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/client/renderer/ShaderDefines$Builder;", cancellable = true)
    private static void builder__25415832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-25415832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOverrides(Lnet/minecraft/client/renderer/ShaderDefines;)Lnet/minecraft/client/renderer/ShaderDefines;", cancellable = true)
    private void withOverrides_780268739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(780268739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asSourceDirectives()Ljava/lang/String;", cancellable = true)
    private void asSourceDirectives_2126201903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126201903L))
            info.setReturnValue("c+PZS\uA8BAff\u9E333/Y\uBD8AmSLV\uD3DF<[kwThE*0WjZ\u8B45\uAA92xA\u42F7z\u5505/");
    }


}
