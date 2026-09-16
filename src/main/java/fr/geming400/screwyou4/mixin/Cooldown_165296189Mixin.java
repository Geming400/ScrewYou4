package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.Cooldown.class)
public class Cooldown_165296189Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)F", cancellable = true)
    private void get__1323501052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1323501052L))
            info.setReturnValue(8.079172E8F);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1229954466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1229954466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__743330080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-743330080L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_935719713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(935719713L))
            info.setReturnValue("j\u8E1DX`[y\u5FB2aw!k!CPS:Af-gy\u9DADZ`Dsl?qg8,(\u22CCOB-q\u6369 e%id2g{mi<\u9D3Ed|Ik+m\uA0EB=jD!MLxa\uAAB2\u5FEEaPj");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_722648279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(722648279L))
            info.setReturnValue(-1400960809);
    }


}
