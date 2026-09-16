package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.Damaged.class)
public class Damaged1651799031Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get_1782921607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1782921607L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_256548377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(256548377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_743172763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(743172763L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1872744740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1872744740L))
            info.setReturnValue("fE&GDSj%%zf6Pap2rwX(V_w$|{\uFB29%DJNUWa\u2C90 [:]9+\u58D3M1c[6\u9275f\u9B51D\u2C18KC/AK5\u20A2\uAD6A`d*V}K6aK\uC369JW");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2085816174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2085816174L))
            info.setReturnValue(1248049194);
    }


}
