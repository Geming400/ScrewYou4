package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.atlas.sources.SourceFilter.class)
public class SourceFilter_1295372319Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/client/renderer/texture/atlas/SpriteSource$Output;)V", cancellable = true)
    private void run__591774224(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-591774224L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1614082719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1614082719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_159912343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(159912343L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1333635060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1333635060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filter()Lnet/minecraft/util/IdentifierPattern;", cancellable = true)
    private void filter_40983294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(40983294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1263741254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1263741254L))
            info.setReturnValue(null);
    }


}
