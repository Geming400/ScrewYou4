package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.item.Constant.class)
public class Constant_817710972Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1741402601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1741402601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value_855973217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(855973217L))
            info.setReturnValue(-1570786096);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2091744066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2091744066L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__317749004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-317749004L))
            info.setReturnValue("I #D*mZQ5*\u85CFu\u41D8mJOrbGj)u;ofJ<o`9;j4tH?W\u6C8Adk`h72hs}>V}fs]_k");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_855973713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(855973713L))
            info.setReturnValue(-1749309585);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void calculate_161397745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(161397745L))
            info.setReturnValue(170551600);
    }


}
