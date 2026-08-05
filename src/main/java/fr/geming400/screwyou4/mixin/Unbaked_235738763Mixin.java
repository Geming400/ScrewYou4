package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.SkullSpecialRenderer.Unbaked.class)
public class Unbaked_235738763Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_1971592486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1971592486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1621251021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621251021L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__899721213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-899721213L))
            info.setReturnValue("|4Fo鐅H쌽0fMb'_J_i,n쮈1*|&(kM)繚>s@2}\");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_274001504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(274001504L))
            info.setReturnValue(-1844950905);
    }

    @Inject(at = @At("HEAD"), method = "kind()Lnet/minecraft/world/level/block/SkullBlock$Type;", cancellable = true)
    private void kind__649554658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-649554658L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake__1452284098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1452284098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SkullSpecialRenderer;", cancellable = true)
    private void bake__2123754670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123754670L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureOverride()Ljava/util/Optional;", cancellable = true)
    private void textureOverride_481200184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(481200184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animation()F", cancellable = true)
    private void animation_273998125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(273998125L))
            info.setReturnValue(1.165381E8F);
    }


}
