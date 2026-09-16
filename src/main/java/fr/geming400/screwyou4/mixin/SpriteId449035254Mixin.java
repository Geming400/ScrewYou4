package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.SpriteId.class)
public class SpriteId449035254Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__459591014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-459591014L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1219458779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1219458779L))
            info.setReturnValue("k\u8B75q>A\u24E4jn*\uC30E\u3F8F 7wTf\u3837\u01BC\"m2!mLT\uC684veO&]qL\u7DB5.s77]gL-`p9R\u76F5\uCD0A%.#JKV)H\u11D589-l:yLZ[ViAAfLOy>\uF9FDHZ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1006387345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1006387345L))
            info.setReturnValue(1687614869);
    }

    @Inject(at = @At("HEAD"), method = "renderType(Ljava/util/function/Function;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void renderType_98058335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98058335L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atlasLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void atlasLocation_306195613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(306195613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void texture_1280236888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1280236888L))
            info.setReturnValue(null);
    }


}
