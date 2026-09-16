package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.Resource.class)
public class Resource_349433716Mixin {
        @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/server/packs/PackResources;", cancellable = true)
    private void source__1112817795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1112817795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "open()Ljava/io/InputStream;", cancellable = true)
    private void open__688328481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-688328481L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "metadata()Lnet/minecraft/server/packs/resources/ResourceMetadata;", cancellable = true)
    private void metadata_2069497332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2069497332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knownPackInfo()Ljava/util/Optional;", cancellable = true)
    private void knownPackInfo__1096638997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096638997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sourcePackId()Ljava/lang/String;", cancellable = true)
    private void sourcePackId__1139915061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1139915061L))
            info.setReturnValue("N/V-U1n\u1EC5RV,c<rVb\uCECE0T'])IX#jry{\u2FC77}pV\u8CCEf}qSL@CJ\"'3mHDM%;l6`Fbn");
    }

    @Inject(at = @At("HEAD"), method = "openAsReader()Ljava/io/BufferedReader;", cancellable = true)
    private void openAsReader__296267998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-296267998L))
            info.setReturnValue(null);
    }


}
