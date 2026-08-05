package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.IsSelected.class)
public class IsSelected_686398517Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get__1594517266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1594517266L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1872715056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1872715056L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2071910775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071910775L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__449061459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-449061459L))
            info.setReturnValue("kw!wq\u2EBET%yWsU\u9B96k\u40E2,8xT/Ia&VPq$uO1SO:r}s39^ Kj1N\"4@7V\u9B6A:?bExrc0jX`Gf<T?'cw-DoZ\uC7E4Z\uBD4F7>Ont\u162D}(n\u7F67.Xc6V");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_724661258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(724661258L))
            info.setReturnValue(804496231);
    }


}
