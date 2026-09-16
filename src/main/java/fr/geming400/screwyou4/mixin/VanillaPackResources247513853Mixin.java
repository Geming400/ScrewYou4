package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.VanillaPackResources.class)
public class VanillaPackResources247513853Mixin {
        @Inject(at = @At("HEAD"), method = "getResource(Lnet/minecraft/server/packs/PackType;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/server/packs/resources/IoSupplier;", cancellable = true)
    private void getResource_1511271291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511271291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/server/packs/PackLocationInfo;", cancellable = true)
    private void location__1419943517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1419943517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1867061576(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1867061576L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "asProvider()Lnet/minecraft/server/packs/resources/ResourceProvider;", cancellable = true)
    private void asProvider_1318050280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1318050280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listRawPaths(Lnet/minecraft/server/packs/PackType;Lnet/minecraft/resources/Identifier;Ljava/util/function/Consumer;)V", cancellable = true)
    private void listRawPaths_680374039(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(680374039L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNamespaces(Lnet/minecraft/server/packs/PackType;)Ljava/util/Set;", cancellable = true)
    private void getNamespaces_872748548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872748548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMetadataSection(Lnet/minecraft/server/packs/metadata/MetadataSectionType;)Ljava/lang/Object;", cancellable = true)
    private void getMetadataSection__78371586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-78371586L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "listResources(Lnet/minecraft/server/packs/PackType;Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/server/packs/PackResources$ResourceOutput;)V", cancellable = true)
    private void listResources__1069751679(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1069751679L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRootResource([Ljava/lang/String;)Lnet/minecraft/server/packs/resources/IoSupplier;", cancellable = true)
    private void getRootResource_1530372371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1530372371L))
            info.setReturnValue(null);
    }


}
