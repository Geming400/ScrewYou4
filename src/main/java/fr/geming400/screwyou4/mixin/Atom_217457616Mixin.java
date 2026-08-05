package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.permissions.Permission.Atom.class)
public class Atom_217457616Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1602969874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1602969874L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__918002360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-918002360L))
            info.setReturnValue("6$PoTSy#ᛵ{+}v2&ᡊ['`:Jc$MQ@o厭mJ+M쥱co`fe¦1k>OnT");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_255720357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(255720357L))
            info.setReturnValue(-881834669);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id_2069358358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2069358358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;)Lnet/minecraft/server/permissions/Permission$Atom;", cancellable = true)
    private static void create_900054600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(900054600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/server/permissions/Permission$Atom;", cancellable = true)
    private static void create__1702329974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1702329974L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1953311339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1953311339L))
            info.setReturnValue(null);
    }


}
