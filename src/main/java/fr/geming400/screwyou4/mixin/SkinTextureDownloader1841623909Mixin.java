package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.SkinTextureDownloader.class)
public class SkinTextureDownloader1841623909Mixin {
        @Inject(at = @At("HEAD"), method = "downloadAndRegisterSkin(Lnet/minecraft/resources/Identifier;Ljava/nio/file/Path;Ljava/lang/String;Z)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void downloadAndRegisterSkin_530134010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530134010L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
