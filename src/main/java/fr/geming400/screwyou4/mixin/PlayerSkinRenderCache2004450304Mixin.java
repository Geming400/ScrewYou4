package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PlayerSkinRenderCache.class)
public class PlayerSkinRenderCache2004450304Mixin {
        @Inject(at = @At("HEAD"), method = "lookup(Lnet/minecraft/world/item/component/ResolvableProfile;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void lookup_2142768007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142768007L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrDefault(Lnet/minecraft/world/item/component/ResolvableProfile;)Lnet/minecraft/client/renderer/PlayerSkinRenderCache$RenderInfo;", cancellable = true)
    private void getOrDefault__768697886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-768697886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLookup(Lnet/minecraft/world/item/component/ResolvableProfile;)Ljava/util/function/Supplier;", cancellable = true)
    private void createLookup__68245481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-68245481L))
            info.setReturnValue(null);
    }


}
