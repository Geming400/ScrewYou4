package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.RangeSelectItemModel.Unbaked.class)
public class Unbaked398644375Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_2134498099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2134498099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1784156634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1784156634L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__736815600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-736815600L))
            info.setReturnValue("蓟FGD%'O<dP&82@輹1: _f4hOA<}'r8xspk%臹XUDp+[ Iy:V趩c9jUZv66(Rh_#y-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_436907117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(436907117L))
            info.setReturnValue(-221610495);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale_436903738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(436903738L))
            info.setReturnValue(3.852558E8F);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_2024981191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2024981191L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "property()Lnet/minecraft/client/renderer/item/properties/numeric/RangeSelectItemModelProperty;", cancellable = true)
    private void property__496306891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-496306891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallback()Ljava/util/Optional;", cancellable = true)
    private void fallback_644105797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(644105797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation_644105797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(644105797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_348850445(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(348850445L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/item/ItemModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void bake_1832239276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1832239276L))
            info.setReturnValue(null);
    }


}
