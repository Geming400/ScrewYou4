package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ModelRenderProperties.class)
public class ModelRenderProperties_973438156Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1936016882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1936016882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__162021820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-162021820L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1011700897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011700897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transforms()Lnet/minecraft/client/resources/model/cuboid/ItemTransforms;", cancellable = true)
    private void transforms_1507670634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1507670634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "particleMaterial()Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void particleMaterial__1226612607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1226612607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyToLayer(Lnet/minecraft/client/renderer/item/ItemStackRenderState$LayerRenderState;Lnet/minecraft/world/item/ItemDisplayContext;)V", cancellable = true)
    private void applyToLayer_569763043(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(569763043L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromResolvedModel(Lnet/minecraft/client/resources/model/ModelBaker;Lnet/minecraft/client/resources/model/ResolvedModel;Lnet/minecraft/client/resources/model/sprite/TextureSlots;)Lnet/minecraft/client/renderer/item/ModelRenderProperties;", cancellable = true)
    private static void fromResolvedModel__1339876689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1339876689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usesBlockLight()Z", cancellable = true)
    private void usesBlockLight_1011716738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011716738L))
            info.setReturnValue(null);
    }


}
