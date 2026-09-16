package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ModelRenderProperties.class)
public class ModelRenderProperties_973438156Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_64811887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(64811887L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1743861680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1743861680L))
            info.setReturnValue("]s\u0BAABn\u6D7EtV4pPj\uB213g?{GC<Y5z(gC\u25F3ZbjmI7\u2888p,}YA0kO)\u5F73fYgL\u10FF@G]K\u44427Qu>}j\u52D3\uC5F5hQnrjzI\u6627/wXkPngdV#6tt&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1530790246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1530790246L))
            info.setReturnValue(-366267972);
    }

    @Inject(at = @At("HEAD"), method = "transforms()Lnet/minecraft/client/resources/model/cuboid/ItemTransforms;", cancellable = true)
    private void transforms_2043970801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2043970801L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usesBlockLight()Z", cancellable = true)
    private void usesBlockLight_695101997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(695101997L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "particleMaterial()Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void particleMaterial__499332530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-499332530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromResolvedModel(Lnet/minecraft/client/resources/model/ModelBaker;Lnet/minecraft/client/resources/model/ResolvedModel;Lnet/minecraft/client/resources/model/sprite/TextureSlots;)Lnet/minecraft/client/renderer/item/ModelRenderProperties;", cancellable = true)
    private static void fromResolvedModel__639820408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-639820408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyToLayer(Lnet/minecraft/client/renderer/item/ItemStackRenderState$LayerRenderState;Lnet/minecraft/world/item/ItemDisplayContext;)V", cancellable = true)
    private void applyToLayer__17338069(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-17338069L))
            info.cancel();
    }


}
