package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.CompositePackResources.class)
public class CompositePackResources_1944845519Mixin {
        @Inject(at = @At("HEAD"), method = "getResource(Lnet/minecraft/server/packs/PackType;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/server/packs/resources/IoSupplier;", cancellable = true)
    private void getResource_780866248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(780866248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/server/packs/PackLocationInfo;", cancellable = true)
    private void location__489167223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-489167223L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1983120257(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1983120257L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "listResources(Lnet/minecraft/server/packs/PackType;Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/server/packs/PackResources$ResourceOutput;)V", cancellable = true)
    private void listResources__820660903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-820660903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNamespaces(Lnet/minecraft/server/packs/PackType;)Ljava/util/Set;", cancellable = true)
    private void getNamespaces_453927783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(453927783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMetadataSection(Lnet/minecraft/server/packs/metadata/MetadataSectionType;)Ljava/lang/Object;", cancellable = true)
    private void getMetadataSection_1004337487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004337487L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getRootResource([Ljava/lang/String;)Lnet/minecraft/server/packs/resources/IoSupplier;", cancellable = true)
    private void getRootResource_1512093534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1512093534L))
            info.setReturnValue(null);
    }


}
