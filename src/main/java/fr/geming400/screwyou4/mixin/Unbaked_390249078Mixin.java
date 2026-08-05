package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ConditionalItemModel.Unbaked.class)
public class Unbaked_390249078Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1005001577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1005001577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__518377191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-518377191L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1160672602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1160672602L))
            info.setReturnValue("z/e\u6555L+5D?eug1\u62EFHv[G>$\u72D2hEk}rA,\u6809\uD585>2}rt?\u407D\u2D27:3\u1EBCS\u7F6E'sOpB\uA1CBg\uC3FE'c_Q8Tzel/p>vEhe$RC)\uFBEA,#}\u69C0r_YO5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_947601168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947601168L))
            info.setReturnValue(-749731367);
    }

    @Inject(at = @At("HEAD"), method = "property()Lnet/minecraft/client/renderer/item/properties/conditional/ConditionalItemModelProperty;", cancellable = true)
    private void property_410318798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(410318798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation_1588786220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1588786220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_1465939360(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1465939360L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/item/ItemModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void bake_1147603491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1147603491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onTrue()Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private void onTrue__1763328276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1763328276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onFalse()Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private void onFalse__595629405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-595629405L))
            info.setReturnValue(null);
    }


}
