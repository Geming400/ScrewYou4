package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.Resource.class)
public class Resource_349433716Mixin {
        @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/server/packs/PackResources;", cancellable = true)
    private void source__340832606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-340832606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "open()Ljava/io/InputStream;", cancellable = true)
    private void open_696537065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(696537065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "metadata()Lnet/minecraft/server/packs/resources/ResourceMetadata;", cancellable = true)
    private void metadata__750908797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-750908797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openAsReader()Ljava/io/BufferedReader;", cancellable = true)
    private void openAsReader__6574173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-6574173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knownPackInfo()Ljava/util/Optional;", cancellable = true)
    private void knownPackInfo_594895137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(594895137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sourcePackId()Ljava/lang/String;", cancellable = true)
    private void sourcePackId__786026756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-786026756L))
            info.setReturnValue(null);
    }


}
