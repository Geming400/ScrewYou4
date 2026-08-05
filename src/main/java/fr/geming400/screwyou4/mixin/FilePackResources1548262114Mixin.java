package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.FilePackResources.class)
public class FilePackResources1548262114Mixin {
        @Inject(at = @At("HEAD"), method = "getResource(Lnet/minecraft/server/packs/PackType;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/server/packs/resources/IoSupplier;", cancellable = true)
    private void getResource__1482947744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482947744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__566313315(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-566313315L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNamespaces(Lnet/minecraft/server/packs/PackType;)Ljava/util/Set;", cancellable = true)
    private void getNamespaces__2121470487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2121470487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listResources(Lnet/minecraft/server/packs/PackType;Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/server/packs/PackResources$ResourceOutput;)V", cancellable = true)
    private void listResources_230996582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(230996582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractNamespace(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void extractNamespace__1865948759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1865948759L))
            info.setReturnValue("4g) f\u2AE6zYHTJ=2z-Jq#+9rT8\u0EA5P\u3A4F+anEE5]>f");
    }

    @Inject(at = @At("HEAD"), method = "getRootResource([Ljava/lang/String;)Lnet/minecraft/server/packs/resources/IoSupplier;", cancellable = true)
    private void getRootResource__1463846664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1463846664L))
            info.setReturnValue(null);
    }


}
