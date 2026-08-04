package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ConditionalItemModel.Unbaked.class)
public class Unbaked_390249078Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_2126102801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126102801L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1775761336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1775761336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__745210898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-745210898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_428511819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(428511819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "property()Lnet/minecraft/client/renderer/item/properties/conditional/ConditionalItemModelProperty;", cancellable = true)
    private void property_985179001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(985179001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation_635710499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(635710499L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_340455147(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(340455147L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/item/ItemModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void bake_1823843978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823843978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onTrue()Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private void onTrue_517368095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(517368095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onFalse()Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private void onFalse_517368095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(517368095L))
            info.setReturnValue(null);
    }


}
