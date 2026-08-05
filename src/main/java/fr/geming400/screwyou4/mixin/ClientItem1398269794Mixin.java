package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ClientItem.class)
public class ClientItem1398269794Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1511185243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1511185243L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_262809819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262809819L))
            info.setReturnValue("ji^6>\"|A`L*A|\uC1CC0o,fbn,|::p[8$]T [bwi<Com\"E\"XmcQzSJ\uD6B2\uC3F1ZRXXA\uA2CFTb\uB97FrJfpE17V0\u0A2AhV) \u81B4UkgGo1o*FL9 X9NM*LPxl");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1436532536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1436532536L))
            info.setReturnValue(2062471951);
    }

    @Inject(at = @At("HEAD"), method = "properties()Lnet/minecraft/client/renderer/item/ClientItem$Properties;", cancellable = true)
    private void properties__1057256713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1057256713L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private void model_1525388812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1525388812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registrySwapper()Lnet/minecraft/util/RegistryContextSwapper;", cancellable = true)
    private void registrySwapper_196756117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(196756117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withRegistrySwapper(Lnet/minecraft/util/RegistryContextSwapper;)Lnet/minecraft/client/renderer/item/ClientItem;", cancellable = true)
    private void withRegistrySwapper_829342350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(829342350L))
            info.setReturnValue(null);
    }


}
