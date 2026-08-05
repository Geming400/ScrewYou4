package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PlayerSkinRenderCache.class)
public class PlayerSkinRenderCache2004450304Mixin {
        @Inject(at = @At("HEAD"), method = "lookup(Lnet/minecraft/world/item/component/ResolvableProfile;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void lookup_320865921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(320865921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrDefault(Lnet/minecraft/world/item/component/ResolvableProfile;)Lnet/minecraft/client/renderer/PlayerSkinRenderCache$RenderInfo;", cancellable = true)
    private void getOrDefault_338318346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(338318346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLookup(Lnet/minecraft/world/item/component/ResolvableProfile;)Ljava/util/function/Supplier;", cancellable = true)
    private void createLookup_1396401601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1396401601L))
            info.setReturnValue(null);
    }


}
