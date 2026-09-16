package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ClientItem.class)
public class ClientItem1398269794Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_489643526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(489643526L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2126273977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2126273977L))
            info.setReturnValue("0B\uC39CPdY<,dGmfkG3WJC\uC01E\u0562\uD6FEYoJ0L9$c!T\"?aq!;N\uBEA9<{FEOh");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1955621885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1955621885L))
            info.setReturnValue(1170091039);
    }

    @Inject(at = @At("HEAD"), method = "properties()Lnet/minecraft/client/renderer/item/ClientItem$Properties;", cancellable = true)
    private void properties_41398506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(41398506L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private void model__1740792843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1740792843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registrySwapper()Lnet/minecraft/util/RegistryContextSwapper;", cancellable = true)
    private void registrySwapper__1618257080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1618257080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withRegistrySwapper(Lnet/minecraft/util/RegistryContextSwapper;)Lnet/minecraft/client/renderer/item/ClientItem;", cancellable = true)
    private void withRegistrySwapper__821325227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-821325227L))
            info.setReturnValue(null);
    }


}
