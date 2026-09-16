package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.permissions.Permission.Atom.class)
public class Atom_217457616Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__691168653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-691168653L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_987881140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(987881140L))
            info.setReturnValue(")o$!_LZ\u1056.DD!1H=gF]{NGS$p\u41B4em(PJ\u2843t\"05pmV^c\uBE63%n$\u39A1!V\u3BDD{\u793DiT\uB01BjX.;\uB2B1Hr#vx;3W");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_774809706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(774809706L))
            info.setReturnValue(1996750165);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id_1919647025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1919647025L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;)Lnet/minecraft/server/permissions/Permission$Atom;", cancellable = true)
    private static void create_1747108676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1747108676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/server/permissions/Permission$Atom;", cancellable = true)
    private static void create_621068166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(621068166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1283902869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1283902869L))
            info.setReturnValue(null);
    }


}
