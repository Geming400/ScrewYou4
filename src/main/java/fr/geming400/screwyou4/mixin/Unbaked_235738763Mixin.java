package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.SkullSpecialRenderer.Unbaked.class)
public class Unbaked_235738763Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1159511892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1159511892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__672887506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-672887506L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1006162287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1006162287L))
            info.setReturnValue("k<Lr>\u9E07/[FyY\u04EE[\uBBEFaW}_s=4OtqLAbauXZ\u88AE[`df\u687B4nki<\u82DEmu\u870F\u6C7FrmM\u8B96\u2B7FJNuim/.q\uD215Ljc$w\uA6B3re;b3(y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_793090853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(793090853L))
            info.setReturnValue(-1625906131);
    }

    @Inject(at = @At("HEAD"), method = "kind()Lnet/minecraft/world/level/block/SkullBlock$Type;", cancellable = true)
    private void kind_40529418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(40529418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake_1408541143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1408541143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SkullSpecialRenderer;", cancellable = true)
    private void bake_737070571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(737070571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animation()F", cancellable = true)
    private void animation__1264429015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1264429015L))
            info.setReturnValue(2.708301E8F);
    }

    @Inject(at = @At("HEAD"), method = "textureOverride()Ljava/util/Optional;", cancellable = true)
    private void textureOverride_1283763519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1283763519L))
            info.setReturnValue(null);
    }


}
