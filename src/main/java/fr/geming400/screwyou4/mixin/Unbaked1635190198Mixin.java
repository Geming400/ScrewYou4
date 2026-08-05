package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.EmptyModel.Unbaked.class)
public class Unbaked1635190198Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_239939544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(239939544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_726563930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726563930L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1889353573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1889353573L))
            info.setReturnValue("\u49E8{0q\u6DA1Dp=D\uA694@;D71_\u0A05u\u447E{lhc)n,\u85245 u%>rq1xqJqX'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2102425007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2102425007L))
            info.setReturnValue(-1149008438);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies__1584086815(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1584086815L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/item/ItemModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void bake__1902422684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1902422684L))
            info.setReturnValue(null);
    }


}
