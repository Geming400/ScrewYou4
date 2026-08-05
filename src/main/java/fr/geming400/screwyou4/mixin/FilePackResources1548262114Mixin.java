package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.FilePackResources.class)
public class FilePackResources1548262114Mixin {
        @Inject(at = @At("HEAD"), method = "getResource(Lnet/minecraft/server/packs/PackType;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/server/packs/resources/IoSupplier;", cancellable = true)
    private void getResource_384282844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(384282844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1586536853(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1586536853L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractNamespace(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void extractNamespace__509825969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-509825969L))
            info.setReturnValue("0]\uC3C5d ?!}\u2C91v%NA\uC932yz`");
    }

    @Inject(at = @At("HEAD"), method = "getNamespaces(Lnet/minecraft/server/packs/PackType;)Ljava/util/Set;", cancellable = true)
    private void getNamespaces_57344379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(57344379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listResources(Lnet/minecraft/server/packs/PackType;Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/server/packs/PackResources$ResourceOutput;)V", cancellable = true)
    private void listResources__1217244307(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1217244307L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRootResource([Ljava/lang/String;)Lnet/minecraft/server/packs/resources/IoSupplier;", cancellable = true)
    private void getRootResource_1115510130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1115510130L))
            info.setReturnValue(null);
    }


}
