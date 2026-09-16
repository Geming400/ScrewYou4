package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.IsCarried.class)
public class IsCarried332769602Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get_463892178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(463892178L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1062481052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1062481052L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__575856666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-575856666L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1103193127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1103193127L))
            info.setReturnValue("BiLJ\uAAF2S(>H:\"ZOl\u75B8;'K_'T6q$xY8A}\u81D0\u17D1$!\u759F-(%O0Z\u4002/\u7AF0xteAR/fB");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_890121693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(890121693L))
            info.setReturnValue(1994690820);
    }


}
