package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.SelectItemModel.UnbakedSwitch.class)
public class UnbakedSwitch1952886918Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1044260650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1044260650L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1571656853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1571656853L))
            info.setReturnValue("rWk'^H_l|@0`$f\u2786;@\uAFAAup&M\u5C46]\uD380W!W>\u2997\uA948*-*\u3257\u16921ZH^;gC1:\u8F7CC\u9470O\u4D0Bz.zhoV\u511F{\u0489,\u26DBUDI\"VBt}]z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1784728287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1784728287L))
            info.setReturnValue(847946811);
    }

    @Inject(at = @At("HEAD"), method = "property()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty;", cancellable = true)
    private void property_1236142993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236142993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cases()Ljava/util/List;", cancellable = true)
    private void cases__2141435271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2141435271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies__1266390095(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1266390095L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/item/ItemModel$BakingContext;Lorg/joml/Matrix4fc;Lnet/minecraft/client/renderer/item/ItemModel;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void bake_1008580539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1008580539L))
            info.setReturnValue(null);
    }


}
